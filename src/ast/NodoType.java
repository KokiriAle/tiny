package ast;

public class NodoType extends NodoBase {
    
    String tipo;

    public NodoType(String tipo) {
        super();
        
        this.tipo = tipo;
    }

    public String getType() {
        return tipo;
    }

    public void setType(String tipo) {
        this.tipo = tipo;
    }
    
    
}