package com.charlycimino.$61BUSCADORGENERICONomasCopyPaste;

import java.util.Collection;
import java.util.Iterator;

/**
 * Creamos una clase generica, que necesita 2 tipos de datos genericos, para saber que elmentos va a trabajar
 * si yo busco en una lista de autos se supone que mi método de búsqueda tiene que devolver un auto
 * si estoy trabajando en una lista de reserva, se supone que el método de busqueda devuvleve una reserva
 * Entonces como siempre va a ser variable porque tendremos diferentes circunstancias con diferentes tipos de datos
 * @param <T> tipo de dato elementos con que se trabaja (auto, reservas, personas, etc...)
 * @param <K> tipo de dato que permite identificar a estos objetos (puede ser una cadena, un entero, un double...)
 */
public class Buscador<T extends Identificable, K> { // Elementos que cumplen con la interfaz identificable

    /**
     * Método devolvera tipo T que coincidira con lo establecido
     * @param elementos a recibir como parametro
     * @param id identificador el objeto generico
     * @return el resultado de busqueda
     */
    public T buscar(Collection<? extends T> elementos, K id) { //Colección de elementos cualquiera siempre que se extienda de T, clases y subclases
        T encontrado = null;
        Iterator<? extends T> it = elementos.iterator();
        while (it.hasNext() && encontrado == null) {
            T actual = it.next();
            if (actual.sameId(id)) {
                encontrado = actual;
            }
        }
        return encontrado;
    }
}