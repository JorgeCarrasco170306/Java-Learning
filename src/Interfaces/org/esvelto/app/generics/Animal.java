package Interfaces.org.esvelto.app.generics;

public class Animal {
    private final String tipo;
    private final String nombre;

    public Animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
}
