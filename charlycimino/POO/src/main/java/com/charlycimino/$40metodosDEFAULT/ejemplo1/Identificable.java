package com.charlycimino.$40metodosDEFAULT.ejemplo1;

public interface Identificable {
    /**
     * Cambiamos 'abstract' por 'default' pasandolo a ser concreto
     */
    public default void mostrarIdentificacion() {
        // Todo elemento de java puede dar su hasCode en formato entero
        // Esta seria forma de mostrar la idenficicacion del elemento
        System.out.println(hashCode());
    }
}
