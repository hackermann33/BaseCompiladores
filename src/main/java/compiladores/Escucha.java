package compiladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import compiladores.compiladorParser.BloqueContext;
import compiladores.compiladorParser.Declaracion_parametroContext;
import compiladores.compiladorParser.DeclaradorContext;
import compiladores.compiladorParser.Definicion_funcionContext;
import compiladores.compiladorParser.Expresion_asignacionContext;
import compiladores.compiladorParser.Expresion_postfijaContext;
import compiladores.compiladorParser.Expresion_primariaContext;
import compiladores.compiladorParser.Init_declaradorContext;
import compiladores.compiladorParser.Lista_parametrosContext;
import compiladores.compiladorParser.ProgramaContext;
import compiladores.compiladorParser.SaltoContext;
import compiladores.compiladorParser.Specificador_tipoContext;
import compiladores.TablaSimbolos.Funcion;
import compiladores.TablaSimbolos.Helper;
import compiladores.TablaSimbolos.Id;
import compiladores.TablaSimbolos.Id.TipoDato;
import compiladores.TablaSimbolos.TablaSimbolos;
import compiladores.TablaSimbolos.Variable;
import compiladores.TablaSimbolos.Helper.EstadoReturn;

public class Escucha extends compiladorBaseListener {

    private int contexto = 0;
    private String tablaContextosStr = "";
    private TablaSimbolos ts;
    private Helper help;
    public boolean errors = false;

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        ts = TablaSimbolos.getInstanceOf();
        help = Helper.getInstanceOf();
        System.out.println("> comienza la compilacion");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        errors = help.errors;
        ts.imprimeWarnings();
        tablaContextosStr += "saliendo del programa." + "\n";

        tablaContextosStr += ts;
        try {
            FileWriter escritor = new FileWriter("tabla_contexto.txt");
            File f = new File("tabla_contexto.txt");
            escritor.write(tablaContextosStr);
            System.out.println(
                    "> archivo con tablas de símbolos guardado correctamente en \'" + f.getAbsolutePath() + "\'");
            escritor.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("> fin de la compilacion");
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        contexto++;
        ts.addContexto();
        tablaContextosStr += "[" + (contexto - 1) + " -> " + contexto + "] ";
        tablaContextosStr += "entrando en el nuevo contexto " + contexto + "\n";
        tablaContextosStr += ts + "\n";
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        tablaContextosStr += "[" + (contexto) + " -> " + (contexto - 1) + "] ";
        tablaContextosStr += "saliendo de contexto " + contexto + "\n";
        tablaContextosStr += ts + "\n";

        ts.imprimeWarnings();
        ts.delContexto();
        contexto--;

    }

    /*
     * Guardo el especificador de tipo de declaracion y de parametros
     */
    @Override
    public void exitSpecificador_tipo(Specificador_tipoContext ctx) {
        TipoDato res = TipoDato.valueOf(ctx.getStart().getText().toUpperCase());
        help.setLastSpecificador(res);
        super.exitSpecificador_tipo(ctx);
    }

    @Override
    public void exitExpresion_asignacion(Expresion_asignacionContext ctx) {
        Id id;
        if (ctx.ID() != null && (id = help.checkDeclarado(ctx, ctx.ID().toString())) != null) {
            if (id instanceof Funcion)
                help.printError(ctx, "función \'"
                        + id + "\' " + " no es asignable");
            else
                id.setInicializado(true);
        }
        super.exitExpresion_asignacion(ctx);
    }

    @Override
    public void exitExpresion_primaria(Expresion_primariaContext ctx) {
        Id id;
        if (ctx.ID() != null) {
            if ((id = help.checkDeclarado(ctx, ctx.ID().toString())) != null)
                id.setUsado(true);
        }
        super.exitExpresion_primaria(ctx);
    }

    @Override
    public void enterDefinicion_funcion(Definicion_funcionContext ctx) {
        help.setEsDefinicion(true);
        super.enterDefinicion_funcion(ctx);
    }

    @Override
    public void enterInit_declarador(Init_declaradorContext ctx) {
        help.startDeclaracion();
        super.enterInit_declarador(ctx);
    }

    @Override
    public void enterDeclarador(DeclaradorContext ctx) {
        if (ctx.children != null && ctx.children.size() >= 1) {
            help.initDeclaracionFuncion();
        }

        super.enterDeclarador(ctx);
    }

    @Override
    public void enterLista_parametros(Lista_parametrosContext ctx) {

        help.initDeclaracionParams();
        super.enterLista_parametros(ctx);
    }

    @Override
    public void exitLista_parametros(Lista_parametrosContext ctx) {
        if (ctx.children != null)
            help.endDeclaracionParams();
        super.exitLista_parametros(ctx);
    }

    @Override
    public void exitDeclarador(DeclaradorContext ctx) {
        help.exitDeclaracion(ctx, ctx.ID() != null ? ctx.ID().toString() : null);
        super.exitDeclarador(ctx);
    }

    @Override
    public void exitDefinicion_funcion(Definicion_funcionContext ctx) {
        help.setEsDefinicion(false);
        super.exitDefinicion_funcion(ctx);
    }

    @Override
    public void exitInit_declarador(Init_declaradorContext ctx) {
        help.saveLastId(ctx);

        super.exitInit_declarador(ctx);
    }

    String extractNombre(Declaracion_parametroContext dpctx) {
        return dpctx.declarador().getChild(0).toString();
    }

    TipoDato extractTipoDato(Declaracion_parametroContext dpctx) {
        return TipoDato.valueOf(dpctx.specificador_tipo().getChild(0).toString().toUpperCase());
    }

    // @Override
    // public void exitIteracion(IteracionContext ctx) {
    // if (ctx.FOR() != null) {
    // ts.delContexto();
    // contexto--;
    // }
    // super.exitIteracion(ctx);
    // }

    @Override
    public void exitExpresion_postfija(Expresion_postfijaContext ctx) {
        if (ctx.children.size() == 4) {
            String nombreFuncion = ctx.ID().getText();
            Id f = help.checkDeclarado(ctx, nombreFuncion);

            if (f != null) {

                if (f instanceof Variable)
                    help.printError(ctx, "objeto llamado de tipo \'" + f.getTipo().toString().toLowerCase()
                            + "\' no es una función");
                else if (help.checkParams(ctx, f))
                    f.setUsado(true);
            }

        } else if (ctx.children.size() > 1) { /* Operaciòn postfija o prefija */
            if (ctx.operador_prefijo() != null) {
                /*
                 * Si es incremento o decremento
                 */
                if (ctx.operador_prefijo().DEC_OP() != null || ctx.operador_prefijo().DEC_OP() != null) {
                    if ((ctx.expresion_primaria().ID()) != null) {
                        /* CHECK ID() es declarada y es variable */
                        String nombreVariabile = ctx.expresion_primaria().ID().getText();
                        help.checkIncremento(ctx, nombreVariabile);
                    } else
                        help.printError(ctx, "Sólo se puede incrementar o decrementar una variable");

                }
            } else if (ctx.operador_postfijo() != null) {

                String nombreVariable = ctx.ID().getText();
                help.checkIncremento(ctx, nombreVariable);
            }

        }
        super.exitExpresion_postfija(ctx);

    }

    @Override
    public void exitSalto(SaltoContext ctx) {
        if (ctx.RETURN() != null) {
            if (ctx.expresion() != null)
                help.setEstadoReturn(EstadoReturn.RET_VAL);
            else
                help.setEstadoReturn(EstadoReturn.RET_VOID);
            help.checkReturn(ctx);
        }

        super.exitSalto(ctx);
    }

}