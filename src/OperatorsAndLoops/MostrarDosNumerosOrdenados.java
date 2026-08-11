import javax.swing.*;

void main() {
    String numerosStr = JOptionPane.showInputDialog("Por favor ingrese una serie de 10 numeros divididos por un espacio -> ");
    String[] numerosArrayStr = numerosStr.split(" ");
    int[] numeros = new int[10];

    for (int i = 0; i < numerosArrayStr.length; i++) {
        numeros[i] = Integer.parseInt(numerosArrayStr[i]);
    }

    for (int i = 0; i < numeros.length; i++) {
        for (int j = i + 1; j < numeros.length; j++) {
            if (numeros[i] > numeros[j]) {
                int aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }
    }

    for (int numero : numeros) {
        JOptionPane.showMessageDialog(null, numero);
    }
}