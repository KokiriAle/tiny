package ast;

public class NodoExpresion extends NodoBase {
    private NodoBase var1;
	private NodoBase var2;

    public NodoExpresion(NodoBase v,NodoBase t) {
        super();
        
		var1=v;
		var2=t;
    }

    public NodoBase getType1() {
        return var1;
    }

 public NodoBase getType2() {
        return var2;
    }
   
    
    
}