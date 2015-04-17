package ast;

public class NodoIdentificador extends NodoBase {
	private String nombre;
	private NodoType  var;

	public NodoIdentificador(String nombre,NodoType val ) {
		super();
		this.nombre = nombre;
		var=val;
	}
	
	public NodoIdentificador(String nombre) {
		super();
		this.nombre = nombre;
		var=null;
	}

	public NodoIdentificador() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

}
