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
            Scanner scanner = new Scanner(new File(this.fileName));
            String[] tokens = new String[5];
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.startsWith("//")) {
                    // Optimize arithmetic identities
                    int i = 0;
                    for (String tok : line.split(" ")) {
                        tokens[i++] = tok;
                    }

                    CodigoTresDirecciones ctd = new CodigoTresDirecciones(tokens[0], tokens[2],
                            tokens[3], tokens[4]);

                    codigo.add(ctd);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void optimiza() {
        Boolean mod;
        do {
            mod = false;
            for (CodigoTresDirecciones ctd : codigo) {

                ctd.identidadesAritmetica();

                CodigoTresDirecciones modCtd = ctd;
                if (!modCtd.equals(ctd)) {
                    mod = true;
                }
                System.out.println(modCtd);
            }
        } while (mod == true);

    }

}


class CodigoTresDirecciones {
    private String resultado;
    private String operador;
    private String operando1;
    private String operando2;

    public CodigoTresDirecciones(String result, String operand1, String operador, String operand2) {
        this.resultado = result;
        this.operador = operador;
        this.operando1 = operand1;
        this.operando2 = operand2;
    }

    public void identidadesAritmetica() {
        switch (operador) {
            case "+":
                if (operando1.equals("0")) {
                    operando1 = operando2;
                    operador = null;
                    operando2 = null;
                } else if (operando2.equals("0")) {
                    operando2 = null;
                    operador = null;
                }
                break;
            case "-":
                if (operando2.equals("0")) {
                    operador = null;
                    operando2 = null;
                } else if (operando1.equals("0")) {
                    operando1 = "-" + operando2;
                    operando2 = null;
                    operador = null;
                } else if (operando1.equals(operando2)) {
                    operando1 = "0";
                    operando2 = null;
                    operador = null;
                }
                break;
            case "*":
                if (operando1.equals("1") || operando2.equals("1")) {
                    operando1 = !operando1.equals("1") ? operando1 : operando2;
                    operador = null;
                    operando2 = null;
                } else if (operando1.equals("-1") || operando2.equals("-1")) {
                    operando1 = !operando1.equals("-1") ? "-" + operando1 : "-" + operando2;
                    operador = null;
                    operando2 = null;
                }
                break;

            case "/":
                break;
            default:
                System.out.println("Error: something is wrong!");

        }
    }

    // public CodigoTresDirecciones(String result, String operadorAsign, String
    // operand1, String operator,
    // String operand2) {
    // this.resultado = result;

    // operator = this.operador;
    // this.operando1 = (operand1);
    // this.operando2 = (operand2);
    // }

    public boolean isBinaryOperation() {

        return "+".equals(operador) || "-".equals(operador) || "*".equals(operador)
                || "/".equals(operador);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CodigoTresDirecciones))
            return false;
        CodigoTresDirecciones ctd = (CodigoTresDirecciones) obj;

        if (this.resultado == ctd.resultado
                && this.operando1 == ctd.operando1
                && this.operando2 == ctd.operando2)
            return true;
        return false;
    }

    @Override
    public String toString() {
        String toRet = "";
        toRet += resultado + " = " + operando1;
        if (operador != null)
            toRet += " " + operador + " " + operando2;

        return toRet;
    }
}
