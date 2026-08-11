import javax.swing.*;

void main() {
    String nombresStr = JOptionPane.showInputDialog("Ingresa 3 nombres completos separados por espacio");
    if (!nombresStr.contains(" ")) {
        IO.println("Ningun espacio fue introducido");
        return;
    }

    String[] nombres = nombresStr.split(" ");


    for (int i = 0; i < nombres.length; i++) {

        if (nombres[i].length() > nombres[i + 1].length() && nombres[i].length() > nombres[i + 2].length()) {
            JOptionPane.showMessageDialog(null, "El nombre más largo es -> " + nombres[i]);
        }
        else if (nombres[i + 2].length() > nombres[i].length() && nombres[i + 2].length() > nombres[i + 1].length()) {
            JOptionPane.showMessageDialog(null, "El nombre más largo es -> " + nombres[i + 2]);
        } else if (nombres[i + 1].length() > nombres[i].length() && nombres[i + 1].length() > nombres[i + 2].length()) {
            JOptionPane.showMessageDialog(null, "El nombre más largo es -> " + nombres[i + 1]);
        } else {
            IO.println("Hay un empate de nombres");
        }
    }


}