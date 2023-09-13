package co.luigicode.patronescreacionales.factoryabstract.enemy;

/**
 * Guerrero que implementa un ataque guerreico
 */
public class Warrior implements Enemy {
    @Override
    public void atack() {
        System.out.println("Warrior attack \uD83E\uDD77\uD83C\uDFFB!!");
    }
}