package Strings;

public class Concatenacion {
     static void main() {
        String curso = "Programacion Java";
        String profesor = "Andrés Guzman";
        String detalle = curso + " " + profesor;

        int a = 10;
        int b = 20;

        IO.println("detalle = " + detalle + (a + b)); // ? -> detalle -> 15
        IO.println(a + b + "detalle = " + detalle); // ? -> 15 detalle

        String detalle2 = curso.concat(curso.concat(" con el profesor -> ").concat(profesor));
        IO.println("detalle2 = " + detalle2);
    }
}
