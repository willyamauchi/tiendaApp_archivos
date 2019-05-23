

package Excepcion;


public class usuarioIncorrecto extends RuntimeException{
    private int CodigoError;

    public usuarioIncorrecto(String msj) {
        super(msj);
    }

    public usuarioIncorrecto(CodigoError codigoError) {
        super(String.valueOf(codigoError));
        this.CodigoError=codigoError.getCodigoError();
    }
    
    public int getCodigoError(){
        return CodigoError;
    }
    
}
