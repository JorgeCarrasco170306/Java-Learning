void main() {


    int[] a = new int[5];
    for (int i = 0; i < a.length; i++) {
        a[i] = Integer.parseInt(IO.readln("Ingresa un numero -> "));
    }

    int max = 0;

    for (int i = 1; i < a.length; i++) {
        max = (a[max] > a[i]) ? max : i;
    }

    IO.println("El valor mas grande es -> " + a[max]);

}