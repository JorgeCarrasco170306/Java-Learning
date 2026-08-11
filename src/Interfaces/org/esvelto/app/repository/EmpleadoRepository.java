package Interfaces.org.esvelto.app.repository;

import Interfaces.org.esvelto.app.Irepository.CrudOrdenablePaginableRepository;
import Interfaces.org.esvelto.app.models.Empleado;
import Interfaces.org.esvelto.app.types.Direccion;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository implements CrudOrdenablePaginableRepository<Empleado> {

   List<Empleado> datasource = new ArrayList<>();

    @Override
    public int total() {
        return datasource.size();
    }

    @Override
    public List<Empleado> listar(String campo, Direccion direccion) {
        return List.of();
    }

    @Override
    public List<Empleado> listar(int desde, int hasta) {
        return List.of();
    }

    @Override
    public List<Empleado> listar() {
        return List.of();
    }

    @Override
    public Empleado getById(Integer id) {
        return null;
    }

    @Override
    public void add(Empleado x) {

    }

    @Override
    public void editar(Empleado x) {

    }

    @Override
    public void eliminar(Integer id) {

    }
}
