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
import compiladores.compiladorParser.IdentificadorContext;
import compiladores.compiladorParser.Init_declaradorContext;
import compiladores.compiladorParser.ProgramaContext;
import compiladores.compiladorParser.Specificador_tipoContext;

public class Escucha extends compiladorBaseListener {
    private int contexto = 0;
    private TablaSimbolos tb;

    private Boolean startDeclaracion = false;

    private String currentId;
    private TipoDato currentSpecificador = null;
    
    private Variable currentParam = null; 
    private Funcion currentFun = null;


    @Override
    public void enterBloque(BloqueContext ctx) {
        contexto++;
        tb.addContexto();
        System.out.println("Nuevo contexto: " + contexto);
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        System.out.println("Fin contexto: " + contexto);
        tb.delContexto();
        contexto--;
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        tb = TablaSimbolos.getInstanceOf();
        System.out.println("Comienza la compilacion|" + ctx.getText() + "|");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("Fin de la compilacion: " + contexto);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        //System.out.println("TOKEN ---> |" + getLexName(node) + " " + node.getText() + "|");
    }

    @Override
    public void enterInit_declarador(Init_declaradorContext ctx) {
        startDeclaracion = true;
        super.enterInit_declarador(ctx);
    }
    
    @Override
    public void exitInit_declarador(Init_declaradorContext ctx) {
        Id currentDec;
        if(currentFun == null){
            currentDec = new Variable(currentSpecificador, currentId);
            if(ctx.getChildCount() == 3)
                currentDec.setInicializado(true);
            //System.out.println("var: tipo: " + currentSpecificador + " ID: " + currentId+ "\n");
        }else{
            //System.out.println("fun: tipo: " + currentFun.getTipo() + " ID: " + currentFun.getNombre() + "\n");
            
            //for(Variable p : currentFun.getArgs())
            //    System.out.println("\tparam: tipo: " + p.getTipo() + " ID: " + p.getNombre() + "\n");
            currentDec = currentFun;
            currentFun = null;
        }

        if(tb.buscarSimboloLocal(currentDec.getNombre()) == null){
            System.out.println(currentDec);
            tb.addSimbolo(currentDec);
        }
        else{
            System.out.println("Identifier " + "\'" + currentDec.getNombre() + "\' already used in this context");
        }
        startDeclaracion = false;
        super.exitInit_declarador(ctx);
    }

    /*
     * Saving the type specifier
    */
    @Override
    public void exitSpecificador_tipo(Specificador_tipoContext ctx) {
        TipoDato res = TipoDato.valueOf(ctx.getStart().getText().toUpperCase());
        if(currentFun != null){
            assert(currentParam != null);
            currentParam.setTipo(res); /* parameter */
        }
        else{
            currentSpecificador = res; /* function or varialble*/ 
        }
        super.exitSpecificador_tipo(ctx);
    }

    @Override
    public void enterDeclarador_funcion(Declarador_funcionContext ctx) {
        assert(startDeclaracion);
        currentFun = new Funcion(); 
        currentFun.setTipo(currentSpecificador);
        currentFun.setNombre(currentId);
        super.enterDeclarador_funcion(ctx);
    }

    /* saving ID */
    @Override
    public void exitIdentificador(IdentificadorContext ctx) {
    assert(startDeclaracion);
        
    if(currentFun != null){ /*param */
        assert(currentFun.getNombre() != "");
        assert(currentParam!=null);
        currentParam.setNombre(ctx.getText());
    }
    else/* variable or function*/
        currentId = ctx.getText();
        super.exitIdentificador(ctx);
    }

    @Override
    public void enterDeclaracion_parametro(Declaracion_parametroContext ctx) {
        currentParam = new Variable(); /* Creating variable in order to save the param */ 
        super.enterDeclaracion_parametro(ctx);
    }

    @Override
    public void exitDeclaracion_parametro(Declaracion_parametroContext ctx) {
        currentFun.addArgumento(currentParam); /* Pushing the currentParam in currentFun args*/
        currentParam = null;
        super.exitDeclaracion_parametro(ctx);
    }

    


    
    
    
    
}
