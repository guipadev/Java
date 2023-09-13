package co.luigicode.patronescreacionales.factoryabstract.weapon;

/**
 * Baston magico que implementa como arma magina que hace daño
 */
public class WizardStaff implements  Weapon {
    @Override
    public void damage() {
        System.out.println("Wizard Staff Damage \uD83E\uDE84!!");
    }
}
