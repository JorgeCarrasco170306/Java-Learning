void main() {

    String[] productos = {"Laptop Lenovo", "Mouse Logitech", "Monitor Thinkpad", "Alfombrilla Logitech",
            "Auriculares JBL", "Stickers Death Note"};

    for (String p : productos) {
        IO.println("-> " + p);
    }


    System.out.println("Ordenado con sort : ");

    Arrays.sort(productos);

    for (String p : productos) {
        IO.println("-> " + p);
    }
}