void main() {

    String[] productos = {"Laptop Lenovo", "Mouse Logitech", "Monitor Thinkpad", "Alfombrilla Logitech",
            "Auriculares JBL", "Stickers Death Note"};

    for (String p : productos) {
        IO.println("-> " + p);
    }

    System.out.println("Modificado en reverso : ");

    for (int i = 0; i < productos.length / 2; i++) {
        String actual = productos[i];
        String inverso = productos[productos.length - 1];
        productos[i] = inverso;
        productos[productos.length - 1] = actual;
    }

    for (String p : productos) {
        IO.println("-> " + p);
    }
}