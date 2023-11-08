package co.luigicode.patronescomportamiento.strategy;

public class AtaqueGuerrero implements AtaqueStrategy {
    @Override
    public void ataque(Jugador jugador) {
        System.out.println(jugador.getNombre() + " vidas antes de ataque guerrero: " + jugador.getVidas());
        System.out.println("Guerrero ataco");
        jugador.setVidas(jugador.getVidas() - 20);
        System.out.println(jugador.getNombre() + " vidas después de ataque guerrero: " + jugador.getVidas());
    }
}
