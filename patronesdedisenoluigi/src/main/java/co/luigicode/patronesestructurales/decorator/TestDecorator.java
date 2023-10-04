package co.luigicode.patronesestructurales.decorator;

import co.luigicode.patronesestructurales.decorator.decorator.AssassinEnemyDecorator;
import co.luigicode.patronesestructurales.decorator.decorator.MageEnemyDecorator;
import co.luigicode.patronesestructurales.decorator.decorator.WarriorEnemyDecorator;
import co.luigicode.patronesestructurales.decorator.race.Elf;
import co.luigicode.patronesestructurales.decorator.race.Human;

/**
 * Crear clase que implementen una interfaz
 * Y que se contienen así misma
 */
public class TestDecorator {

    public static void main(String[] args) {
        System.out.println("========================== Human Warrior ==========================");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();

        System.out.println("========================== Human Warrior Mage ==========================");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();

        System.out.println("========================== Warrior Mage Assassin ==========================");
        Enemy elfWarriorMageAssassin = new AssassinEnemyDecorator(
                new MageEnemyDecorator(
                    new WarriorEnemyDecorator(
                            new Elf()
                    )
                )
        );

        elfWarriorMageAssassin.attack();
    }
}
