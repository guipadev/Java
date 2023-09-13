package co.luigicode.patronescreacionales.factoryabstract.factory;

import co.luigicode.patronescreacionales.factoryabstract.enemy.Enemy;
import co.luigicode.patronescreacionales.factoryabstract.armor.Armor;
import co.luigicode.patronescreacionales.factoryabstract.armor.Robe;
import co.luigicode.patronescreacionales.factoryabstract.enemy.Mage;
import co.luigicode.patronescreacionales.factoryabstract.weapon.Weapon;
import co.luigicode.patronescreacionales.factoryabstract.weapon.WizardStaff;

/**
 * Fabrica/Familia de Magos que extiende de Fabrica Enemigos
 * Implementamos los metodos de acuerdo a los tipos de elementos necesarios
 */
public class MageFactory extends EnemyAbstractFactory {
    @Override
    public Enemy createEnemy() {
        return new Mage();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
