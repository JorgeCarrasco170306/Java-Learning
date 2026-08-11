import Interfaces.org.esvelto.app.Implementations.ClienteRepositoryImpl;
import Interfaces.org.esvelto.app.models.Cliente;
import Interfaces.org.esvelto.app.repository.ClienteRepository;

ClienteRepository r = new ClienteRepository();
List<Cliente> clientes;
ClienteRepositoryImpl repository = new ClienteRepositoryImpl(clientes, r);

void main() {

    System.out.println("Bienvenido al manager de clientes Java");

    boolean salir = false;
    do {

        int opcion = repository.mostrarOpciones();

        switch (opcion) {
            case 1 -> {
                IO.println();
                IO.println("Clientes:");
                repository.imprimirClientes(clientes);
            }
            case 2 -> {
                IO.println();
                String dir = IO.readln("Introduzca la dirección (\"DESC\" - \"ASC\" -> ");
                String campo = IO.readln("Introduzca el campo a filtrar (\"NOMBRE\" \"APELLIDO\" \"ID\") -> ");
                repository.filtrarClientes(dir, campo);
            }
            case 3 -> {
                IO.println();
                String desde = IO.readln("Introduzca desde donde comenzar -> ");
                String hasta = IO.readln("Introduzca hasta donde filtrar -> ");

                repository.paginarClientes(desde, hasta);

            }
            case 4 -> {
                IO.println();
                String nombre = IO.readln("Introduzca el nombre del cliente -> ");
                String apellido = IO.readln("Introduzca el apellido del cliente -> ");

                repository.addCliente(nombre, apellido);

            }
            case 5 -> {
                IO.println();
                String id = IO.readln("Introduzca el id del cliente -> ");
                String nombre = IO.readln("Introduzca el nombre del cliente -> ");
                String apellido = IO.readln("Introduzca el apellido del cliente -> ");
                repository.editarCliente(id, nombre, apellido);
            }
            case 6 -> {
                IO.println();
                String id = IO.readln("Introduzca el id del cliente -> ");
                repository.getClienteById(id);
            }
            case 7 -> {
                IO.println();
                String id = IO.readln("Introduzca el id del cliente -> ");
                repository.eliminarCliente(id);
            }
            case 8 -> {
                IO.println();
                IO.println("Hasta luego!");
                salir = true;
            }
            default -> IO.println("Parece que introdujiste una opción que no existe!");
        }
    } while (!salir);
}

