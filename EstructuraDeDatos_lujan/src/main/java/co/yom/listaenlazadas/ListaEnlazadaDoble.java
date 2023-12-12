package co.yom.listaenlazadas;

public class ListaEnlazadaDoble {

    NodoDoblementeEnlazado primero, ultimo;
    int tamano;

    public ListaEnlazadaDoble() {}

    public void agregar(int dato) {
        NodoDoblementeEnlazado nuevo = new NodoDoblementeEnlazado(dato);

        if (tamano == 0) {
            primero = ultimo = nuevo;
        } else {
            nuevo.atras = ultimo;
            ultimo.adelante = nuevo;
            ultimo = nuevo;
        }
        tamano++;
    }
    public void agregarInicio(int dato) {
        NodoDoblementeEnlazado nuevo = new NodoDoblementeEnlazado(dato);

        if (tamano == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.adelante = primero;
            primero.atras = nuevo;
            primero = nuevo;
        }
        tamano++;
    }
    public void eliminar() {}
    public void eliminarInicio() {}
    public void verLista() {
        NodoDoblementeEnlazado nodov;

        nodov = primero;

        while (nodov != null) {
            System.out.println(nodov.dato);
            nodov = nodov.adelante;
        }
    }

    public int tamano() {
        return tamano;
    }

    public boolean vacio() {
        return tamano() == 0;
    }

    public boolean eliminar() {
        if (tamano > 0) {
            if (tamano() == 1) {
                primero = null;
                ultimo = null;
            } else {
                ultimo.atras.adelante = null;
                ultimo = ultimo.adelante = null;
            }
            tamano--;
        }
        return false;
    }
}