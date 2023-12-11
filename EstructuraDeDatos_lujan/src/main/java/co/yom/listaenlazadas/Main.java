package co.yom.listaenlazadas;

public class Main {

    public static void main(String[] args) {

        ListaEnlazada listaEnlazada = new ListaEnlazada();

        listaEnlazada.agregarInicio(1);
        listaEnlazada.agregarInicio(2);
        listaEnlazada.agregarInicio(3);
        listaEnlazada.agregarInicio(4);

        listaEnlazada.agregarFinal(5);

        System.out.println("/************** LISTA ENLAZADAS **************/");

        listaEnlazada.verLista();

        // Rta: 4 3 2 1, el primer elemento fue el 1 y asi sucesivamente, el último en
        // cola es el primero

        ListaEnlazadaOrdenada listaEnlazadaOrdenada = new ListaEnlazadaOrdenada();
        listaEnlazadaOrdenada.insertarOrden(1);
        listaEnlazadaOrdenada.insertarOrden(4);
        listaEnlazadaOrdenada.insertarOrden(5);
        listaEnlazadaOrdenada.insertarOrden(3);

        System.out.println("/************** LISTA ORDENADAS **************/");

        listaEnlazadaOrdenada.verLista();
    }
}
