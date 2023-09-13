package co.luigicode.patronescreacionales.factoryabstract.armor;

/**
 * Armadura pesada que implementa Armadura que lo proteje
 */
public class HeavyArmor implements Armor {
    @Override
    public void protect() {
        System.out.println("Heavy Armor Protect \uD83E\uDD3A!!");
    }
}
