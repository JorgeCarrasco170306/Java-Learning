package DataTypes;

public class NumericSystemsConsole {
    public static void main(String[] args) {

        String numeroDecimalStr = IO.readln("Please enter a number -> ");
        int numeroDecimal = Integer.parseInt(numeroDecimalStr);

        IO.println("Numero decimal = " + numeroDecimal);

        IO.println(
                "Numero binario de -> "
                        + numeroDecimal +
                        " es igual a -> "
                        + Integer.toBinaryString(numeroDecimal));

        IO.println(
                "Numero hexadecimal de -> "
                        + numeroDecimal +
                        " es igual a -> "
                        + Integer.toHexString(numeroDecimal));

        IO.println(
                "Numero octal de -> "
                        + numeroDecimal +
                        " es igual a -> "
                        + Integer.toOctalString(numeroDecimal));

        // ** note -> int a = asfafab; -> java entiende que es un numero binario

    }
}
