package ast;

public class UnidadTipoVar {
    
    String tipoVar[]={"int","bool","void"};
    String scope[]={"funcion","main"};

public RegistroSimbolo(String identificador, int numLinea,
        int direccionMemoria) {
        super();
        this.identificador = identificador;
        NumLinea = numLinea;
        DireccionMemoria = direccionMemoria;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getNumLinea() {
        return NumLinea;
    }

   
    
}