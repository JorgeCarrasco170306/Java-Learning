package excepciones;

// si heredamos de exception es obligatorio manejarla (checked)
public class FormatoNumeroException extends Exception {
    public FormatoNumeroException(String message) {
        super(message);
    }
}
