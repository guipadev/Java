package co.luigicode.patronescomportamiento.strategy;

/**
 * Crear clases para implementar un algoritmo
 */
public class TestStrategy {

    public static void main(String[] args) {

        Jugador jugador = new Jugador("Jugador 1");
        Enemigo enemigo = new Enemigo("Enemigo 1");
        enemigo.ataque(jugador);
        System.out.println("==============================");

        enemigo.setAtaqueStrategy(new AtaqueGuerrero());
        enemigo.ataque(jugador);
        System.out.println("==============================");

        enemigo.setAtaqueStrategy(new AtaqueMago());
        enemigo.ataque(jugador);
    }
}
