package co.luigicode.patronescreacionales.factoryabstract.armor;

/**
 * Tunica implementa Armadura
 * Esta armadura de protección es una tunica
 */
public class Robe implements Armor {
    @Override
    public void protect() {
        System.out.println("Robe Protect \uD83E\uDD4B!!");
    }
}
