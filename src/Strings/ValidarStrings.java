package Strings;

public class ValidarStrings {
    public static void main(String[] args) {
        String curso = IO.readln("Please enter the name of the course");
        boolean esNulo = curso == null;

        boolean onlySpacesOrEmpty = curso.isBlank();

        IO.println("esNulo = " + esNulo);

        if (esNulo) {
            IO.println("El string es null");
        } else if (onlySpacesOrEmpty) {
            IO.println("El string está vacío");
        }

        IO.println("curso.toUpperCase() = " + curso.toUpperCase());
        IO.println(curso.concat(" desde cero! "));

    }
}
