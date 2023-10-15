package co.luigicode.patronescomportamiento.chainofresponsibility;

public class Jugador {

    private TipoJugador tipoJugador;

    public Jugador(TipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public TipoJugador getTipoJugador() {
        return tipoJugador;
    }

    public Jugador setTipoJugador(TipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
        return this;
    }
}
