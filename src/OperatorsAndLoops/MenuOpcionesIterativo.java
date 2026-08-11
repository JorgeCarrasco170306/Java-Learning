void main() {

    boolean salir = false;

    do {
        String opcionStr = IO.readln(
                "Ingresa un número del 1 al 5 donde 5 es para salir -> "
        );

        int opcion = Integer.parseInt(opcionStr);

        switch (opcion) {
            case 1 -> IO.println("Introdujiste la opción 1");
            case 2 -> IO.println("Introdujiste la opción 2");
            case 3 -> IO.println("Introdujiste la opción 3");
            case 4 -> IO.println("Introdujiste la opción 4");
            case 5 -> salir = true;
            default -> IO.println("Opción no reconocida");
        }

    } while (!salir);
}