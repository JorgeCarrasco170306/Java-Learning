package excepciones;

// si heredamos de exception es obligatorio manejarla (checked)
public class DivisionPorZeroException extends Exception {
    public DivisionPorZeroException(String message) {
        super(message);
    }
}
