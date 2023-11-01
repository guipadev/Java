package co.luigicode.patronescomportamiento.observer;

/**
 * Observable atento a la señal del vigilante
 */
public class Guerrero extends Enemigo implements MiObservador {
    public Guerrero(String nombre) {
        super(nombre);
        setActivo(false);
    }

    @Override
    public void ataque() {
        System.out.println(getNombre() + " guerrero en ataque!!");
    }

    @Override
    public void activado() {
        setActivo(true);
        System.out.println(getNombre() + " guerrero esta activo");
    }

    @Override
    public void actualizar() {
        activado();
        ataque();
    }
}
