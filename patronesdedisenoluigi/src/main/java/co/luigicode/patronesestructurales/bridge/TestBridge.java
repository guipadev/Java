package co.luigicode.patronesestructurales.bridge;

import co.luigicode.patronesestructurales.bridge.enemy.Mage;
import co.luigicode.patronesestructurales.bridge.enemy.Warrior;
import co.luigicode.patronesestructurales.bridge.fighter.MageFighterImpl;
import co.luigicode.patronesestructurales.bridge.fighter.WarriorFighterImpl;

/**
 * Separamos la implementación de la interfaz, en este caso ha sido la interfaz Fighter
 * Se crean dos clases derivadas que la implementan MageFighterImpl y WarriorFigtherImpl
 * Y lo que hacemos es utilizar la composición, es decir la propia clase posee un atributo
 * del tipo Figther que es un objeto de la interfaz
 * En este caso en el Warrior comienza tiendo un objeto que implementa la interfaz del Warrior
 * Mage comienza teniendo un objeto que implementa la interfaz como los Mage
 * Pero al ser un atributo como el Setter puedo modificarlo
 * Entonces a partir de ahí el Mage o Warrior pueden elegir el ataque
 * Esto sirve para separar la implementación de la abstracción
 * Es más dinamico y puedo hacer más cosas, entonce no se va a constreñir a la implementación
 * que estaria dentro de la clase que se tenia al principio
 *
 *
 */
public class TestBridge {

    public static void main(String[] args) {
        System.out.println("============ WARRIOR ===========");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new MageFighterImpl());
        warrior.attack();
        warrior.protect();
        System.out.println("============ MAGE ===========");
        Mage mage = new Mage();
        mage.attack();
        mage.protect();
        mage.setFighter(new WarriorFighterImpl());
        mage.attack();
        mage.protect();
    }
}
