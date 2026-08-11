package Interfaces.org.esvelto.app.Irepository;

import java.util.List;

public interface Irepository<T> {
    List<T> listar();

    T getById(Integer id);

    void add(T x);

    void editar(T x);

    void eliminar(Integer id);
}



