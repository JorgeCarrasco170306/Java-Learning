package Interfaces.org.esvelto.app.models;

import Interfaces.org.esvelto.app.Irepository.Identificable;

public class ClientePremium extends Cliente implements Comparable<Cliente>, Identificable {
    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

}
