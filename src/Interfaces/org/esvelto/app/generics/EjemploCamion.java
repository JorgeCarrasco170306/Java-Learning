import Interfaces.org.esvelto.app.generics.Animal;
import Interfaces.org.esvelto.app.generics.Automovil;
import Interfaces.org.esvelto.app.generics.Camion;
import Interfaces.org.esvelto.app.generics.Maquinaria;

void main() {

    var camionAnimales = new Camion<Animal>(3);
    var camionMaquinarias = new Camion<Maquinaria>(2);
    var camionAutomovil = new Camion<Automovil>(3);

    List<Animal> animales = List.of(
            new Animal("Gato", "Luffy"),
            new Animal("Perro", "Toby"));

    List<Maquinaria> maquinarias = List.of(
            new Maquinaria("Troca Callejera"),
            new Maquinaria("Grua"));

    List<Automovil> automoviles = List.of(
            new Automovil("Honda"),
            new Automovil("Kia"));

    camionAnimales.addItems(animales);
    camionMaquinarias.addItems(maquinarias);
    camionAutomovil.addItems(automoviles);

    camionAnimales.forEach(animal -> IO.println(animal.getNombre() + " -> " + animal.getTipo()));
    camionMaquinarias.forEach(maquinaria -> IO.println(maquinaria.getTipo()));
    camionAutomovil.forEach(automovil -> IO.println(automovil.getMarca()));

}