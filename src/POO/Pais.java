package POO;

public enum Pais {

    REPUBLICA_DOMINICANA("República Dominicana", "DO", "América"),
    ESTADOS_UNIDOS("Estados Unidos", "US", "América"),
    ESPANA("España", "ES", "Europa"),
    JAPON("Japón", "JP", "Asia");

    private final String nombre;
    private final String codigo;
    private final String continente;

    Pais(String nombre, String codigo, String continente) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getContinente() {
        return continente;
    }
}