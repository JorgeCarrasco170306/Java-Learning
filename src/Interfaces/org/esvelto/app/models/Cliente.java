package Interfaces.org.esvelto.app.models;

import Interfaces.org.esvelto.app.Irepository.Identificable;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>, Identificable {
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this();
    }

    public Cliente() {
        this.id = ultimoId++;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(id, cliente.id) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cliente o) {
        return 0;
    }
}
