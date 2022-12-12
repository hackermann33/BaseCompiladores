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
import compiladores.compiladorParser.Expresion_primariaContext;
import compiladores.compiladorParser.Init_declaradorContext;
import compiladores.compiladorParser.IteracionContext;
import compiladores.compiladorParser.Lista_parametrosContext;
import compiladores.compiladorParser.ProgramaContext;
import compiladores.compiladorParser.Specificador_tipoContext;
import compiladores.TablaSimbolos.Funcion;
import compiladores.TablaSimbolos.Id;
import compiladores.TablaSimbolos.Id.TipoDato;
import compiladores.TablaSimbolos.TablaSimbolos;
import compiladores.TablaSimbolos.Variable;

public class Escucha extends compiladorBaseListener {

    private int contexto = 0;
    private String tablaContextosStr = "";
    private TablaSimbolos ts;
    private TipoDato specificadorActual = null;
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
        if (definicion) {
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

        specificadorActual = res; /* function or varialble */
        super.exitSpecificador_tipo(ctx);
    }

    /*
     * Saliendo do expresion_asignacion. El primer hijo, si es un ID, representa una
     * variable que se esta inicializando: Controllo
     * que la variable ya existes
     */
    @Override
    public void exitExpresion_asignacion(Expresion_asignacionContext ctx) {

        String nombreActualVariable;
        Id idCorrente;
        if (ctx.ID() != null) {
            nombreActualVariable = ctx.ID().toString();
            if ((idCorrente = ts.buscarSimbolo(nombreActualVariable)) == null) {
                System.out.println(Colors.RED_BOLD + getPoint(ctx) + ":error: Uso del identificador no declarado \'"
                        + nombreActualVariable + "\' " + Colors.ANSI_RESET);
                errors = true;
            } else if ((idCorrente = ts.buscarSimbolo(nombreActualVariable)) instanceof Funcion) {
                System.out.println(Colors.RED_BOLD + getPoint(ctx) + ":error: Función \'"
                        + nombreActualVariable + "\' " + " no es asignable" + Colors.ANSI_RESET);
                errors = true;
            } else {
                idCorrente.setInicializado(true);
            }
        }
        super.exitExpresion_asignacion(ctx);
    }

    @Override
    public void exitExpresion_primaria(Expresion_primariaContext ctx) {
        String nombreActualVariable;
        Id idCorrente;
        if (ctx.ID() != null) {
            nombreActualVariable = ctx.ID().toString();
            if ((idCorrente = ts.buscarSimbolo(nombreActualVariable)) == null) {
                System.out.println(Colors.RED_BOLD + "error: Uso del identificador no declarado \'"
                        + nombreActualVariable + "\' " + Colors.ANSI_RESET);
                errors = true;
            } else {
                idCorrente.setUsado(true);
            }
        }
        super.exitExpresion_primaria(ctx);
    }

    String getPoint(ParserRuleContext ctx) {
        return ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
    }

    @Override
    public void exitInit_declarador(Init_declaradorContext ctx) {
        String nombreId = "";
        Id id;

        if (((DeclaradorContext) ctx.children.get(0)).ID() != null) {
            nombreId = ((DeclaradorContext) ctx.children.get(0)).ID().toString();
            id = new Variable(specificadorActual, nombreId);
            if (ctx.children.size() > 1)
                id.setInicializado(true);
        } else {
            nombreId = ((DeclaradorContext) ctx.getChild(0).getChild(0)).ID().toString();
            Funcion f = new Funcion(specificadorActual, nombreId);

            if (ctx.children.size() > 1) {
                System.out.println(Colors.RED_BOLD + getPoint(ctx) + ": error: la función \'" + nombreId
                        + "\' es inicializada como una variable" + Colors.ANSI_RESET);
                errors = true;

            }

            /* Calcolo parametros */
            List<ParseTree> listaParametrosChilds = ((DeclaradorContext) ctx.getChild(0)).lista_parametros().children;

            TipoDato tipoParam = null;
            String nomeParam = "";

            if (listaParametrosChilds != null) {
                for (ParseTree tn : listaParametrosChilds) {
                    if (!(tn instanceof TerminalNode)) {
                        Declaracion_parametroContext ctn = tn instanceof Declaracion_parametroContext
                                ? (Declaracion_parametroContext) tn
                                : ((Lista_parametrosContext) tn).declaracion_parametro();

                        tipoParam = extractTipoDato(ctn);
                        nomeParam = extractNombre(ctn);
                        params.add(new Variable(tipoParam, nomeParam));
                    }
                }
            }
            id = f;

            if (definicion) {
                f.setInicializado(true);
            }
        }

        if (ts.buscarSimboloLocal(nombreId) != null) {
            if (!definicion) {
                System.out.println(Colors.RED_BOLD + getPoint(ctx) + " :error: identificador " + "\'" + id.getNombre()
                        + "\' ya usado en esto contexto!" + Colors.ANSI_RESET);
                errors = true;
            } else {
                definicion = false;
                Funcion f = (Funcion) ts.buscarSimboloLocal(nombreId);
                if (!f.getInicializado()) {
                    if (f.getArgs().equals(((Funcion) id).getArgs()))
                        f.setInicializado(true);
                    else {
                        System.out.println(Colors.RED_BOLD + getPoint(ctx) + " :error: tipos conflictivos para \'"
                                + nombreId + "\'" + Colors.ANSI_RESET);
                        errors = true;
                    }
                } else {
                    System.out.println(Colors.RED_BOLD + getPoint(ctx) + " :error: redefinición de \'" + nombreId + "\'"
                            + Colors.ANSI_RESET);
                    errors = true;
                }
            }
        } else {
            ts.addSimbolo(id);
            
        }

        super.exitInit_declarador(ctx);
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

}