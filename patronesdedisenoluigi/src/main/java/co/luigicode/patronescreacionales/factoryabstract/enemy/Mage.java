package co.luigicode.patronescreacionales.factoryabstract.enemy;

/**
 * Mago que implementa un ataque magico
 */
public class Mage implements Enemy {
    @Override
    public void atack() {
        System.out.println("Mage attack \uD83E\uDDD9!!");
    }
}
