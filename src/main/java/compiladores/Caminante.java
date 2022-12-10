package compiladores;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import compiladores.compiladorParser.BloqueContext;
import compiladores.compiladorParser.Expresion_aditivaContext;
import compiladores.compiladorParser.Expresion_asignacionContext;
import compiladores.compiladorParser.Expresion_igualdadContext;
import compiladores.compiladorParser.Expresion_logica_andContext;
import compiladores.compiladorParser.Expresion_logica_orContext;
import compiladores.compiladorParser.Expresion_multiplicativaContext;
import compiladores.compiladorParser.Expresion_postfijaContext;
import compiladores.compiladorParser.Expresion_primariaContext;
import compiladores.compiladorParser.Expresion_relacionalContext;
import compiladores.compiladorParser.Operador_prefijoContext;
import compiladores.compiladorParser.ProgramaContext;
import compiladores.compiladorParser.Seleccion_ifContext;
import compiladores.compiladorParser.Seleccion_if_elseContext;

public class Caminante extends compiladorBaseVisitor<Object> {
    int n = 0;
    int l = 0;
    String id;
    String op;

    @Override
    public Object visitBloque(BloqueContext ctx) {
        // System.out.println(" == Bloque tiene " + ctx.getChildCount() + " hijos");
        // System.out.println(" == Hijo 0 -> " + ctx.getChild(0).getText());
        // System.out.println(" == Hijo 1 -> " + ctx.getChild(1).getText());
        // System.out.println(" == Hijo 2 -> " + ctx.getChild(2).getText());
        return super.visitBloque(ctx);
    }

    @Override
    public Object visitPrograma(ProgramaContext ctx) {
        System.out.println("Comienza visita de el arbol");
        Object o = super.visitPrograma(ctx);
        System.out.println("Fin visita de el arbol");
        return o;
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        // System.out.println("\tHoja contiene |" + node.getText() + "|");
        return super.visitTerminal(node);
    }

    @Override
    public Object visitExpresion_asignacion(Expresion_asignacionContext ctx) {
        if (ctx.ID() != null) {
            System.out.println("//operacion "+ctx.getText());
            String id = ctx.ID().getText();
            String op = ctx.operador_asignacion().getChild(0).getText();
            String res;
            res = (String) super.visit(ctx.expresion_asignacion());
            System.out.printf("%s %s %s\n", id, op, res);
            return "t" + n++;
        }
        return super.visit(ctx.expresion_logica_or());
    }

    @Override
    public Object visitExpresion_logica_or(Expresion_logica_orContext ctx) {
        if (ctx.expresion_logica_or() != null) {
            String add1 = "", add2 = "";

            add1 = (String) super.visit(ctx.expresion_logica_or());
            String op = ctx.OR_OP().getText();

            add2 = (String) super.visit(ctx.expresion_logica_and());

            System.out.printf("t%d = %s %s %s\n", n, add1, op, add2);

            return ("t" + n++);
        } else {
            String res = (String) super.visit(ctx.expresion_logica_and());
            return (Object) res;
        }
    }

    @Override
    public Object visitExpresion_logica_and(Expresion_logica_andContext ctx) {
        if (ctx.expresion_logica_and() != null) {
            String add1 = "", add2 = "";

            add1 = (String) super.visit(ctx.expresion_logica_and());
            String op = ctx.AND_OP().getText();

            add2 = (String) super.visit(ctx.expresion_igualdad());

            System.out.printf("t%d = %s %s %s\n", n, add1, op, add2);

            return ("t" + n++);
        } else {
            String res = (String) super.visit(ctx.expresion_igualdad());
            return (Object) res;
        }
    }

    @Override
    public Object visitExpresion_igualdad(Expresion_igualdadContext ctx) {
        if (ctx.expresion_igualdad() != null) {
            String add1 = "", add2 = "";

            add1 = (String) super.visit(ctx.expresion_igualdad());
            String op = ctx.operador_igualdad().getChild(0).getText();

            add2 = (String) super.visit(ctx.expresion_relacional());

            System.out.printf("t%d = %s %s %s\n", n, add1, op, add2);

            return ("t" + n++);
        } else {
            String res = (String) super.visit(ctx.expresion_relacional());
            return (Object) res;
        }
    }

