package org.example.implementaciones;

import org.example.estructuras.Nodo;
import org.example.interfaces.Pila;

public class PilaEnlazada<T> implements Pila<T> {

    private Nodo<T> tope;
    private int size;

    public PilaEnlazada() {
        this.tope = new Nodo<>();
        this.size = 0;
    }

    @Override
    public void apilar(T elemento) {
        this.tope = new Nodo<>(elemento, this.tope);

        size++;
    }

    @Override
    public T desapilar() {

        if (tope != null) {
            T valor = tope.valor;
            tope = tope.siguiente;

            size--;

            return valor;
        }

        return null;
    }

    @Override
    public T tope() {
        if (tope != null) {
            return tope.valor;
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean estaVacia() {
        return size == 0;
    }
}
