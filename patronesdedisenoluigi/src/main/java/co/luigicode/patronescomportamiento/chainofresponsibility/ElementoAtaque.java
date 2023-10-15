package co.luigicode.patronescomportamiento.chainofresponsibility;

public abstract class ElementoAtaque {

    protected ElementoAtaque siguiente;

    public ElementoAtaque() {
    }

    public ElementoAtaque(ElementoAtaque siguiente) {
        this.siguiente = siguiente;
    }

    public ElementoAtaque getSiguiente() {
        return siguiente;
    }

    public ElementoAtaque setSiguiente(ElementoAtaque siguiente) {
        this.siguiente = siguiente;
        return this;
    }

    public boolean continuaSiguiente() {
        return getSiguiente() != null;
    }

    public abstract void ataque(Jugador jugador);
}
