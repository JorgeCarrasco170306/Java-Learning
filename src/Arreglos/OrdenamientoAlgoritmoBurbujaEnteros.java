void main() {

    int[] numeros = {10, 9, 8, 20, 30210, 320, 300, 400, 300, 32, 1, 21};

    System.out.println("Antes de ordenar: ");

    for (int i = 0; i < numeros.length; i++) {
        IO.println(numeros[i]);
    }

    System.out.println("Luego de ordenar de menor a mayor: ");

    for (int i = 0; i < numeros.length; i++) {
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[i] < numeros[j]) {
                int aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }
    }
    for (int i = 0; i < numeros.length; i++) {
        IO.println(numeros[i]);
    }
}