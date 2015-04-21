package compilador;
package ast;

import ast.*;

public class RegistroSimbolo {
	private String identificador;
	private int NumLinea;
	private int DireccionMemoria;
	private String ambito;			/*Indica si es funcion o cuerpo ppal */
	private String ambitoNombre;	/*Indica el nombre del ambito o main si estamos dentro el main */
	private String tipoDato;		/*Indica el tipo de valor del dato */
	private String tipoSimbolo;		/*Indica el tipo de simbolo: for if else funcion main  */

	public RegistroSimbolo(String identificador, int numLinea,
			int direccionMemoria) {
		super();
		this.identificador = identificador;
		NumLinea = numLinea;
		DireccionMemoria = direccionMemoria;
	}

	public RegistroSimbolo(String identificador, int numLinea,
			int direccionMemoria,String ambito, String ambitoNombre, String tipoDato,String tipoSimbolo) {
		super();
		this.identificador = identificador;
		NumLinea = numLinea;
		DireccionMemoria = direccionMemoria;
		this.ambito = ambito;
		this.ambitoNombre = ambitoNombre;
		this.tipoDato = tipoDato;
		this.tipoSimbolo = tipoSimbolo;
	}

	public String getIdentificador() {
		return identificador;
	}

	public int getNumLinea() {
		return NumLinea;
	}

	public int getDireccionMemoria() {
		return DireccionMemoria;
	}

	public void setDireccionMemoria(int direccionMemoria) {
		DireccionMemoria = direccionMemoria;
	}
}
