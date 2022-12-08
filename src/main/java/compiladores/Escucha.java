package compiladores;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladorParser.BloqueContext;
import compiladores.compiladorParser.Declaracion_parametroContext;
import compiladores.compiladorParser.DeclaradorContext;
import compiladores.compiladorParser.Definicion_funcionContext;
import compiladores.compiladorParser.Expresion_asignacionContext;
import compiladores.compiladorParser.Expresion_primariaContext;
import compiladores.compiladorParser.Init_declaradorContext;
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
    private TablaSimbolos ts;
    private TipoDato currentSpecificador = null;
    private boolean definicion = false;


    @Override
    public void enterBloque(BloqueContext ctx) {
        contexto++;
        ts.addContexto();
        System.out.println("nuevo contexto " + contexto);
        System.out.println(ts);
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        System.out.println("fin contexto " + contexto);
        System.out.println(ts);
        ts.imprimeWarnings();
        ts.delContexto();
        contexto--;
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        ts = TablaSimbolos.getInstanceOf();
        System.out.println("Comienza la compilacion");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("salida del programa: ");
        System.out.println( ts.toString());
        ts.imprimeWarnings();
        System.out.println("fin de la compilacion: " + contexto);
    }

    /*
     * Guardo el especificador de tipo de declaracion y de parametros
     */
    @Override
    public void exitSpecificador_tipo(Specificador_tipoContext ctx) {
        TipoDato res = TipoDato.valueOf(ctx.getStart().getText().toUpperCase());

        currentSpecificador = res; /* function or varialble */
        super.exitSpecificador_tipo(ctx);
    }


   

    /*
     * Saliendo do expresion_asignacion. El primer hijo, si es un ID, representa una
     * variable que se esta inicializando: Controllo
     * que la variable ya existes
     */
    @Override
    public void exitExpresion_asignacion(Expresion_asignacionContext ctx) {

        String nombreCorrenteVariable;
        Id idCorrente;
        if (ctx.ID() != null) {
            nombreCorrenteVariable = ctx.ID().toString();
            if ((idCorrente = ts.buscarSimbolo(nombreCorrenteVariable)) == null) {
                System.out.println(getPoint(ctx) + ":error: Uso del identificador no declarado \'"+ nombreCorrenteVariable+ "\' ");
            } else {
                idCorrente.setInicializado(true);
            }
        }
        // TODO Auto-generated method stub
        super.exitExpresion_asignacion(ctx);
    }

    @Override
    public void exitExpresion_primaria(Expresion_primariaContext ctx) {
        String nombreCorrenteVariable;
        Id idCorrente;
        if (ctx.ID() != null) {
            nombreCorrenteVariable = ctx.ID().toString();
            if ((idCorrente = ts.buscarSimbolo(nombreCorrenteVariable)) == null) {
                System.out.println("error: Uso del identificador no declarado \'"+ nombreCorrenteVariable+ "\' ");
            } else {
                idCorrente.setUsado(true);
            }
        }

        // TODO Auto-generated method stub
        super.exitExpresion_primaria(ctx);
    }
    String getPoint(ParserRuleContext ctx){
        return ctx.getStart().getLine()+ ":"+ ctx.getStart().getCharPositionInLine();
    }   


    /*TODO: f() = 10 */
    @Override
    public void exitInit_declarador(Init_declaradorContext ctx) {
        String nombre = "";
        Id id;
        if (((DeclaradorContext) ctx.children.get(0)).ID() != null) {

            nombre = ((DeclaradorContext) ctx.children.get(0)).ID().toString();
            //System.out.println("variabile: " + currentSpecificador + " " +  nombre);
            
            id = new Variable(currentSpecificador, nombre);
            if(ctx.children.size() > 1 ) id.setInicializado(true);
        } else {
            nombre = ((DeclaradorContext) ctx.getChild(0).getChild(0)).ID().toString();
            Funcion f = new Funcion(currentSpecificador, nombre);

            if(ctx.children.size() > 1 ) 
                System.out.println( getPoint(ctx) + ": error: la función \'" + nombre + "\' es inicializada como una variable");

            /* Calcola parametri */
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
                        f.addArgumento(tipoParam);
                    }
                }
            }
            id = f;

            if(definicion) {
                f.setInicializado(true);
            }
        }
        
        if(ts.buscarSimboloLocal(nombre) != null){
            if(!definicion)
                System.out.println(getPoint(ctx) + " :error: identificador " + "\'" + id.getNombre() + "\' ya usado en esto contexto!");       
            else{
                definicion = false;
                if(!ts.buscarSimboloLocal(nombre).getInicializado())
                    ts.buscarSimboloLocal(nombre).setInicializado(true);
                else
                    System.out.println(getPoint(ctx) + " :error: redefinición de \'"+nombre+"\'"); 
            }
        }else
            ts.addSimbolo(id);

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

    /* Qui salvo le funzioni */
    // @Override
    // public void exitDeclarador_funcion(Declarador_funcionContext ctx) {
    // // TODO Auto-generated method stub

    // Id currentDec;

    // currentDec = currentFun;
    // currentFun = null;

    // if (ts.buscarSimboloLocal(currentDec.getNombre()) == null)
    // ts.addSimbolo(currentDec);
    // else
    // System.out.println("Error: Identificador " + "\'" + currentDec.getNombre() +
    // "\' ya usado en esto contexto!");
    // startDeclaracion = false;
    // super.exitDeclarador_funcion(ctx);
    // }

}
