package compiladores.TablaSimbolos;

import org.antlr.v4.runtime.ParserRuleContext;

import compiladores.compiladorParser.Expresion_postfijaContext;
import compiladores.Colors;
import compiladores.TablaSimbolos.Id.TipoDato;

public class Helper {

    public enum EstadoDeclaracion {
        VAR,
        FUNC,
        FUNC_PARAM
    }

    public enum EstadoReturn {
        NO,
        RET_VOID,
        RET_VAL
    }

    private TablaSimbolos ts;
    private TipoDato lastSpecificador = null;
    private String lastId;
    private Funcion lastFuncion;
    private EstadoDeclaracion estadoDeclaracion = null;
    public boolean errors = false;
    private static Helper instancia = null;
    private boolean save = false;
    private boolean esDefinicion = false;
    private boolean necesitoReturn = false;
    private EstadoReturn estadoReturn = EstadoReturn.NO;

    private Helper() {
        ts = TablaSimbolos.getInstanceOf();
    }

    public static Helper getInstanceOf() {
        if (instancia == null) {
            instancia = new Helper();
        }
        return instancia;
    }

    /**
     * Función que recibe un id y genera errores si el id no está presente
     * en la
     * tabla de símbolos o si está presente pero es una función.
     * 
     * @param ctx             contexto de la regla
     * @param id              nombre del identificador
     * @param operadorDerecho si es true el id està despuès el signo igual en la
     *                        asegnaciòn
     */
    public void checkAsignacion(ParserRuleContext ctx, String id, Boolean operadorDerecho) {
        Id idCorrente = checkDeclarado(ctx, id);

        if (idCorrente != null) {
            if (!operadorDerecho
                    && (idCorrente = ts.buscarSimbolo(id)) instanceof Funcion) {
                printError(ctx, "función \'"
                        + id + "\' " + " no es asignable");
            }
            {
                idCorrente.setInicializado(true);
            }
        }
        return;
    }

    public void printError(ParserRuleContext ctx, String text) {
        System.out.println(Colors.RED_BOLD + getPoint(ctx) + ": error: " + text + Colors.ANSI_RESET);
        errors = true;
    }

    static String getPoint(ParserRuleContext ctx) {
        return ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
    }

    public TipoDato getLastSpecificador() {
        return lastSpecificador;
    }

    public void setLastSpecificador(TipoDato specificador) {
        lastSpecificador = specificador;
    }

    public void resetSpecificadorActual(TipoDato specificador) {
        lastSpecificador = specificador;
    }

    public void startDeclaracion() {
        estadoDeclaracion = EstadoDeclaracion.VAR;
    }

    public void initDeclaracionFuncion() {
        assert estadoDeclaracion != null : "Error: not entered in a declaration!";
        estadoDeclaracion = EstadoDeclaracion.FUNC;
        lastFuncion = new Funcion(lastSpecificador, lastId);
        necesitoReturn = lastSpecificador != TipoDato.VOID;
    }

    public void initDeclaracionParams() {
        assert estadoDeclaracion == EstadoDeclaracion.FUNC;
        estadoDeclaracion = EstadoDeclaracion.FUNC_PARAM;
    }

    public void endDeclaracionParams() {
        assert estadoDeclaracion == EstadoDeclaracion.FUNC_PARAM;
        lastFuncion.addArgumento(lastSpecificador);
        estadoDeclaracion = EstadoDeclaracion.FUNC;
    }

