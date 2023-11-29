package co.yom.listaenlazadas;

public class Nodo {

    protected int dato;
    protected Nodo ref;

    public Nodo(int dato) {
        this.dato = dato;
        this.ref = null;
    }
}
