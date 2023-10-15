package co.luigicode.patronescomportamiento.chainofresponsibility;

public class AtaqueFuego extends ElementoAtaque {

    public AtaqueFuego() {
    }

    public AtaqueFuego(ElementoAtaque siguiente) {
        super(siguiente);
    }

    @Override
    public void ataque(Jugador jugador) {
        if (jugador.getTipoJugador().equals(TipoJugador.VAMPIRO))
            System.out.println("Ataque FUEGO");
        else if (continuaSiguiente())
            getSiguiente().ataque(jugador);
        else
            System.out.println("No se encontró ningún ataque");
    }


}
