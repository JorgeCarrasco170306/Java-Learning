package Strings;

public class TestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        var sb = new StringBuilder(c);

        long tiempoInicial = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            sb.append(a).append(b).append("\n"); // ? 500 -> ~1 ms
            // c += a + b + "\n"; // ? 500 -> ~19 ms
            // c = c.concat(a).concat(b).concat("\n"); // ? 500 -> ~2 ms
        }

        long tiempoFinal = System.currentTimeMillis();
        IO.println("Tiempo total -> " + (tiempoFinal - tiempoInicial) + "ms");
    }
}
