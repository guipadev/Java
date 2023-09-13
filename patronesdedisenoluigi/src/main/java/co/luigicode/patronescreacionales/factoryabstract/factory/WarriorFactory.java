package co.luigicode.patronescreacionales.factoryabstract.factory;

import co.luigicode.patronescreacionales.factoryabstract.enemy.Enemy;
import co.luigicode.patronescreacionales.factoryabstract.armor.Armor;
import co.luigicode.patronescreacionales.factoryabstract.armor.HeavyArmor;
import co.luigicode.patronescreacionales.factoryabstract.enemy.Warrior;
import co.luigicode.patronescreacionales.factoryabstract.weapon.Axe;
import co.luigicode.patronescreacionales.factoryabstract.weapon.Weapon;

/**
 * Fabrica/Familia de Guerreros que extiende de Fabrica Enemigos
 * Implementamos los metodos de acuerdo a los tipos de elementos necesarios
 */
public class WarriorFactory extends EnemyAbstractFactory {
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
