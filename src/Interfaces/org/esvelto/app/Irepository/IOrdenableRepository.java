package Interfaces.org.esvelto.app.Irepository;

import Interfaces.org.esvelto.app.types.Direccion;

import java.util.List;

public interface IOrdenableRepository<T> {

    List<T> listar(String campo, Direccion direccion);

}
