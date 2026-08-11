package DataTypes;

public class CharactersPrimitives {
    static void main(String[] args) {

        char myInitial = 'J'; // -> 16 bits 2 bytes
        char arrob = '\u0040';
        char decimal = 64;

        IO.println("initial = " + myInitial);
        IO.println("arrob =" + arrob);
        IO.println("decimal =" + (decimal == myInitial));

        IO.println("Caracteres especiales importantes ->>>>>");

        char space = '\u0020';
        char tabulation = '\t';
        char backspace = 'b';
        char newLine = '\n';
        char carBackspace = '\r';

        IO.println("Char corresponde a en bits = " + space + Character.SIZE);
        IO.println("Char corresponde a en  bytes = " + tabulation + Character.BYTES);
        IO.println("Char min value = " + backspace + Character.MAX_VALUE);
        IO.println("Char max value = " + newLine + Character.MIN_VALUE);
        IO.println("Char max value = " + carBackspace + Character.MIN_VALUE);

    }
}
