package co.luigicode.patronescomportamiento.chainofresponsibility;

public class AtaqueElectricidad extends ElementoAtaque {

    public AtaqueElectricidad() {
    }

    public AtaqueElectricidad(ElementoAtaque siguiente) {
        super(siguiente);
    }

    @Override
    public void ataque(Jugador jugador) {
        if (jugador.getTipoJugador().equals(TipoJugador.MAGO))
            System.out.println("Ataque ELECTRICO");
        else if (continuaSiguiente())
            getSiguiente().ataque(jugador);
        else
            System.out.println("No se encontró ningún ataque");
    }


}
