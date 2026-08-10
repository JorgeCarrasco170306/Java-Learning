package DataTypes;

public class BillDetails {
    public static void main(String[] args) {
        String nombreFactura = IO.readln("Please enter the name of the bill -> ");

        double precioA = Double.parseDouble(IO.readln("Please enter the product A price -> "));
        double precioB = Double.parseDouble(IO.readln("Please enter the product B price -> "));

        double total = precioA + precioB;
        double impuestoAplicado = total * 0.19;
        double totalFinal = total + impuestoAplicado;

        IO.println("La factura -> " + "\"" + nombreFactura + "\"" + " tiene un total bruto de -> " + total
                + " con un impuesto de -> "
                + impuestoAplicado + " y el monto a pagar después del impuesto es de -> " + totalFinal);
    }
}
