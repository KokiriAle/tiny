
package ast;

public class NodoLVar extends NodoBase {
		
    private NodoBase listaVar;
    private NodoBase fac;

    public NodoLVar(NodoBase listaVar, NodoBase fac) {
        super();
        this.listaVar = listaVar;
        this.fac = fac;
    }

    public NodoBase getlistaVar() {
        return listaVar;
    }

    public void setlistaVar(NodoBase listaVar) {
        this.listaVar = listaVar;
    }

    public NodoBase getfac() {
        return fac;
    }

    public void setfac(NodoBase fac) {
        this.fac = fac;
    }
   
}
