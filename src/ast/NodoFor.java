package ast;

public class NodoFor extends NodoBase {
		
    private NodoBase st1;
    private NodoBase ex;
    private NodoBase st2;
    private NodoBase list_sent;

    public NodoFor(NodoBase st1, NodoBase ex, NodoBase st2, NodoBase list_sent) {
        super();
        this.st1 = st1;
        this.ex = ex;
        this.st2 = st2;
        this.list_sent = list_sent;
    }
    

    public NodoBase getforlist_sent() {
        return list_sent;
    }

    public void setforlist_sent(NodoBase list_sent) {
        this.list_sent = list_sent;
    }

    public NodoBase getforst2() {
        return st2;
    }

    public void setforst2(NodoBase st2) {
        this.st2 = st2;
    }

    public NodoBase getforex() {
        return ex;
    }

    public void setforex(NodoBase ex) {
        this.ex = ex;
    }

    public NodoBase getforst1() {
        return st1;
    }

    public void setforst1(NodoBase st1) {
        this.st1 = st1;
    }
    
}
