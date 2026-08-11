import javax.swing.*;

void main() {
    int cantidadActual = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de gasolina actual -> "));

    if(cantidadActual == 70 || cantidadActual > 70) {
        JOptionPane.showMessageDialog(null, "Estanque lleno");
    }
    else if(cantidadActual < 70 && cantidadActual > 60){
         JOptionPane.showMessageDialog(null, "Estanque casi lleno");
    }
    else if(cantidadActual < 60 && cantidadActual > 40){
         JOptionPane.showMessageDialog(null, "Estanque 3/4");
    }
    else if(cantidadActual < 40 && cantidadActual > 35){
         JOptionPane.showMessageDialog(null, " Medio Estanque");
    }
    else if(cantidadActual < 20 && cantidadActual > 15){
         JOptionPane.showMessageDialog(null, " Suficiente");
    }
    else if(cantidadActual < 20 && cantidadActual > 15){
         JOptionPane.showMessageDialog(null, " Insuficiente");
    }else{
         JOptionPane.showMessageDialog(null, " Estás en reserva");
    }
}