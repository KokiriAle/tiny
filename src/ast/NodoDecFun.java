package ast;

public class NodoDecFun extends NodoBase {
		
    private NodoBase tipo;
    private NodoBase ident;
    private NodoBase listaDP;
    private NodoBase cuerpo;

    public NodoDecFun(NodoBase tipo, NodoBase ident, NodoBase listaDP, NodoBase cuerpo) {
        super();
        this.tipo = tipo;
        this.ident = ident;
        this.listaDP = listaDP;
        this.cuerpo = cuerpo;
    }
    

    public NodoBase getDFcuerpo() {
        return cuerpo;
    }

    public void setDFcuerpo(NodoBase cuerpo) {
        this.cuerpo = cuerpo;
    }

    public NodoBase getDFlistaDP() {
        return listaDP;
    }

    public void setDFlistaDP(NodoBase listaDP) {
        this.listaDP = listaDP;
    }

    public NodoBase getDFident() {
        return ident;
    }

    public void setDFident(NodoBase ident) {
        this.ident = ident;
    }

    public NodoBase getDFtipo() {
        return tipo;
    }

    public void setDFtipo(NodoBase tipo) {
        this.tipo = tipo;
    }
    
}
