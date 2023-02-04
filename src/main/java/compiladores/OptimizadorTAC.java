package compiladores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OptimizadorTAC {
    private String fileName;
    ArrayList<CodigoTresDirecciones> codigo = new ArrayList<>();

    public OptimizadorTAC(String fileName) {
        this.fileName = fileName;

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                if (!scanner.nextLine().startsWith("//")) {

                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void optimiza() {

    }

}

class CodigoTresDirecciones {
    private String resultado;
    private String operador;
    private int operando1;
    private int operando2;

    public CodigoTresDirecciones(String result, String operator, int operand1, int operand2) {
        this.resultado = result;
        this.operador = operator;
        this.operando1 = operand1;
        this.operando2 = operand2;
    }

    public CodigoTresDirecciones(String result, String operator, String operand1, String operator2, String operand2) {
        this.resultado = result;
        this.operador = operator;
        this.operando1 = Integer.parseInt(operand1);
        this.operando2 = Integer.parseInt(operand2);
    }

    public boolean isBinaryOperation() {
        return "+".equals(operador) || "-".equals(operador) || "*".equals(operador) || "/".equals(operador);
    }
}