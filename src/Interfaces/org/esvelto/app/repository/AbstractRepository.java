package Interfaces.org.esvelto.app.repository;

import Interfaces.org.esvelto.app.Irepository.CrudOrdenablePaginableRepository;
import Interfaces.org.esvelto.app.Irepository.Identificable;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<T extends Identificable>
        implements CrudOrdenablePaginableRepository<T> {

    protected List<T> dataSource;

    public AbstractRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public void add(T item) {
        if (item != null) {
            dataSource.add(item);
        }
    }

    @Override
    public T getById(Integer id) {
        for (T item : dataSource) {
            if (item.getId().equals(id)) {
                return item;
            }
        }

        return null;
    }

    @Override
    public void eliminar(Integer id) {
        T item = getById(id);

        if (item != null) {
            dataSource.remove(item);
        }
    }

    @Override
    public int total() {
        return dataSource.size();
    }

}