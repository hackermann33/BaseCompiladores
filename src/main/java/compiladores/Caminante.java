package compiladores;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladorParser.BloqueContext;
import compiladores.compiladorParser.ProgramaContext;

public class Caminante extends compiladorBaseVisitor<Object>{

    @Override
    public Object visitBloque(BloqueContext ctx) {
        // TODO Auto-generated method stub
        // System.out.println(" == Bloque tiene " + ctx.getChildCount() + " hijos");
        // System.out.println(" ==    Hijo 0 -> " + ctx.getChild(0).getText());
        // System.out.println(" ==    Hijo 1 -> " + ctx.getChild(1).getText());
        // System.out.println(" ==    Hijo 2 -> " + ctx.getChild(2).getText());
        return super.visitBloque(ctx);  
    }

    @Override
    public Object visitPrograma(ProgramaContext ctx) {
        System.out.println("Comienza visita de el arbol");
        Object o =  super.visitPrograma(ctx);
        System.out.println("Fin visita de el arbol");
        return o;
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        //System.out.println("\tHoja contiene |" + node.getText() + "|");
        return super.visitTerminal(node);
    }
    
    
}
