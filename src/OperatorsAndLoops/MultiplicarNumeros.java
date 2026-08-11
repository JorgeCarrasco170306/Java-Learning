void main() {

    // 10
    int a = Integer.parseInt(IO.readln("Por favor introduce un numero -> "));
    //10
    int b = Integer.parseInt(IO.readln("Por favor introduce el multiplicador -> "));

    int resultado = 0;

    for (int i = 1; i <= b; i++) {
        resultado += a;
    }

    IO.println("Ahora el valor es -> " + resultado);

}