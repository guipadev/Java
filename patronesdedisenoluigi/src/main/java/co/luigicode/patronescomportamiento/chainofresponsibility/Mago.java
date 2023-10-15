package co.luigicode.patronescomportamiento.chainofresponsibility;

public class Mago {

    private ElementoAtaque elementoAtaque;

    public Mago(ElementoAtaque elementoAtaque) {
        this.elementoAtaque = elementoAtaque;
    }

    public ElementoAtaque getElementoAtaque() {
        return elementoAtaque;
    }

    public Mago setElementoAtaque(ElementoAtaque elementoAtaque) {
        this.elementoAtaque = elementoAtaque;
        return this;
    }

    public void ataqueEnCadena(Jugador jugador) {
        System.out.println("Ataque para " + jugador.getTipoJugador().name().toUpperCase());
        elementoAtaque.ataque(jugador);
    }
}
