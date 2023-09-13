package co.luigicode.patronescreacionales.factory;

public class TestFactory {

    public static void main(String[] args) {

        EnemyFactory enemyFactory = new EnemyFactory();

        /**
         * No me preocupo por el tipo de Enemigo
         * Solo llamo al Factory y solicito un Enemigo y apartir de lo que pase como parametro,
         * en este caso una cadena de texto, retorna un tipo de Enemigo u/o otro.
         */
        Enemy warrior = enemyFactory.createEnemy("warrior");
        Enemy mage = enemyFactory.createEnemy("mage");

        warrior.atack();
        mage.atack();
    }
}
