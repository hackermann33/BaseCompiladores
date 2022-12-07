package compiladores;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.TablaSimbolos.Funcion;
import compiladores.TablaSimbolos.Id;
import compiladores.TablaSimbolos.TablaSimbolos;
import compiladores.TablaSimbolos.Variable;
import compiladores.TablaSimbolos.Id.TipoDato;
import compiladores.compiladorParser.BloqueContext;
import compiladores.compiladorParser.Declaracion_parametroContext;
import compiladores.compiladorParser.Declarador_funcionContext;
import compiladores.compiladorParser.Expresion_asignacionContext;
import compiladores.compiladorParser.Expresion_primariaContext;
import compiladores.compiladorParser.IdentificadorContext;
import compiladores.compiladorParser.Init_declaradorContext;
import compiladores.compiladorParser.ProgramaContext;
import compiladores.compiladorParser.Specificador_tipoContext;



public class Escucha extends compiladorBaseListener {
    private int contexto = 0;
    private TablaSimbolos ts;

    private Boolean startDeclaracion = false;

    private String currentId = null;
    private TipoDato currentSpecificador = null;

    private TipoDato currentSpecificadorParam = null;
    private Funcion currentFun = null;

    @Override
    public void enterBloque(BloqueContext ctx) {
        contexto++;
        ts.addContexto();
        System.out.println("Nuevo contexto: " + contexto);
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        System.out.println("Fin contexto: " + contexto);
        ts.imprimeWarnings();
        ts.delContexto();
        contexto--;
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        ts = TablaSimbolos.getInstanceOf();
        System.out.println("Comienza la compilacion|" + ctx.getText() + "|");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        ts.imprimeWarnings();
        
        System.out.println("Tabla final: \n" + ts.toString());
        System.out.println("Fin de la compilacion: " + contexto);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // System.out.println("TOKEN ---> |" + getLexName(node) + " " + node.getText() +
        // "|");
    }

    /* Empiezo la declaracion */
    @Override
    public void enterInit_declarador(Init_declaradorContext ctx) {
        startDeclaracion = true;
        super.enterInit_declarador(ctx);
    }


    /*
     * Guardo el especificador de tipo de declaracion y de parametros
     */
    @Override
    public void exitSpecificador_tipo(Specificador_tipoContext ctx) {
        TipoDato res = TipoDato.valueOf(ctx.getStart().getText().toUpperCase());
        if (currentFun != null) {
            assert (currentSpecificadorParam != null);
            currentSpecificadorParam = res; /* parameter */
        } else {
            currentSpecificador = res; /* function or varialble */
        }
        super.exitSpecificador_tipo(ctx);
    }

    /*
     * Creo la funcion y comprobo nombre y tipo
     */
    @Override
    public void enterDeclarador_funcion(Declarador_funcionContext ctx) {
        if(startDeclaracion){
            currentFun = new Funcion();
            currentFun.setTipo(currentSpecificador);
            currentFun.setNombre(currentId);
        }
        super.enterDeclarador_funcion(ctx);
        
    }

    /* Guardo el identificador de la declaracion */
    @Override
    public void exitIdentificador(IdentificadorContext ctx) {
        if (startDeclaracion) {
            currentId = ctx.getText();
            super.exitIdentificador(ctx);
        }
    }


    @Override
    public void exitDeclaracion_parametro(Declaracion_parametroContext ctx) {
        currentFun.addArgumento(currentSpecificadorParam); /* Pushing the currentTipoDato in currentFun args */
        currentSpecificadorParam = null;
        super.exitDeclaracion_parametro(ctx);
    }

    /* Guardo la declaracion en la tabla de simbolos */
    @Override
    public void exitInit_declarador(Init_declaradorContext ctx) {
        Id currentDec;
        if (currentFun == null) {
            assert (currentSpecificador != null);
            assert (currentId != null);
            currentDec = new Variable(currentSpecificador, currentId);
            if (ctx.getChildCount() == 3)
                currentDec.setInicializado(true);
        } else {
            currentDec = currentFun;
            currentFun = null;
        }

        if (ts.buscarSimboloLocal(currentDec.getNombre()) == null) 
            ts.addSimbolo(currentDec);
        else 
            System.out.println("Error: Identificador " + "\'" + currentDec.getNombre() + "\' ya usado en esto contexto!");
        startDeclaracion = false;
        super.exitInit_declarador(ctx);
    }

    /*Saliendo do expresion_asignacion. El primer hijo, si es un ID, representa una variable que se esta inicializando: Controllo
     * que la variable ya existes
     */
    @Override
    public void exitExpresion_asignacion(Expresion_asignacionContext ctx) {

        String nombreCorrenteVariable;
        Id idCorrente;
        if(ctx.ID() != null){
            nombreCorrenteVariable =  ctx.ID().toString();
            if((idCorrente = ts.buscarSimbolo(nombreCorrenteVariable)) == null){
                System.out.println("Error: variable " + nombreCorrenteVariable + " no està declarada");
            }
            else{
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
        if(ctx.ID() != null){
            nombreCorrenteVariable =  ctx.ID().toString();
            if((idCorrente = ts.buscarSimbolo(nombreCorrenteVariable)) == null){
                System.out.println("Error: variable " + nombreCorrenteVariable + " no està declarada");
            }
            else{
                idCorrente.setUsado(true);
            }
        }

        // TODO Auto-generated method stub
        super.exitExpresion_primaria(ctx);
    }
    

}
