package Strings;

public class StringFundamentals {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("programación Java");
        boolean esIgual = curso.equalsIgnoreCase(curso2);

        IO.println("esIgual = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        IO.println("esIgual = " + esIgual);
    }
}
