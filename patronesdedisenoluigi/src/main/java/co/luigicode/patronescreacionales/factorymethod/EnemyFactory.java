package co.luigicode.patronescreacionales.factorymethod;

/**
 * Que no ubiera dos caso de enemigos, si no muchisimos > 100... tendriamos que crear muchos ciclos IF
 * Se pone la Clase como Abstracta, lo cual no se pueden hacer instancias de esta, pero esta debe tener hijos
 *
 */
public abstract class EnemyFactory {

    // Implementamos un método abstracto obviamente
    public abstract Enemy createEnemy();

}
