package compiladores.TablaSimbolos;



public abstract class Id {

    public enum TipoDato {
        VOID,
        INT,
        DOUBLE
    }
    
    private String nombre;
    private TipoDato tipo;
    private Boolean inicializado = false;
    private Boolean usado = false;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDato getTipo() {
        return tipo;
    }
    public void setTipo(TipoDato tipo) {
        this.tipo = tipo;
    }
    
    public Boolean getInicializado() {
        return inicializado;
    }
    public void setInicializado(Boolean inicializado) {
        this.inicializado = inicializado;
    }
    
    public Boolean getUsado() {
        return usado;
    }
    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    @Override
    public String toString() {
        return tipo.toString() + " " + nombre;
    }

}
