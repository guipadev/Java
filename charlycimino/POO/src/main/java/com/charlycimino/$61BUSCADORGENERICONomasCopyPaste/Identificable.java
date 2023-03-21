package com.charlycimino.$61BUSCADORGENERICONomasCopyPaste;

/**
 * Interfaz generica
 * @param <T> no sabemos el tipo de parametro a recibir
 */
public interface Identificable<T> {
    public abstract T getId();
    public abstract void setId(T x);
    public abstract boolean sameId(T anotherID); // Verificar si un elemento tiene el mismo ID el cual le pasamos como parametro
}
