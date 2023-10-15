package co.luigicode.patronescomportamiento.chainofresponsibility;

public class AtaqueHielo extends ElementoAtaque {

    public AtaqueHielo() {
    }

    public AtaqueHielo(ElementoAtaque siguiente) {
        super(siguiente);
    }

    @Override
    public void ataque(Jugador jugador) {
        if (jugador.getTipoJugador().equals(TipoJugador.GUERRERO))
            System.out.println("Ataque HIELO");
        else if (continuaSiguiente())
            getSiguiente().ataque(jugador);
        else
            System.out.println("No se encontró ningún ataque");
    }
}
