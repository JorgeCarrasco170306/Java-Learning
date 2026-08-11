void main() {

    String[] productos = {"Laptop Lenovo", "Mouse Logitech", "Monitor Thinkpad", "Alfombrilla Logitech",
            "Auriculares JBL", "Stickers Death Note"};

    for (String p : productos) {
        IO.println("-> " + p);
    }

    System.out.println("Ordenado con el algoritmo burbuja : ");

    for (int i = 0; i < productos.length; i++) {
        for (int j = 0; j < productos.length; j++) {
            if (productos[i].compareTo(productos[j]) < 0) {
                String aux = productos[i];
                productos[i] = productos[j];
                productos[j] = aux;
            }
        }
    }
    for (String p : productos) {
        IO.println("-> " + p);
    }

}