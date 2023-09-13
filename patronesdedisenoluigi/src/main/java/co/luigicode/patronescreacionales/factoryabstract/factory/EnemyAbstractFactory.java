package co.luigicode.patronescreacionales.factoryabstract.factory;

import co.luigicode.patronescreacionales.factoryabstract.enemy.Enemy;
import co.luigicode.patronescreacionales.factoryabstract.armor.Armor;
import co.luigicode.patronescreacionales.factoryabstract.weapon.Weapon;

/**
 * Corazón del patrón, la cual posee dos derivadas una para crear magos y otra guerreros
 * con todo el stack que se requeire
 */
public abstract class EnemyAbstractFactory {
    // Creación enemigo
    public abstract Enemy createEnemy();
    // Creación armadura
    public abstract Armor createArmor();
    // Creación del arma
    public abstract Weapon createWeapon();
}
