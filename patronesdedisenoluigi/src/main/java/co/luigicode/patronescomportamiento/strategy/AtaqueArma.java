package co.luigicode.patronescomportamiento.strategy;

public class AtaqueArma implements AtaqueStrategy {
    @Override
    public void ataque(Jugador jugador) {

        System.out.println(jugador.getNombre() + " vidas antes de ataque Arma: " + jugador.getVidas());
        System.out.println("Arma ataco");
        jugador.setVidas(jugador.getVidas() - 20);
        System.out.println(jugador.getNombre() + " vidas después de ataque Arma: " + jugador.getVidas());
    }
}
