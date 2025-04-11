public class NotaInvalidaException extends Exception{
    public NotaInvalidaException(String mensaje){
        super(" ❌ Nota introducida no valida. Rango entre 1 y 10.");
    }
}
