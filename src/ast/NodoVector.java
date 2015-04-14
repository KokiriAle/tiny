package ast;

public class NodoVector extends NodoBase {

	private NodoBase identificador;
	private NodoBase interno;
	
	public NodoVector(NodoBase identificador, NodoBase interno) {
		super();
		this.identificador = identificador;
		this.interno = interno;
	}
	
	public NodoVector() {
		super();
		this.identificador = null;
		this.interno = null;	
	}
	
	public NodoBase getIdentificador() {
		return identificador;
	}

	public void setIdentificador(NodoBase identificador) {
		this.identificador = identificador;
	}
	
	public NodoBase getInterno() {
		return interno;
	}

	public void setInterno(NodoBase interno) {
		this.interno = interno;
	}
	

}