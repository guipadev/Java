package co.yom.listaenlazadas;

public class ListaEnlazadaOrdenada extends ListaEnlazada {

    public ListaEnlazadaOrdenada() {
        super(); // Indicamos que usaremos lo que viene de ListaEnlazada
    }

    public void insertarOrden(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (primero == null || dato < primero.getDato()) {
            nuevo.setRef(primero);
            primero = nuevo;
        } else {
            Nodo anterior = primero;
            Nodo actual = primero.getRef();

            while (actual != null && dato > actual.getDato()) {
                anterior = actual;
                actual = actual.getRef();
            }

            nuevo.setRef(actual);
            anterior.setRef(nuevo);
        }
    }


}
