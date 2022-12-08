package compiladores.TablaSimbolos;

public class Variable extends Id{

    public Variable(TipoDato currentSpecificador, String currentId) {
        super.setTipo(currentSpecificador);
        super.setNombre(currentId);
    }

    public Variable() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
