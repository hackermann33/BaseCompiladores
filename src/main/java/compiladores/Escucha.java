package compiladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiladores.compiladorParser.BloqueContext;
import compiladores.compiladorParser.DeclaracionContext;
import compiladores.compiladorParser.Declaracion_parametroContext;
import compiladores.compiladorParser.DeclaradorContext;
import compiladores.compiladorParser.Definicion_funcionContext;
import compiladores.compiladorParser.Expresion_asignacionContext;
import compiladores.compiladorParser.Expresion_postfijaContext;
import compiladores.compiladorParser.Expresion_primariaContext;
import compiladores.compiladorParser.Init_declaradorContext;
import compiladores.compiladorParser.IteracionContext;
import compiladores.compiladorParser.Lista_parametrosContext;
import compiladores.compiladorParser.ProgramaContext;
import compiladores.compiladorParser.Specificador_tipoContext;
import compiladores.TablaSimbolos.Funcion;
import compiladores.TablaSimbolos.Helper;
import compiladores.TablaSimbolos.Id;
import compiladores.TablaSimbolos.Id.TipoDato;
import compiladores.TablaSimbolos.TablaSimbolos;
import compiladores.TablaSimbolos.Variable;

public class Escucha extends compiladorBaseListener {

    private int contexto = 0;
    private String tablaContextosStr = "";
    private TablaSimbolos ts;
    private boolean definicion = false;
    public boolean errors = false;
    List<Variable> params = new LinkedList<>();

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        ts = TablaSimbolos.getInstanceOf();
        System.out.println("> comienza la compilacion");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
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
        if (definicion) { /* TODO: non è possibile creare un contesto qui!!! C-standard */
            params.forEach((p) -> ts.addSimbolo(p));
            params.clear();
            definicion = false;
        }
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
        Helper.setSpecificadorActual(res);
        super.exitSpecificador_tipo(ctx);
    }

    /*
     * Saliendo do expresion_asignacion. El primer hijo, si es un ID, representa una
     * variable que se esta inicializando: Controllo
     * que la variable ya existes
     */
    @Override
    public void exitExpresion_asignacion(Expresion_asignacionContext ctx) {
        if (ctx.ID() != null)
            errors = Helper.checkAsignacion(ctx, ctx.ID().toString(), false);
        super.exitExpresion_asignacion(ctx);
    }

    @Override
    public void exitExpresion_primaria(Expresion_primariaContext ctx) {
        if (ctx.ID() != null)
            errors = Helper.checkAsignacion(ctx, ctx.ID().toString(), true);
        super.exitExpresion_primaria(ctx);
    }

    @Override
    public void exitInit_declarador(Init_declaradorContext ctx) {
        String nombreId = "";
        Id id;

        if (((DeclaradorContext) ctx.children.get(0)).ID() != null) {
            nombreId = ((DeclaradorContext) ctx.children.get(0)).ID().toString();
            id = new Variable(Helper.getSpecificadorActual(), nombreId);
            if (ctx.children.size() > 1)
                id.setInicializado(true);
        } else {
            nombreId = ((DeclaradorContext) ctx.getChild(0).getChild(0)).ID().toString();
            Funcion f = new Funcion(Helper.getSpecificadorActual(), nombreId);

            if (ctx.children.size() > 1) {
                Helper.printError(ctx, "la función \'" + nombreId
                        + "\' es inicializada como una variable");
            }

            /* Calcolo parametros */
            Lista_parametrosContext listaParametros = ((DeclaradorContext) ctx.getChild(0)).lista_parametros();

            TipoDato tipoParam = null;
            String nomeParam = "";

            if (listaParametros != null)
                addArgumentos(f, listaParametros);
            id = f;

            if (definicion) {
                f.setInicializado(true);
            }
        }

        if (ts.buscarSimboloLocal(nombreId) != null) {
            if (!definicion) {
                Helper.printError(ctx, "identificador " + "\'" + id.getNombre()
                        + "\' ya usado en esto contexto!");
            } else {
                definicion = false;
                Funcion f = (Funcion) ts.buscarSimboloLocal(nombreId);
                if (!f.getInicializado()) {
                    if (f.getArgs().equals(((Funcion) id).getArgs()))
                        f.setInicializado(true);
                    else {
                        Helper.printError(ctx, "tipos conflictivos para función \'"
                                + nombreId + "\'");
                    }
                } else {
                    Helper.printError(ctx, "redefinición de \'" + nombreId + "\'");
                }
            }
        } else {
            ts.addSimbolo(id);

        }

        super.exitInit_declarador(ctx);
    }

    private void addArgumentos(Funcion f, Lista_parametrosContext listaParametros) {
        if (listaParametros.declaracion_parametro() != null) {
            TipoDato tdArg = TipoDato
                    .valueOf(listaParametros.declaracion_parametro().specificador_tipo().getText().toUpperCase());
            String nombreArg = listaParametros.declaracion_parametro().declarador().ID().getText();
            Variable v = new Variable(tdArg, nombreArg);
            f.addArgumento(tdArg);
            params.add(v);
            if (listaParametros.lista_parametros() != null)
                addArgumentos(f, listaParametros.lista_parametros());
        }

    }

    String extractNombre(Declaracion_parametroContext dpctx) {
        return dpctx.declarador().getChild(0).toString();
    }

    TipoDato extractTipoDato(Declaracion_parametroContext dpctx) {
        return TipoDato.valueOf(dpctx.specificador_tipo().getChild(0).toString().toUpperCase());
    }

    @Override
    public void enterDefinicion_funcion(Definicion_funcionContext ctx) {
        definicion = true;
        super.enterDefinicion_funcion(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getText().equals("for")) { /* shortTo handle for contexts */
            ts.addContexto();
            contexto++;
        }
        super.visitTerminal(node);
    }

    @Override
    public void exitIteracion(IteracionContext ctx) {
        if (ctx.FOR() != null) {
            ts.delContexto();
            contexto--;
        }
        super.exitIteracion(ctx);
    }

    @Override
    public void exitExpresion_postfija(Expresion_postfijaContext ctx) {
        if (ctx.children.size() == 4) {
            String nombreFuncion = ctx.ID().getText();
            Id f;
            if ((f = ts.buscarSimbolo(nombreFuncion)) == null) {
                Helper.printError(ctx, "uso del identificador no declarado \'"
                        + nombreFuncion + "\' ");
            } else if (f instanceof Variable) {
                Helper.printError(ctx, "objeto llamado de tipo \'" + f.getTipo().toString().toLowerCase()
                        + "\' no es una función");
            } else {
                int nTokens = ctx.lista_parametros_expresiones().getSourceInterval().b
                        - ctx.lista_parametros_expresiones().getSourceInterval().a + 1;
                int nParams = nTokens > 0 ? nTokens / 2 + 1 : 0;
                int nParamsFunc = ((Funcion) f).getArgs().size();

                if (nParams > nParamsFunc)
                    Helper.printError(ctx,
                            String.format("demasiados argumentos para llamar a la función, esperaba %d, tiene %d",
                                    nParamsFunc, nParams));
                else if (nParams < nParamsFunc)
                    Helper.printError(ctx, String.format(
                            "demasiados pocos argumentos para llamar a la función, se esperaban %d, tienen %d",
                            nParamsFunc, nParams));
                else
                    f.setUsado(true);
            }
            super.exitExpresion_postfija(ctx);
        } else if (ctx.children.size() > 1) { /* Operaciòn postfija o prefija */
            String nombreVariable = ctx.ID().getText();
            Id var;
            if ((var = ts.buscarSimbolo(nombreVariable)) == null) {
                Helper.printError(ctx, "uso del identificador no declarado \'"
                        + nombreVariable + "\' ");
            } else if (var instanceof Funcion) {
                Helper.printError(ctx, "no es posible incrementar o decrementar un valor de tipo \'"
                        + var.toString() + "\' ");
            } else
                var.setUsado(true);

        }
    }

}