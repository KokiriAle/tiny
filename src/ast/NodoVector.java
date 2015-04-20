package ast;

public class NodoVector extends NodoBase {

	private NodoBase identificador;
	private NodoBase indice;
	private NodoValor indice2;
	private int in;
	
	public NodoVector(NodoBase identificador, NodoBase indice) {
		super();
		this.identificador = identificador;
		this.indice = indice;
	}
	
	public NodoVector(NodoBase Identificador,int indice2) {
		super();
		this.identificador = null;
		//this.indice2 = new NodoValor(indice2);
		in=indice2;
	}
	
	public NodoBase getIdentificador() {
		return identificador;
	}

	public void setIdentificador(NodoBase identificador) {
		this.identificador = identificador;
	}
	public NodoBase getIndice() {
		return indice;
	}

	public void setIndice(NodoBase indice) {
		this.indice = indice;
	}
	
	public NodoValor getIndice2() {
		return indice2;
	}

	public void setIndice2(NodoValor indice2) {
		this.indice2 = indice2;
	}
	

}