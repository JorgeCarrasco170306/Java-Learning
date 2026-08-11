void main() {
    int[] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = Integer.parseInt(IO.readln("Introduzca el valor " + (i + 1) + " -> "));
    }

    for (int i = 0; i < numeros.length; i++) {
        for (int j = i + 1; j < numeros.length; j++) {
            if (numeros[i] < numeros[j]) {
                int aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }
    }

    for (int numero : numeros) {
        IO.println(numero);
    }

    IO.println();
    IO.println("Numero menor -> " + numeros[numeros.length - 1]);
}