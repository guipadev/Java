package com.yadevom._22LAMBDA;

/**
 * Una interfaz funcional es toda aquella que solamente tiene un metodo abstracto
 */

@FunctionalInterface
public interface Ejecutor {

    void ejecutar();

    default void metodoDefecto() {}

    static void metodoEstatico() {}
}
