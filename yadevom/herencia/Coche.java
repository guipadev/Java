package herencia;

import java.util.ArrayList;

public class Coche extends Vehiculo{

    private int potencia;

    public Coche(int potencia, String color) {
        super(4, color,6);
        this.potencia = potencia;
    }

    @Override
    public void anadirPasajero(String nombrePasajero) {
        if (this.pasajeros.size() >= 1) {
            this.pasajeros = new ArrayList<>();
            this.pasajeros.add(nombrePasajero);
        } else {
            this.pasajeros.add(nombrePasajero);
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
