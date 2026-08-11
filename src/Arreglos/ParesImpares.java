void main() {

    int[] a, pares, impares;
    int totalPares = 0, totalImpares = 0;

    a = new int[10];

    for (int i = 0; i < a.length; i++) {
        a[i] = Integer.parseInt(IO.readln("Ingresa un numero -> "));
    }

    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 0) {
            totalPares++;
        } else {
            totalImpares++;
        }
    }

    pares = new int[totalPares];
    impares = new int[totalImpares];

    int j = 0, k = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 0) {
            pares[j++] = a[i];
        } else {
            impares[k++] = a[i];
        }
    }

    System.out.println("Pares");
    for (int pare : pares) {
        System.out.println(pare);
    }

    System.out.println("Impares");
    for (int impare : impares) {
        System.out.println(impare);
    }
}