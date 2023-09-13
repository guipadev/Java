package co.luigicode.patronescreacionales.factorymethod;

/**
 * Extendemos de la clase abstracta Padre
 * Sobre escribimos el método al tipo de enemigo deseado
 */
public class MageFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
