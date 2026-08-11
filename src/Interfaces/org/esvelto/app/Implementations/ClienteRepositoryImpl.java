package Interfaces.org.esvelto.app.Implementations;

import Interfaces.org.esvelto.app.models.Cliente;
import Interfaces.org.esvelto.app.repository.ClienteRepository;
import Interfaces.org.esvelto.app.types.Direccion;

import java.util.List;

public class ClienteRepositoryImpl {

    private ClienteRepository repository;
    private List<Cliente> clientes;

    public ClienteRepositoryImpl(List<Cliente> clientes, ClienteRepository repository) {
        this.repository = repository;
        this.clientes = clientes;
    }

    public int mostrarOpciones() {
        IO.println("1) Listar Clientes.");
        IO.println("2) Listar Clientes Filtrados por un campo y dirección.");
        IO.println("3) Listar Clientes Filtrados desde y hasta.");
        IO.println("4) Agregar Clientes");
        IO.println("5) Editar Cliente");
        IO.println("6) Buscar Cliente Por ID");
        IO.println("7) Eliminar Cliente");
        IO.println("8) Salir");
        return Integer.parseInt(IO.readln("Introduzca una opción -> "));
    }

    public int total() {
        return repository.total();
    }

    public void imprimirClientes(List<Cliente> clientes) {
        IO.println();
        IO.println("Total de clientes -> " + total());
        IO.println();
        IO.println();
        for (Cliente cliente : clientes) {
            IO.println(cliente.getId() + " " + cliente.getNombre() + " " + cliente.getApellido());
        }
        IO.println();
    }

    public void filtrarClientes(String dir, String campo) {
        if (dir.equalsIgnoreCase("asc")) {
            IO.println();
            IO.println("Clientes filtrados por el campo -> " + campo + " Dirección -> " + dir.toUpperCase());
            clientes = repository.listar(campo.toLowerCase(), Direccion.ASC);
            imprimirClientes(clientes);
        } else if (dir.equalsIgnoreCase("desc")) {
            clientes = repository.listar(campo.toLowerCase(), Direccion.DESC);
            IO.println();
            IO.println("Clientes filtrados por el campo -> " + campo + " Dirección -> " + dir.toUpperCase());
            imprimirClientes(clientes);
        }
    }

    public void paginarClientes(String desde, String hasta) {
        clientes = repository.listar(Integer.parseInt(desde), Integer.parseInt(hasta));
        IO.println();
        IO.println("Clientes filtrados desde " + desde + " hasta -> " + hasta + ".");
        imprimirClientes(clientes);
    }

    public void addCliente(String nombre, String apellido) {
        repository.add(new Cliente(nombre, apellido));

        IO.println();
        IO.println("Cliente agregado con éxito");
        String imprimir = IO.readln("Desea ver ahora todos los clientes? (Y/N) -> ");
        if (imprimir.equalsIgnoreCase("y")) {
            imprimirClientes(clientes);
        }
    }

    public void editarCliente(String id, String nombre, String apellido) {
        Cliente cliente = new Cliente(nombre, apellido);
        cliente.setId(Integer.parseInt(id));
        repository.editar(cliente);

        IO.println();
        IO.println("Cliente editado con éxito");
        String imprimir = IO.readln("Desea ver ahora todos los clientes? (Y/N) -> ");
        if (imprimir.equalsIgnoreCase("y")) {
            imprimirClientes(clientes);
        }
    }

    public void getClienteById(String id) {
        Cliente cliente = repository.getById(Integer.parseInt(id));

        IO.println();
        IO.println("Cliente encontrado con éxito");
        IO.println(cliente.getId() + " " + cliente.getNombre() + " " + cliente.getApellido());
    }

    public void eliminarCliente(String id) {
        Cliente cliente = repository.getById(Integer.parseInt(id));

        IO.println();
        String confirmacion = IO.readln("Seguro que quiere eliminar al cliente -> " + cliente.getId() + " " + cliente.getNombre() + " " + cliente.getApellido() + "(Y/N) -> ");
        if (confirmacion.equalsIgnoreCase("y")) {
            repository.eliminar(Integer.parseInt(id));
            IO.println("Cliente eliminado con éxito");
        }

        IO.println();
        String imprimir = IO.readln("Desea ver ahora todos los clientes? (Y/N) -> ");
        if (imprimir.equalsIgnoreCase("y")) {
            clientes = repository.listar();
            imprimirClientes(clientes);
        }
    }
}
