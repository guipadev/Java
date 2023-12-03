package co.yom.listaenlazadas;

public class Nodo {

    protected int dato;
    protected Nodo ref;

    public Nodo(int d) {
        this.dato = d;
        this.ref = null;
    }

    public int getDato() {
        return dato;
    }

    public void setRef(Nodo referencia) {
        this.ref = referencia;
    }

    public Nodo getRef() {
        return ref;
    }

}
