package co.luigicode.patronesestructurales.decorator.race;

import co.luigicode.patronesestructurales.decorator.Enemy;

/**
 * Representa en la Matroska la muñeca más pequeña
 * Y ahora podemos ir tendiendo otras muñecas más grande sin importar
 */
public class Orc implements Enemy {
    @Override
    public void attack() {
        System.out.println("Orc attack!!");
    }
}