package co.luigicode.patronescomportamiento.observer;

/**
 * Observable atento a la señal del vigilante
 */
public class Mago extends Enemigo implements MiObservador {

    public Mago(String nombre) {
        super(nombre);
        setActivo(false);
    }

    @Override
    public void ataque() {
        System.out.println(getNombre() + " mago en ataque!!");
    }

    @Override
    public void activado() {
        setActivo(true);
        System.out.println(getNombre() + " mago esta activo");
    }

    @Override
    public void actualizar() {
        activado();
        ataque();
    }
}
