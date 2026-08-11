import POO.Automovil;
import POO.Color;
import POO.Pais;
import POO.Dueno;

void main() {

    Dueno dueno = new Dueno("Jorge", "Carrasco", Pais.REPUBLICA_DOMINICANA);

    Automovil automovil = new Automovil(Pais.ESPANA, "Civic", "Honda", Color.NEGRO, 2.0);
    Automovil automovil2 = new Automovil(new Dueno("Kiara", "Rondon", Pais.REPUBLICA_DOMINICANA), "Civic", "Honda", Color.MORADO, 2.0);
    Automovil automovil3 = new Automovil();
    IO.println(automovil.toString());
    IO.println(automovil2.toString());

    System.out.println("automovil2.equals(automovil) = " + automovil2.equals(automovil));

    automovil.setModelo("Civic");
    automovil.setColor(Color.NEGRO);
    automovil.setFabricante("Honda");
    automovil.setCilindrada(1.0);
    automovil.setDueno(dueno);

    System.out.println("automovil2.getColor() = " + automovil2.getColor());
    System.out.println("automovil2.fabricante() = " + automovil2.getFabricante());
    System.out.println("automovil2.cilindrada() = " + automovil2.getCilindrada());
    System.out.println("automovil2.modelo() = " + automovil2.getModelo());
    System.out.println("automovil2.getDueno().getNombre() = " + automovil2.getDueno().getNombre());

    System.out.println(automovil.acelerar(200));
    System.out.println(automovil.acelerar(200, "Las américas"));
    System.out.println(automovil.frenar(100, "Las americas"));
    System.out.println(Automovil.saludarDesdeElDealer("Comprando mi primer auto"));

    System.out.println("persona.getContinente() = " + dueno.getPais().getContinente());
}