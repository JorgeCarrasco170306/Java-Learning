import excepciones.Calculadora;
import excepciones.DivisionPorZeroException;

import javax.swing.*;

void main() {
    var calculadora = new Calculadora();
    String valor = JOptionPane.showInputDialog("Ingresa un valor");

    try {
        int divisor = Integer.parseInt(valor);
        double division = calculadora.dividir(10, divisor);
        System.out.println("division = " + division);
    } catch (DivisionPorZeroException e) {
        System.out.println("Error -> " + e.getMessage());
        main();
    } catch (NumberFormatException e) {
        System.out.println(e.getMessage());
        System.out.println("Error -> " + e.getMessage());
        main();
    } catch (Exception e) {
        System.out.println("Ocurrió un error inesperado");
        System.out.println("Error -> " + e.getMessage() + " " + e.getCause());
        main();
    }
}