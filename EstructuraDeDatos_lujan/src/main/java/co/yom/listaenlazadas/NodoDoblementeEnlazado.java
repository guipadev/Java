package co.yom.listaenlazadas;

public class NodoDoblementeEnlazado {

    int dato;
    Nodo adelante;
    Nodo atras;

    public NodoDoblementeEnlazado(int d) {
        dato = d;
        adelante = atras = null;
    }

    public int getDato() {
        return dato;
    }
}
