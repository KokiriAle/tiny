package ast;

public class NodoCall extends NodoBase {
	private String ident;
	private NodoBase lista_parm;

	public NodoCall(String ident, NodoBase lista_parm) {
		super();
		this.ident = ident;
		this.lista_parm=lista_parm;
	}
	
	public void setLPident(String ident){
		this.ident = ident;
	}

	public String getLPident() {
		return ident;
	}
	
	public void setLPlista_parm(NodoBase lista_parm){
		this.lista_parm = lista_parm;
	}

	public String getLPlista_parm() {
		return lista_parm;
	}

}
