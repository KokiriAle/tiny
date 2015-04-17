package ast;

public class NodoBloque extends NodoBase {

	private NodoBase declararfun;
	private NodoBase cuerpo;
	
	public NodoBloque(NodoBase declararfun, NodoBase cuerpo) {
		super();
		this.declararfun = declararfun;
		this.cuerpo = cuerpo;
		System.out.println("messaje");
	}
	
	public NodoBloque() {
		super();
		this.declararfun = null;
		this.cuerpo = null;	
	}

	public NodoBase getdeclararfun() {
		return declararfun;
	}

	public void setdeclararfun(NodoBase declararfun) {
		this.declararfun = declararfun;
	}

	public NodoBase getcuerpo() {
		return cuerpo;
	}

	public void setcuerpo(NodoBase cuerpo) {
		this.cuerpo = cuerpo;
	}
	
}
