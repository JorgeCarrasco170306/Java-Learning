import Interfaces.org.esvelto.app.models.Cliente;
import Interfaces.org.esvelto.app.models.ClientePremium;

void main() {
    Cliente[] clientesArreglo = {
            new Cliente("Jorge", "Carrasco"),
            new Cliente("Kiara", "Rondon"),
            new Cliente("Yermana", "Ozuna"),
    };

    Integer[] numeros = {1, 2, 3, 4, 5, 6, 7};


    List<Cliente> clientes = fromArrayToList(clientesArreglo);
    List<ClientePremium> clientesPremium = fromArrayToList(new ClientePremium[]{
            new ClientePremium("Jorge", "Carrasco"),
            new ClientePremium("Kiara", "Rondón")});
    List<Integer> enteros = fromArrayToList(numeros);
    List<String> nombres = fromArrayToList(new String[]{"Jorge", "Kiara", "Yermana"}, numeros);

    clientes.forEach(IO::println);
    clientesPremium.forEach(IO::println);
    enteros.forEach(IO::println);
    nombres.forEach(IO::println);

    imprimirClientes(clientes);
    imprimirClientes(clientesPremium);

    System.out.println("Maximo de 1, 9, y 4 es -> " + maximo(1, 9, 4));
    System.out.println("Maximo de 3.9, 7.8, y 4.5 es -> " + maximo(3.9, 7.8, 4.55));
    System.out.println("Maximo de zanahoria, manzanas, arandanos es -> " + maximo("zanahoria", "manzanas", "arandanos"));
}

public static <T extends Number> List<T> fromArrayToList(T[] c) {
    return Arrays.asList(c);
}

public static <T extends Cliente> List<T> fromArrayToList(T[] c) {
    return Arrays.asList(c);
}

public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
    for (G g1 : g) {
        System.out.println(g1);
    }

    return Arrays.asList(c);
}

public static void imprimirClientes(List<? extends Cliente> clientes) {
    clientes.forEach(IO::println);
}

public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
    T max = a;
    if (b.compareTo(max) > 0) {
        max = b;
    }
    if (c.compareTo(max) > 0) {
        max = c;
    }
    return max;
}