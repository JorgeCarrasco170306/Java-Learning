package POO;

public interface IAutomovil {
    String acelerar(int kmh);
    String acelerar(int kmh, String carretera);
    String frenar(int kmh, String carretera);
    String saludarAlDueno(String message);
}
