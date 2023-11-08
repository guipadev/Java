package co.luigicode.patronescomportamiento.state;

public class TestEstado {

    public static void main(String[] args) {

        Mision mision = new Mision("Mision 1");
        System.out.println(mision);

        mision.siguiente();
        System.out.println(mision);

        mision.siguiente();
        System.out.println(mision);

        // Puede ser fallada como completada
        mision.siguiente();
        System.out.println(mision);

        mision.siguiente();
        System.out.println(mision);

        mision.siguiente();
        System.out.println(mision);
    }
}
