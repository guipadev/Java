package co.luigicode.patronescreacionales.factorymethod;

public class TestFactoryMethod {

    public static void main(String[] args) {

        // Llamo al Factory y no me preocupo de nada, con el guerrero o mago
        Enemy warrior = new WarriorFactory().createEnemy();
        Enemy mage = new MageFactory().createEnemy();

        warrior.atack();
        mage.atack();
    }
}
