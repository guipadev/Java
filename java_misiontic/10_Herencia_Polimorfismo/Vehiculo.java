
package HerenciayPolimorfismo;

public abstract class Vehiculo {

    protected double velocidad;
    protected int pasajeros;

    public Vehiculo(int pasajeros, double velocidad) {
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
    }

    public int posicion(int tiempo) {
        return (int) (tiempo * velocidad);
    }

    public void espacios(int espacios) {
        for (int i = 0; i < espacios; i++) {
            System.out.print(' ');
        }
    }

    public abstract void pintar(int posicion);
}

class Automovil extends Vehiculo {

    public Automovil(int pasajeros, double velocidad) {
        super(pasajeros, velocidad);
    }

    @Override
    public void pintar(int posicion) {
        espacios(posicion + 4);
        System.out.println("_____");
        espacios(posicion + 1);
        System.out.println("__/__|__\\\\___");
        espacios(posicion);
        System.out.println("|_ _____ __|");
        espacios(posicion);
        System.out.println("    0    0");
    } 

}
