package Excepcion;

public enum CodigoError {
    ERROR_USUARIO_INCORRECTO(111),
    ERRROR_PASSWORD_INCORRECTO(222);

    private int codigo;

    private CodigoError(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoError() {
        return codigo;
    }

}
