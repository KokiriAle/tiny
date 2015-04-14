
package ast;

public class NodoLPar extends NodoBase {
		
    private NodoBase listaPar;
    private NodoBase par;

    public NodoLPar(NodoBase listaPar, NodoBase par) {
        super();
        this.listaPar = listaPar;
        this.par = par;
    }

    public NodoBase getlistaPar() {
        return listaPar;
    }

    public void setlistaPar(NodoBase listaPar) {
        this.listaPar = listaPar;
    }

    public NodoBase getpar() {
        return par;
    }

    public void setpar(NodoBase par) {
        this.par = par;
    }
   
}
