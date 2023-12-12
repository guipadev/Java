package co.yom.listaenlazadas;

public class ListaEnlazadaDobleCircular {

    NodoCircular primero;
    NodoCircular ultimo;

    public ListaEnlazadaDobleCircular() {
        primero = ultimo = null;
    }

    public void agregar(int dato) {
        NodoCircular nuevo = new NodoCircular(dato);

        if(primero == null) {
            primero = nuevo;
            primero.adelante = primero;
            nuevo.atras = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.atras = nuevo;
            nuevo.adelante = primero;
            nuevo.atras = ultimo;
            ultimo = nuevo;
            primero.atras = ultimo;
        }
    }

    public void eliminar() {}

    public void ver() {}
}
