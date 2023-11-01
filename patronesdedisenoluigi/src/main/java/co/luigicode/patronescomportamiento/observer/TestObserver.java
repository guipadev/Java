package co.luigicode.patronescomportamiento.observer;

/**
 * OBSERVABLE seria el vigilante
 * OBSERVADOR son los enemigos que permanecen inactivos
 */
public class TestObserver {

    public static void main(String[] args) {

        Guerrero humano = new Guerrero("Iron Man");
        Guerrero asgardiano = new Guerrero("Thor");

        Mago asgadianoMage = new Mago("Looki");
        Mago humanoMage = new Mago("Dr. Streams");

        Vigilante vigilante = new Vigilante("Thanos");
        vigilante.subscribirse(humano);
        vigilante.subscribirse(asgardiano);
        vigilante.subscribirse(asgadianoMage);
        vigilante.subscribirse(humanoMage);
        vigilante.activado();

        System.out.println("==========================================");

        vigilante.desescribirse(humanoMage);
        vigilante.activado();
    }
}
