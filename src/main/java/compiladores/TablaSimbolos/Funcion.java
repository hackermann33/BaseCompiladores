package compiladores.TablaSimbolos;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class Funcion extends Id {
    private List<TipoDato> args = new LinkedList<TipoDato>();

    public Funcion(TipoDato td, String nombre) {
        super.setNombre(nombre);
        super.setTipo(td);
    }

    public void addArgumento(TipoDato id){
        args.add(id);
    }

    public List<TipoDato> getArgs() {
        return args;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(",");
        args.forEach(item -> joiner.add(item.toString().toLowerCase()));
        return super.toString() + "(" + joiner.toString() + ")";
    }    
    
}
