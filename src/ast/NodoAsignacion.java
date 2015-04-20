package ast;

public class NodoAsignacion extends NodoBase {
	//private String identificador;
	private NodoBase expresion;
	private NodoBase expresion2;
	private NodoType identificador;
	
	public NodoAsignacion(NodoType identificador) {
		super();
		this.identificador = identificador;
		this.expresion = null;
	}
	
	public NodoAsignacion(String var, NodoBase expresion) {
		super();
		
		this.identificador = new NodoType(var);
		this.expresion = expresion;
	}
	
	public NodoAsignacion(NodoBase var, NodoBase expresion) {
		super();
		
		this.expresion = var;
		this.expresion2 = expresion;
	}

	
	public String getIdentificador() {
		return  identificador.tipo;
	}


	public void setIdentificador(NodoType identificador) {
		this.identificador = identificador;
	}

	public NodoBase getExpresion() {
		return expresion;
	}

	public void setExpresion(NodoBase expresion) {
		this.expresion = expresion;
	}
	
	
	
}
