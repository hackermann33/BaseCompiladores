package compiladores;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladorParser.BloqueContext;
import compiladores.compiladorParser.ProgramaContext;

public class Escucha extends compiladorBaseListener {
    private int contexto = 0;

    @Override
    public void enterBloque(BloqueContext ctx) {
        contexto++;
        System.out.println("Nuevo contexto: " + contexto);
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        System.out.println("Fin contexto: " + contexto);
        contexto--;
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        contexto++;
        System.out.println("Comienza la compilacion|" + ctx.getText() + "|");
    }


    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("Fin de la compilacion: " + contexto);

    }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println("TOKEN ---> |" + node.getSymbol().getType() + " " + node.getText() + "|");
    }
    
}
