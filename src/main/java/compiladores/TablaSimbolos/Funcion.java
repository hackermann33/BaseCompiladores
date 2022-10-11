package compiladores.TablaSimbolos;

import java.util.LinkedList;
import java.util.List;

public class Funcion extends Id {
    private List<TipoDato> args;

    public Funcion() {
        this.args = new LinkedList<TipoDato>();
    }

    public void addArgumento(TipoDato id){
        args.add(id);
    }
    
}
