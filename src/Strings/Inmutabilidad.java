package Strings;

public class Inmutabilidad {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(" con el profesor ".concat(profesor));
        IO.println("curso -> " + curso);
        IO.println("resultado -> " + resultado);

        curso.transform(x -> x + " con " + profesor);
        IO.println(curso);
    }

}
