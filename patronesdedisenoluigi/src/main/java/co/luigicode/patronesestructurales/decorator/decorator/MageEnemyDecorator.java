package co.luigicode.patronesestructurales.decorator.decorator;

import co.luigicode.patronesestructurales.decorator.Enemy;

/**
 * Se lleva un enemigos dentro
 */
public class MageEnemyDecorator extends EnemyDecorator {
    public MageEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Mage attack");
    }
}
