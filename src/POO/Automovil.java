package POO;

import java.util.Objects;

public final class Automovil implements IAutomovil{

    private String modelo;
    private String fabricante;
    private Color color;
    private Pais pais;
    private Dueno dueno;
    private double cilindrada;
    private static final String dealer = "Droklyn";

    public Automovil(String modelo, String fabricante, Color color, double cilindrada) {
        //esto es una funcion especial que se ejecuta siempre que se istancia la clase
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(Pais pais, String modelo, String fabricante, Color color, double cilindrada) {
        //esto es una funcion especial que se ejecuta siempre que se istancia la clase
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(Dueno dueno, String modelo, String fabricante, Color color, double cilindrada) {
        //esto es una funcion especial que se ejecuta siempre que se istancia la clase
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.color = color;
        this.cilindrada = cilindrada;
        this.dueno = dueno;
    }

    public Automovil() {
        System.out.println("Se ejecutó el constructor sin args");
    }

    public String acelerar(int kmh) {
        return "Automovil " + this.modelo + " acelerando a " + kmh;
    }

    public String acelerar(int kmh, String carretera) {
        return "Automovil " + this.modelo + " acelerando a " + kmh + " en la carretera " + carretera;
    }

    public String frenar(int kmh, String carretera) {
        return "Automovil " + this.modelo + " frenando a " + kmh + " en la carretera " + carretera;
    }

    public static String saludarDesdeElDealer(String message) {
        return "Saludando desde " + dealer + " " + message;
    }

    public String saludarAlDueno(String message) {
        return "Saludos! " + this.dueno.getNombre() + " " + this.dueno.getApellido();
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Automovil automovil)) return false;
        return Double.compare(cilindrada, automovil.cilindrada) == 0 && Objects.equals(modelo, automovil.modelo) && Objects.equals(fabricante, automovil.fabricante) && color == automovil.color && pais == automovil.pais && Objects.equals(dueno, automovil.dueno);
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", color=" + color +
                ", pais=" + pais +
                ", dueno=" + dueno +
                ", cilindrada=" + cilindrada +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, fabricante, color, pais, dueno, cilindrada);
    }
}
