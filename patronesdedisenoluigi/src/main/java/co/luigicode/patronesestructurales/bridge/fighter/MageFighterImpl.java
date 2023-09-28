package co.luigicode.patronesestructurales.bridge.fighter;

/**
 * Hemos separado la implementación en estas clases
 * que implementa la interfaz y se la pasamos como componente
 */
public class MageFighterImpl implements Fighter {

    @Override
    public void attack() {
        System.out.println("mage attack!!");
    }

    @Override
    public void protect() {
        System.out.println("mage protect!!");
    }
}
