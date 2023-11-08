package co.luigicode.patronescomportamiento.strategy;

public class AtaqueMago implements AtaqueStrategy {
    @Override
    public void ataque(Jugador jugador) {
        System.out.println(jugador.getNombre() + " vidas antes de ataque Mago: " + jugador.getVidas());
        System.out.println("Mago ataco");
        jugador.setVidas(jugador.getVidas() - 20);
        System.out.println(jugador.getNombre() + " vidas después de ataque Mago: " + jugador.getVidas());
    }
}
