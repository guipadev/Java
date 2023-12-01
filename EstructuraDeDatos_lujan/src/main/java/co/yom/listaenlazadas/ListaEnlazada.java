package co.yom.listaenlazadas;

public class ListaEnlazada {

    protected Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }

    // Acciones de una lista normalmente

    public ListaEnlazada agregarInicio(int dato) {
        Nodo nuevo;
        nuevo = new Nodo(dato); // Al nodo nuevo le pasamos el dato
        nuevo.ref = primero; // El nodo que siga sea el primero, el ultimo es el primero
        primero = nuevo;
        return this;
    }

    public void agregarFinal() {
    }

    public void buscar() {
    }

    public void eliminar() {
    }

    public void verLista() {
        Nodo nodov;
        nodov = primero;

        while (nodov != null) {
            System.out.println(nodov.dato);
            nodov = nodov.ref;
        }
    }
}
