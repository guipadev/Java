package co.yom.listaenlazadas;

import java.util.List;

public class ListaEnlazada {

    protected Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }

    public ListaEnlazada agregarInicio(int dato) {
        Nodo nuevo;
        nuevo = new Nodo(dato);
        nuevo.ref = primero;
        primero = nuevo;
        return this;
    }

    public void agregarFinal() {}

    public void buscar() {}

    public void eliminar() {}

    public void verLista() {
        Nodo nodov;
        nodov = primero;

        while (nodov != null) {
            System.out.println(nodov.dato);
            nodov = nodov.ref;
        }
    }
}
