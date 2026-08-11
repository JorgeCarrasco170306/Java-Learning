package Interfaces.org.esvelto.app.models;


import Interfaces.org.esvelto.app.Irepository.Identificable;

public class Empleado extends Cliente implements Identificable {

    private String codigoEmpleado;

    public Empleado(String nombre, String apellido, String codigoEmpleado) {
        super(nombre, apellido);
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
}
