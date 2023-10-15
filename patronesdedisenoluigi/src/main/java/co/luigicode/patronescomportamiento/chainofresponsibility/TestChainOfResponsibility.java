package co.luigicode.patronescomportamiento.chainofresponsibility;

public class TestChainOfResponsibility {
    public static void main(String[] args) {

        Jugador jugador = new Jugador(TipoJugador.VAMPIRO);

        Mago mago = new Mago(new AtaqueFuego(new AtaqueHielo(new AtaqueElectricidad())));

        mago.ataqueEnCadena(jugador);

        System.out.println("================== PASAR CLASE QUE NO ESTA CONTEMPLADA EN LA CADENA ==========================");

        Jugador jugador2 = new Jugador(TipoJugador.ASESINO);

        Mago mago2 = new Mago(new AtaqueFuego(new AtaqueHielo(new AtaqueElectricidad())));

        mago2.ataqueEnCadena(jugador2);
    }
}
