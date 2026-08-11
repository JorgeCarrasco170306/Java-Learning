void main() {

    String[] productos = {"Laptop Lenovo", "Mouse Logitech", "Monitor Thinkpad", "Alfombrilla Logitech",
            "Auriculares JBL", "Stickers Death Note"};


    System.out.println("Orden normal : ");
    for (String producto : productos) {
        System.out.println(" -> " + producto);
    }

    System.out.println("Orden inverso : ");


    for (int i = 0; i < productos.length; i++) {
        System.out.println(" -> " + productos[productos.length - 1 - i]);
    }

}