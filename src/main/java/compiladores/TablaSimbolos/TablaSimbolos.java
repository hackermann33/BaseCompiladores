package compiladores.TablaSimbolos;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
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
     * @return the number of current contexts is returned  
     */
    public void delContexto() {
        assert(tabla.size() > 0);
        tabla.add(new HashMap<String, Id>());
    }

    public void addSimbolo(Id id) {
        if(!tabla.isEmpty()){
            assert(tabla.get(tabla.size()-1).get(id.getNombre()) == null);
            tabla.get(tabla.size()-1).put(id.getNombre(), id);
        }
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

}
