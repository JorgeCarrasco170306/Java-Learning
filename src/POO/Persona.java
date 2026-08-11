package POO;

import java.util.Objects;

public abstract sealed class Persona permits Dueno {

    private static int contadorId = 0;

    private int id;
    private String nombre;
    private String apellido;
    private Pais pais;

    public Persona(String nombre, String apellido, Pais pais) {
        this.id = ++contadorId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    public abstract String saludar(String message);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais=" + pais +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Persona persona)) return false;

        return id == persona.id &&
                Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellido, persona.apellido) &&
                pais == persona.pais;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, pais);
    }
}