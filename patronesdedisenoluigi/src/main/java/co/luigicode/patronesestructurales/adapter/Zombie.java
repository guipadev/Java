package co.luigicode.patronesestructurales.adapter;

/**
 * Voy a crear un tipo de enemigo nuevo que sea un Zombie
 * Nos acordamos que de un juego que hicimos tenemos ya el código de la Clase Zombie
 *
 * Esta clase ya esta atacando y recibiendo daño, por lo cual la intteface Enemy
 * no se adapta bien
 *
 * 1. Entonces modificar esta clase y dejarla como esta
 * 2. Crear clase intermedia que adapte esta clase al nuevo video juego (Que es lo que haremos con ZombieAdapter)
 */
public class Zombie {

    public void bite() {
        System.out.println("zombie bites");
    }

    public void hit() {
        System.out.println("zombie hit");
    }

    public void headDamage() {
        System.out.println("head damage!!");
    }

    public void bodyDamage() {
        System.out.println("body damage!!");
    }
}
