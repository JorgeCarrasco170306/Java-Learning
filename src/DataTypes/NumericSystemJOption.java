package DataTypes;

import javax.swing.JOptionPane;

public class NumericSystemJOption {

    public static void main(String[] args) {
        String numeroDecimalStr = JOptionPane.showInputDialog("Please enter a number -> ");
        int numeroDecimal = Integer.parseInt(numeroDecimalStr);

        IO.println("Numero decimal = " + numeroDecimal);

        String a = "Numero binario de -> "
                + numeroDecimal +
                " es igual a -> "
                + Integer.toBinaryString(numeroDecimal)
                + "\n";

        String b = "Numero hexadecimal de -> "
                + numeroDecimal +
                " es igual a -> "
                + Integer.toHexString(numeroDecimal)
                + "\n";

        String c = "Numero octal de -> "
                + numeroDecimal +
                " es igual a -> "
                + Integer.toOctalString(numeroDecimal)
                + "\n";

        JOptionPane.showMessageDialog(null, a + b + c);
    }
}
