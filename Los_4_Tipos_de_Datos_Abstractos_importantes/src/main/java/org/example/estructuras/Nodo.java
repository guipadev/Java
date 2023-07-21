package org.example.estructuras;

public class Nodo<T> {
    public T valor;
    public Nodo<T> siguiente;

    public Nodo(T valor, Nodo<T> siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public Nodo() {}
}