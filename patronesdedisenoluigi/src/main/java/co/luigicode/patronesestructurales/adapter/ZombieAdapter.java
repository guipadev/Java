package co.luigicode.patronesestructurales.adapter;

/**
 * En este Patron por lo general se trae una o varias clases de otro proyecto
 * y no estan pensadas para el que tengo actualmente
 * Entonces en vez de modificarlas, creo una clase intermedia, y lo que hace es implementar
 * la interface que es por sus caracteristica no puede implementar
 * Se paso como parametro un objeto de la clase que voy adapter y se escribe luego
 * el codigo que haga falta
 */
public class ZombieAdapter implements Enemy {

    // Pasamos un objeto de clase a adaptar
    private Zombie zombie;

    // Lo inicializamos en el constructor
    public ZombieAdapter() {
        this.zombie = new Zombie();
    }
    @Override
    public void attack() {
        int value = (int) (Math.random()*10);

        if (value % 2 == 0)
            zombie.bite();
        else
            zombie.hit();
    }

    @Override
    public void damage() {
        int value = (int) (Math.random()*10);

        if (value % 2 == 0)
            zombie.headDamage();
        else
            zombie.bodyDamage();
    }
}
