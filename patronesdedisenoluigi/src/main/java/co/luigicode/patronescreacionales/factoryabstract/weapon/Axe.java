package co.luigicode.patronescreacionales.factoryabstract.weapon;

/**
 * Acha que implementa Arma para hacer un daño
 */
public class Axe implements Weapon {
    @Override
    public void damage() {
        System.out.println("Axe damage \uD83E\uDE93!!");
    }
}
