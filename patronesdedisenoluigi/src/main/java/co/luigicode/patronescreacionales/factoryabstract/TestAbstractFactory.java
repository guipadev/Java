package co.luigicode.patronescreacionales.factoryabstract;

import co.luigicode.patronescreacionales.factoryabstract.armor.Armor;
import co.luigicode.patronescreacionales.factoryabstract.enemy.Enemy;
import co.luigicode.patronescreacionales.factoryabstract.factory.EnemyAbstractFactory;
import co.luigicode.patronescreacionales.factoryabstract.factory.MageFactory;
import co.luigicode.patronescreacionales.factoryabstract.factory.WarriorFactory;
import co.luigicode.patronescreacionales.factoryabstract.weapon.Weapon;

/**
 * Probar el patron
 */
public class TestAbstractFactory {

    public static void main(String[] args) {

        EnemyAbstractFactory factory = new WarriorFactory();

        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();

        warrior.atack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();

        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardStaff = factory.createWeapon();

        mage.atack();
        robe.protect();
        wizardStaff.damage();

    }
}