    public void saveLastId(ParserRuleContext ctx) {
        if (save) {
            if (estadoDeclaracion == EstadoDeclaracion.VAR) {
                ts.addSimbolo(new Variable(lastSpecificador, lastId));
                if (ctx.children.size() == 3)
                    ts.buscarSimbolo(lastId).setInicializado(true);
            } else {
                /**
                 * si es definición => buscar si ya existe => si ya existe comprobar que los
                 * parámetros son iguales y no lo suman
                 */
                /*
                 * Si no está, añádelo y configúralo como inicializado. Si no, simplemente
                 * configúralo como inicializado.
                 */
                if (esDefinicion) {
                    Funcion funcionDeclarada = (Funcion) ts.buscarSimbolo(lastFuncion.getNombre());
                    if (funcionDeclarada != null) {
                        if (!funcionDeclarada.getArgs().equals(lastFuncion.getArgs()))
                            printError(ctx, "tipos conflictivos para función \'"
                                    + lastFuncion.getNombre() + "\'");
                        if (funcionDeclarada.getInicializado())
                            printError(ctx, "redefinición de \'"
                                    + lastFuncion.getNombre() + "\'");
                        else
                            funcionDeclarada.setInicializado(true);
                    } else {
                        lastFuncion.setInicializado(true);
                        ts.addSimbolo(lastFuncion);
                    }
                } else
                    ts.addSimbolo(lastFuncion);
                estadoDeclaracion = EstadoDeclaracion.VAR;
                if (ctx.children.size() == 3)
                    printError(ctx, "la función \'" + lastFuncion.getNombre() + "\' es inicializada como una variable");

            }
        }
    }

    public void exitDeclaracion(ParserRuleContext ctx, String id) {
        if (estadoDeclaracion != EstadoDeclaracion.FUNC_PARAM) {
            save = checkRedefinicion(ctx, id);
            lastId = id;
        }
    }

    private boolean checkRedefinicion(ParserRuleContext ctx, String id) {
        Id simbolo;
        if ((simbolo = ts.buscarSimboloLocal(id)) != null) {
            if ((simbolo instanceof Variable) || (simbolo instanceof Funcion && !esDefinicion)) {
                printError(ctx, "identificador " + "\'" + id
                        + "\' ya usado en esto contexto!");
                return false;
            }
        }

        return true;
    }

    public void setEsDefinicion(boolean defincion) {
        this.esDefinicion = defincion;
    }

    public Id checkDeclarado(ParserRuleContext ctx, String nombreId) {
        Id id;
        if ((id = ts.buscarSimbolo(nombreId)) == null) {
            printError(ctx, "uso del identificador no declarado \'"
                    + nombreId + "\' ");
            return null;
        }
        return id;
    }

    public boolean checkParams(Expresion_postfijaContext ctx, Id f) {
        int nTokens = ctx.lista_parametros_expresiones().getSourceInterval().b
                - ctx.lista_parametros_expresiones().getSourceInterval().a + 1;
        int nParams = nTokens > 0 ? nTokens / 2 + 1 : 0;
        int nParamsFunc = ((Funcion) f).getArgs().size();

        if (nParams > nParamsFunc) {
            printError(ctx,
                    String.format("demasiados argumentos para llamar a la función, esperaba %d, tiene %d",
                            nParamsFunc, nParams));
            return false;
        } else if (nParams < nParamsFunc) {
            printError(ctx, String.format(
                    "demasiados pocos argumentos para llamar a la función, se esperaban %d, tienen %d",
                    nParamsFunc, nParams));
            return false;
        } else
            return true;
    }

    public void setEstadoReturn(EstadoReturn estadoReturn) {
        this.estadoReturn = estadoReturn;
    }

    public void checkReturn(ParserRuleContext ctx) {
        Funcion f;
        if ((f = ts.buscarUltimoContexto()) != null) {
            if (necesitoReturn) {
                if (estadoReturn == EstadoReturn.NO)
                    System.err.println(Colors.CYAN_BOLD + "warning: La función \'" + f.getNombre()
                            + "\' non-void no retorna ningún valor" + Colors.ANSI_RESET);

                else if (estadoReturn == EstadoReturn.RET_VOID)
                    printError(ctx, "La función non void \'" + f.getNombre() + "\' debe retornar un valor");
            } else if (estadoReturn == EstadoReturn.RET_VAL)
                printError(ctx, "La función void \'" + f.getNombre() + "\' no debería retornar un valor");
        }
    }

    public void checkIncremento(Expresion_postfijaContext ctx, String nombreVariabile) {
        Id var = checkDeclarado(ctx, nombreVariabile);
        if (var instanceof Funcion)
            printError(ctx, "no es posible incrementar o decrementar un valor de tipo \'"
                    + var.toString() + "\' ");
        else
            var.setUsado(true);
    }

}
