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

    public void agregarFinal(int dato) {
        Nodo nuevoF;
        nuevoF = new Nodo(dato);
        // El último elemento apunta a nulo, indicando que termino la lista enlazada
        nuevoF.ref = null;

        if (primero == null) {
            primero = nuevoF;
            return;
        }

        Nodo tmp;

        /**
         * Temporal = primero
         * Pedimimos le referencia de temporal mientras/hasta que sea diferente de nulo
         * Cuando acaba de ejecutarse el temporal
         * 
         * Este for solo se utiliza para recorrer por eso no se usan llaves
         */
        for (tmp = primero; tmp.getRef() != null; tmp = tmp.getRef())
            ;
        tmp.setRef(nuevoF);
    }

    public Nodo buscar(int dato) {
        Nodo nodob;
        for (nodob = primero; nodob != null; nodob = nodob.getRef());
            if (dato == nodob.dato)
                return nodob;
        return null;
    }

    public void eliminar(int dato) {
        boolean encontrado;

        Nodo actual, anterior;

        actual = primero;
        anterior = null;
        encontrado = false;

        while (actual != null && !encontrado) {
            encontrado = (actual.dato == dato);

            if (!encontrado) {
                anterior = actual;
                actual = actual.getRef();
            }

            if (actual != null) {
                if (actual == primero) {
                    primero = actual.ref;
                } else {
                    anterior.setRef(actual.ref);
                }
            }
        }
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
