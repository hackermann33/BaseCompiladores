package compiladores.TablaSimbolos;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import compiladores.Colors;

public class TablaSimbolos {
    public static final String ANSI_RESET = "\u001B[0m";

    private static TablaSimbolos instancia = null;
    
    private List<Map<String,Id>> tabla = null;

    private TablaSimbolos() {
        tabla = new LinkedList<Map<String,Id>>();
        tabla.add(new HashMap<String, Id>());
    }
    
    public static TablaSimbolos getInstanceOf(){
        if (instancia == null){
            instancia = new TablaSimbolos();
        }
        return instancia;
    }


    /**
     * Function that adds a new context at the symbol table
     * @return the number of current contexts is returned  
     */
    public int addContexto() {
        tabla.add(new HashMap<String, Id>());
        return tabla.size();
    }
    
    /**
     * Function that remove a context from the symbol table
     * @return the number of current contexts
     */
    public int delContexto() {
        tabla.remove(tabla.size()-1);
        return tabla.size();
    }

    /* Function that add a symbol in the current context. 
     */
    public void addSimbolo(Id id) {
        if(!tabla.isEmpty()){
            tabla.get(tabla.size()-1).put(id.getNombre(), id);
        }
        return ;
    }

    /**
     * Function that looks for a symbol in all the contexts. Is used when
     * a symbol is used0
     * @param idNombre: name of the symbol that you're looking for
     * @return Id that corresponds to the name specified in the parameter. If more that one 
     * Id is found, that one present in the most recent context is returned
     */
    public Id buscarSimbolo(String idNombre) {
        if(tabla.size() == 0)
            return null;
        Map<String, Id> m;
        Id retId = null;

        for(int j = tabla.size()-1; j >= 0; j--){
            m = tabla.get(j);
            retId = m.get(idNombre);
            if(retId != null)
                return retId;
        }
        return retId;
    }

    /**
     * Function that looks for a symbol in the local context. Is used when
     * a new symbol is declared
     * @param idNombre: name of the symbol that you're looking for
     * @return Id that corresponds to the the name specified in the parameter
     * or null if the Id is not found
     */
    public Id buscarSimboloLocal(String idNombre) {
        if(tabla.size() == 0)
            return null;
        return tabla.get(tabla.size()-1).get(idNombre);
    }
    public void imprimeWarnings() {
        String tipo;
        String fin;
        Map<String,Id> con = tabla.get(tabla.size()-1);
        for(Id id: con.values()){
            tipo = (id instanceof Funcion) ? "función" : "variable";
            fin = (id instanceof Funcion) ? "definida" : "inicializada";
            
            if(!id.getUsado())
                System.err.println(Colors.CYAN_BOLD + "warning: "+"La " + tipo + " \'" + id.getNombre() + "\' nunca se utiliza" + Colors.ANSI_RESET);
            if(!id.getInicializado())
                System.err.println(Colors.CYAN_BOLD + "warning: "+"La " + tipo + " \'" + id.getNombre() + "\' no está " + fin + Colors.ANSI_RESET);
        }
    }

    @Override
    public String toString() {

        String str = "Tabla de símbolos:\n";


    
        String leftAlignFormat = " %-3s | %-5s | %-27s | %-6s | %-7s |\n";

        
        str+=("+----+-------+-----------------------------+--------+---------+\n");
        str+=(" CTX |  KEY  |            VALUE            |  INIT  |  USADA  |\n");
        str+=("+----+-------+-----------------------------+--------+---------+\n");
        
        for(int i = 0; i < tabla.size(); i++){
            for(String k : tabla.get(i).keySet()){
                Id val = tabla.get(i).get(k);
                str += String.format(leftAlignFormat, i, k, val, val.getInicializado(), val.getUsado());
            }
            if(!tabla.get(i).keySet().isEmpty())
                str+=("+----+-------+-----------------------------+--------+---------+\n");

            //str +="\n";
        }
        return str;// return "TablaSimbolos: tabla=" + tabla;
    }

}
