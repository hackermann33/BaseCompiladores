package compiladores.TablaSimbolos;

import org.antlr.v4.runtime.ParserRuleContext;

import compiladores.Colors;
import compiladores.TablaSimbolos.Id.TipoDato;

/*TODO: Make it singleton */
public class Helper {
    private static TablaSimbolos ts = TablaSimbolos.getInstanceOf();
    private static TipoDato specificadorActual = null;

    /*
     * 
     * 
     */
    /**
     * Función que recibe un id y genera errores si el id no está presente
     * en la
     * tabla de símbolos o si está presente pero es una función.
     * 
     * @param id nombre del identificador
     */
    public static boolean checkAsignacion(ParserRuleContext ctx, String id, Boolean operadorDerecho) {
        Id idCorrente;
        boolean errors = false;
        if ((idCorrente = ts.buscarSimbolo(id)) == null) {
            printError(ctx, "uso del identificador no declarado \'"
                    + id + "\' ");
            errors = true;
        } else if (!operadorDerecho && (idCorrente = ts.buscarSimbolo(id)) instanceof Funcion) {
            printError(ctx, "función \'"
                    + id + "\' " + " no es asignable");
            errors = true;
        } else {
            idCorrente.setInicializado(true);
        }
        return errors;
    }

    public static void printError(ParserRuleContext ctx, String text) {
        System.out.println(Colors.RED_BOLD + getPoint(ctx) + ": error: " + text + Colors.ANSI_RESET);
    }

    static String getPoint(ParserRuleContext ctx) {
        return ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
    }

    public static TipoDato getSpecificadorActual() {
        return specificadorActual;
    }

    public static void setSpecificadorActual(TipoDato specificador) {
        specificadorActual = specificador;
    }

    public static void resetSpecificadorActual(TipoDato specificador) {
        specificadorActual = specificador;
    }



}