    @Override
    public Object visitExpresion_relacional(Expresion_relacionalContext ctx) {
        if (ctx.expresion_relacional() != null) {
            String add1 = "", add2 = "";

            add1 = (String) super.visit(ctx.expresion_relacional());
            String op = ctx.operador_relacional().getChild(0).getText();

            add2 = (String) super.visit(ctx.expresion_aditiva());

            System.out.printf("t%d = %s %s %s\n", n, add1, op, add2);

            return ("t" + n++);
        } else {
            String res = (String) super.visit(ctx.expresion_aditiva());
            return (Object) res;
        }
    }

    @Override
    public Object visitExpresion_aditiva(Expresion_aditivaContext ctx) {
        if (ctx.expresion_aditiva() != null) {
            String add1 = "", add2 = "", op;

            add1 = (String) super.visit(ctx.expresion_aditiva());

            add2 = (String) super.visit(ctx.expresion_multiplicativa());

            op = ctx.operador_adicion().getText();

            System.out.printf("t%d = %s %s %s\n", n, add1, op, add2);

            return ("t" + n++);
        } else {
            String res = (String) super.visit(ctx.expresion_multiplicativa());
            return (Object) res;
        }
    }

    @Override
    public Object visitExpresion_multiplicativa(Expresion_multiplicativaContext ctx) {
        if (ctx.expresion_multiplicativa() != null) {
            String term1 = "", term2 = "";

            term1 = (String) super.visit(ctx.expresion_multiplicativa());

            term2 = (String) super.visit(ctx.expresion_postfija());

            String op = ctx.operador_multiplicacion().getText();
            System.out.printf("t%d = %s %s %s\n", n, term1, op, term2);

            return ("t" + n++);
        } else {
            String res = (String) super.visit(ctx.expresion_postfija());
            return (Object) res;
        }
    }

    @Override
    public Object visitExpresion_postfija(Expresion_postfijaContext ctx) {
        /* Solo caso prefissa */
        if (ctx.children.size() == 2 && (ctx.children.get(0) instanceof Operador_prefijoContext) ) 
         {
            // System.out.println((ctx.children.get(0).getClass().getSimpleName()));
            // if(ctx.children.size() == 2){
            String term1 = "";
            term1 = (String) super.visit(ctx.expresion_postfija());
            String op = (ctx.operador_prefijo().getText());
            if(op.equals("++") || op.equals("--")){
                op = op.substring(0,1);
                System.out.printf("t%d = %s %s %s\n", n, term1, op, "1");
            }
            else if(op.equals("-")){
                System.out.printf("t%d = %s %s %s\n", n, "0", op, term1);
            }
            else {
                System.out.printf("t%d = %s \n", n, term1);
            }
            return ("t" + n++);
        } else if (ctx.children.size() == 3) {
            System.out.println("69: Not implemented");
            return ("t" + n++);
        } else
            return (String) super.visit(ctx.expresion_primaria());
    }

    @Override
    public Object visitExpresion_primaria(Expresion_primariaContext ctx) {
        if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.NUMERO_INT() != null) {
            return ctx.NUMERO_INT().getText();
        }
        return super.visit(ctx.expresion());
    }

    @Override
    public Object visitSeleccion_if(Seleccion_ifContext ctx) {
        System.out.println("//operacion "+ctx.getText());
        String cond = (String) super.visit(ctx.expresion());
        System.out.printf("ifnjmp %s,l%d\n", cond, l++);
        String caso = (String) super.visit(ctx.statement());
        System.out.println("label l"+l);        
        return "l"+l++;
    }

    @Override
    public Object visitSeleccion_if_else(Seleccion_if_elseContext ctx) {
        String stat = ctx.children.stream().map(pt -> pt.getText())
        .reduce("", (part, element) -> part + " "+ element);;
        System.out.println("//operacion \'"+stat + "\'");
        String cond = (String) super.visit(ctx.expresion()); 
        System.out.printf("ifnjmp %s,l%d\n", cond, l++);
        super.visit(ctx.statement(0));
        System.out.printf("jmp l%d\n", l);
        System.out.println("label l"+(l-1)); 
        System.out.println("label l"+l);
        return "l"+l++;
    }

    
    
    
}
