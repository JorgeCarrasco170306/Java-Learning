package POO;

import java.util.Objects;

public non-sealed class Dueno extends Persona{

    private Automovil automovil;

    public Dueno(String nombre, String apellido, Pais pais) {
        super(nombre, apellido, pais);
    }

    @Override
    public String saludar(String message) {
        return "Hola! " + message ;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dueno dueno)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(automovil, dueno.automovil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), automovil);
    }

    @Override
    public String toString() {
        return "Dueno{" +
                "automovil=" + automovil +
                '}';
    }
}
