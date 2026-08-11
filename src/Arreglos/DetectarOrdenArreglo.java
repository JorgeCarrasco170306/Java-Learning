void main() {

    int[] a = new int[7];

    for (int i = 0; i < a.length; i++) {
        a[i] = Integer.parseInt(IO.readln("Ingresa un numero -> "));
    }

    boolean ascendente = false;
    boolean descendente = false;
    for (int i = 0; i < a.length - 1; i++) {
        if (a[i] > a[i + 1]) {
            descendente = true;
        }

        if (a[i] < a[i + 1]) {
            ascendente = true;
        }
    }

    if (ascendente && descendente) {
        System.out.println("Arreglo desordenado");
    }

    if (!ascendente && descendente) {
        System.out.println("Arreglo descendente");
    }

    if (ascendente && !descendente) {
        System.out.println("Arreglo ascendente");
    }
}