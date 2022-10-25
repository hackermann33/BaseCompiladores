package compiladores.TablaSimbolos;

import java.util.LinkedList;
import java.util.List;

public class Funcion extends Id {
    private List<Variable> args;

    public Funcion() {
        this.args = new LinkedList<Variable>();
    }

    public void addArgumento(Variable id){
        args.add(id);
    }

    public List<Variable> getArgs() {
        return args;
    }

    @Override
    public String toString() {
        return "Funcion [args=" + args + "]";
    }    
    
}
