package Interfaces.org.esvelto.app.repository;

import Interfaces.org.esvelto.app.models.Cliente;
import Interfaces.org.esvelto.app.types.Direccion;

import java.util.List;

public class ClienteRepository extends AbstractRepository<Cliente> {

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {

        dataSource.sort((a, b) -> {

            int resultado = 0;

            if (direccion == Direccion.ASC) {

                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                }

            } else if (direccion == Direccion.DESC) {

                switch (campo) {
                    case "id" -> resultado = b.getId().compareTo(a.getId());
                    case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                    case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                }
            }

            return resultado;
        });

        return dataSource;
    }

    @Override
    public void editar(Cliente cliente) {

        Cliente c = getById(cliente.getId());

        if (c != null) {
            if (cliente.getNombre() != null) {
                c.setNombre(cliente.getNombre());
            }

            if (cliente.getApellido() != null) {
                c.setApellido(cliente.getApellido());
            }
        }
    }

}