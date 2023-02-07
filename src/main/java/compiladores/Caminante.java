package compiladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;
import compiladores.TablaSimbolos.TablaSimbolos;
import compiladores.TablaSimbolos.Id.TipoDato;
import compiladores.compiladorParser.BloqueContext;
import compiladores.compiladorParser.Definicion_funcionContext;
import compiladores.compiladorParser.Expresion_aditivaContext;
import compiladores.compiladorParser.Expresion_asignacionContext;
import compiladores.compiladorParser.Expresion_igualdadContext;
import compiladores.compiladorParser.Expresion_logica_andContext;
import compiladores.compiladorParser.Expresion_logica_orContext;
import compiladores.compiladorParser.Expresion_multiplicativaContext;
import compiladores.compiladorParser.Expresion_postfijaContext;
import compiladores.compiladorParser.Expresion_primariaContext;
import compiladores.compiladorParser.Expresion_relacionalContext;
import compiladores.compiladorParser.Init_declaradorContext;
import compiladores.compiladorParser.IteracionContext;
import compiladores.compiladorParser.Lista_parametrosContext;
import compiladores.compiladorParser.Lista_parametros_expresionesContext;
import compiladores.compiladorParser.Operador_prefijoContext;
import compiladores.compiladorParser.ProgramaContext;
import compiladores.compiladorParser.SaltoContext;
import compiladores.compiladorParser.Seleccion_ifContext;
import compiladores.compiladorParser.Seleccion_if_elseContext;

public class Caminante extends compiladorBaseVisitor<Object> {
    int n = 0;
    int l = 0;
    int r = 0;
    String id;
    String op;
    private int p;
    private String operacionPostfija;
    private String codigoTresStr = "";

    @Override
    public Object visitBloque(BloqueContext ctx) {
        // codigoTresStr += String.format(" == Bloque tiene " + ctx.getChildCount() + "
        // hijos");
        // codigoTresStr += String.format(" == Hijo 0 -> " + ctx.getChild(0).getText());
        // codigoTresStr += String.format(" == Hijo 1 -> " + ctx.getChild(1).getText());
        // codigoTresStr += String.format(" == Hijo 2 -> " + ctx.getChild(2).getText());
        return super.visitBloque(ctx);
    }

