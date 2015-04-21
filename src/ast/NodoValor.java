package ast;

public class NodoValor extends NodoBase {
	private Integer valor;
    private NodoBase nodo;
    
    
	public NodoValor(Integer valor) {
		super();
		this.valor = valor;
	}
	
	public NodoValor(NodoBase val) {
		super();
		this.nodo = val;
	}
	

	public NodoValor() {
		super();
	}
	
	public Integer getValor() {
		return valor;
	}

}
