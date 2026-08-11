package Interfaces.org.esvelto.app.Irepository;


import java.util.List;

public interface IPaginableRepository<T> {
    List<T> listar(int desde, int hasta);
}