    @Override
    public Object visitPrograma(ProgramaContext ctx) {
        System.out.println("\n> Comienza visita de el arbol");
        Object o = super.visitPrograma(ctx);
        System.out.println("> Fin visita de el arbol");
        try {
            FileWriter escritor = new FileWriter("codigo_tres.txt");
            File f = new File("codigo_tres.txt");
            escritor.write(codigoTresStr);
            System.out.println(
                    "> archivo con código de tres direcciones guardado correctamente en \'" + f.getAbsolutePath()
                            + "\'");
            escritor.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public Object visitExpresion_asignacion(Expresion_asignacionContext ctx) {
        String res;
        if (ctx.ID() != null) {
            codigoTresStr += String.format("//operacion " + ctx.getText() + "\n");
            String id = ctx.ID().getText();
            String op = ctx.operador_asignacion().getChild(0).getText();

            if (op.equals("=")) {
                int numTokens = ctx.getSourceInterval().b - ctx.getSourceInterval().a + 1;
                if (numTokens != 3 && numTokens != 5) {
                    res = (String) super.visit(ctx.expresion_asignacion());
                    codigoTresStr += String.format("%s %s %s\n", id, op, res);
                } else
                    codigoTresStr += String.format(ctx.getText().replace("", " ").trim() + "\n");
            } else {
                op = op.substring(0, 1);
                if (ctx.getSourceInterval().b - ctx.getSourceInterval().a != 3) {
                    res = (String) super.visit(ctx.expresion_asignacion());
                    codigoTresStr += String.format("%s %s %s %s %s\n", id, "=", id, op, res);
                } else {
                    codigoTresStr += String.format("%s %s %s %s %s\n", id, "=", id, op, ctx.stop.getText());
                    codigoTresStr += String.format(ctx.getText().replace("", " ").trim() + "\n");
                }
            }

            return "t" + n;
        }

        res = (String) super.visit(ctx.expresion_logica_or());
        return res;
    }

    @Override
    public Object visitExpresion_logica_or(Expresion_logica_orContext ctx) {
        if (ctx.expresion_logica_or() != null) {
            String add1 = "", add2 = "";

            add1 = (String) super.visit(ctx.expresion_logica_or());
            String op = ctx.OR_OP().getText();

            add2 = (String) super.visit(ctx.expresion_logica_and());

            codigoTresStr += String.format("t%d = %s %s %s\n", n, add1, op, add2);
            checkYImprimePostFija();

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

            codigoTresStr += String.format("t%d = %s %s %s\n", n, add1, op, add2);
            checkYImprimePostFija();

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

            codigoTresStr += String.format("t%d = %s %s %s\n", n, add1, op, add2);
            checkYImprimePostFija();

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

            codigoTresStr += String.format("t%d = %s %s %s\n", n, add1, op, add2);
            checkYImprimePostFija();

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

            codigoTresStr += String.format("t%d = %s %s %s\n", n, add1, op, add2);
            checkYImprimePostFija();

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
            codigoTresStr += String.format("t%d = %s %s %s\n", n, term1, op, term2);
            checkYImprimePostFija();

            return ("t" + n++);
        } else {
            String res = (String) super.visit(ctx.expresion_postfija());
            return (Object) res;
        }
    }

    @Override
    public Object visitExpresion_postfija(Expresion_postfijaContext ctx) {
        if (ctx.children.size() == 2) {
            String term1 = "";
            String op = "";
            /* Prefijo */
            if (ctx.children.get(0) instanceof Operador_prefijoContext) {
                op = (ctx.operador_prefijo().getText());

                if (ctx.expresion_primaria().children.size() == 1) {
                    term1 = ctx.expresion_primaria().children.get(0).getText();
                    if (op.equals("++") || op.equals("--")) {
                        op = op.substring(0, 1);
                        codigoTresStr += String.format("t%d = %s %s %s\n", n, term1, op, "1");
                    } else if (op.equals("-")) {
                        codigoTresStr += String.format("t%d = %s%s\n", n, op, term1);
                    } else {
                        codigoTresStr += String.format("t%d = %s\n", n, term1);
                    }
                    return ("t" + n++);
                } else if (op.equals("-")) { // - expresion
                    String res = (String) super.visit(ctx.expresion_primaria());
                    codigoTresStr += String.format("t%d = %s%s\n", n, op, res);
                    return ("t" + n++);
                } else { // + expresion
                    codigoTresStr += String.format("t%d = %s\n", n, (String) super.visit(ctx.expresion_primaria()));
                    return ("t" + n++);
                }
            } else { // postfijo
                term1 = ctx.ID().getText();
                op = (ctx.operador_postfijo().getText());
                if (op.equals("++") || op.equals("--")) {
                    op = op.substring(0, 1);
                    operacionPostfija = String.format("%s = %s %s %s\n", term1, term1, op, "1");
                }
                return (term1);
            }
            /* Funcion (llamada) */
        } else if (ctx.children.size() == 4) {
            codigoTresStr += String.format("//funcion call: " + ctx.getText() + "\n");
            codigoTresStr += String.format((String) super.visit(ctx.lista_parametros_expresiones()) + "\n");
            codigoTresStr += String.format("push l" + l + "\n");
            codigoTresStr += String.format("jump " + ctx.ID() + "\n");
            codigoTresStr += String.format("label l" + l++ + "\n");
            TablaSimbolos ts = TablaSimbolos.getInstanceOf();
            if (ts.buscarSimboloLocal(ctx.ID().getText()).getTipo() != TipoDato.VOID)
                codigoTresStr += String.format("pop res" + r + "\n");
            return ("res" + r++);
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
        codigoTresStr += String.format("//operacion " + ctx.getText() + "\n");
        String cond = (String) super.visit(ctx.expresion());
        int oldL = l;
        codigoTresStr += String.format("ifnjmp %s,l%d\n", cond, l++ + "\n");
        super.visit(ctx.statement());
        codigoTresStr += String.format("label l" + oldL + "\n");
        return "l" + l;
    }

    @Override
    public Object visitSeleccion_if_else(Seleccion_if_elseContext ctx) {
        String stat = ctx.children.stream().map(pt -> pt.getText())
                .reduce("", (part, element) -> part + " " + element);
        ;
        codigoTresStr += String.format("//operacion \'" + stat + "\'" + "\n");
        int oldL = l;
        String cond = (String) super.visit(ctx.expresion());
        codigoTresStr += String.format("ifnjmp %s,l%d\n", cond, l++);
        super.visit(ctx.statement(0));
        codigoTresStr += String.format("jmp l%d\n", l);
        codigoTresStr += String.format("label l" + oldL + "\n");
        super.visit(ctx.statement(1));
        codigoTresStr += String.format("label l" + (oldL + 1) + "\n");
        return "l" + l;
    }

    @Override
    public Object visitIteracion(IteracionContext ctx) {
        codigoTresStr += String.format("//iteracion " + ctx.getText() + "\n");
        if (ctx.getChild(0).getText().equals("while")) {
            String cond = (String) super.visit(ctx.expresion());
            int oldL = l;
            codigoTresStr += String.format("label l" + l++ + "\n");
            codigoTresStr += String.format("ifnjmp " + cond + ",l" + l + "\n");
            super.visit(ctx.statement());
            codigoTresStr += String.format("jmp l" + oldL + "\n");
            codigoTresStr += String.format("label l" + (oldL + 1) + "\n");
            return "l" + l++;
        } else if (ctx.getChild(0).getText().equals("do")) {
            int oldL = l;
            codigoTresStr += String.format("label l" + l++ + "\n");
            super.visit(ctx.statement());
            String cond = (String) super.visit(ctx.expresion());
            codigoTresStr += String.format("ifjmp " + cond + ",l" + oldL + "\n");
            codigoTresStr += String.format("jmp l" + oldL + "\n");
            return "l" + l;
        } else if (ctx.getChild(0).getText().equals("for")) {
            ParseTree initIstr, condIstr;

            initIstr = ctx.expression_statement(0);
            condIstr = ctx.expression_statement(1).expresion();

            super.visit(initIstr);
            String cond = (String) super.visit(condIstr);
            int oldL = l;
            codigoTresStr += String.format("label l" + l++ + "\n");
            codigoTresStr += String.format("ifnjmp " + cond + ",l" + l + "\n");
            if (ctx.expresion() != null)
                super.visit(ctx.expresion());
            super.visit(ctx.statement());
            codigoTresStr += String.format("jmp l" + oldL + "\n");
            codigoTresStr += String.format("label l" + (oldL + 1) + "\n");
            return "l" + l++;
        }

        return super.visitIteracion(ctx);
    }

    @Override
    public Object visitInit_declarador(Init_declaradorContext ctx) {
        if (ctx.children.size() > 1) {
            codigoTresStr += String.format("//operacion " + ctx.getText() + "\n");
            String id = ctx.declarador().ID().getText();
            String res;

            int numTokens = ctx.getSourceInterval().b - ctx.getSourceInterval().a + 1;
            if (numTokens != 3 && numTokens != 5) {
                res = (String) super.visit(ctx.expresion_asignacion());
                codigoTresStr += String.format("%s %s %s\n", id, "=", res);

            } else
                codigoTresStr += String.format(ctx.getText());

            return "t" + n;
        }
        return super.visitInit_declarador(ctx);
    }

    @Override
    public Object visitLista_parametros_expresiones(Lista_parametros_expresionesContext ctx) {
        if (ctx.children != null) {
            if (ctx.children.size() > 1) {
                super.visit(ctx.lista_parametros_expresiones());
                String arg2 = (String) super.visit(ctx.expresion_asignacion());
                codigoTresStr += String.format("push " + arg2 + "\n");
                return arg2;
            } else {
                String arg = (String) super.visit(ctx.expresion_asignacion());
                codigoTresStr += String.format("push " + arg + "\n");
                return arg;
            }
        }
        return "";
    }

    @Override
    public Object visitDefinicion_funcion(Definicion_funcionContext ctx) {
        codigoTresStr += String.format("//definicion funcion: " + ctx.getText() + "\n");
        p = 0;
        super.visit(ctx.init_declarador());
        codigoTresStr += String.format("pop ret" + "\n");
        String res = (String) super.visit(ctx.bloque());
        codigoTresStr += String.format("jump ret" + "\n");

        return res;
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return aggregate != null ? aggregate : nextResult;
    }

    @Override
    public Object visitLista_parametros(Lista_parametrosContext ctx) {
        if (ctx.declaracion_parametro() != null)
            codigoTresStr += String.format("pop param" + p++ + "\n");
        return super.visitLista_parametros(ctx);
    }

    @Override
    public Object visitSalto(SaltoContext ctx) {
        if (ctx.RETURN() != null) {
            codigoTresStr += String.format("//RETURN " + ctx.getText() + "\n");
            if (ctx.expresion() != null) {
                String res = (String) super.visit(ctx.expresion());
                codigoTresStr += String.format("push " + res + "\n");
                checkYImprimePostFija();
            }
            codigoTresStr += String.format("jmp ret" + "\n");

        }

        return "t" + n;
    }

    public void checkYImprimePostFija() {
        if (operacionPostfija != null) {
            String.format(operacionPostfija + "\n");
            operacionPostfija = null;
        }
    }

}
