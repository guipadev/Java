package com.manuelzapata._7esmejordependerdeloabstracto;

/**
 * Es mejor programar contra abstraciones y no contra implementaciones
 * Se debe buscar hacer que el código utilice clases abstractas, o interfaces, y no tipos concretos
 * porque esto nos dara la flexibidad de poder cambiar la implementación cuando nuestro programa lo necesite
 *
 *Ejemplo:
 * Imaginemos que tenemos un método y este recibe como parametro un ArrayList, osea este método es especifico para ArrayList
 * Pero si lo quisieramos cambiar a otro tipo de lista, no podriamos, porque esta dependiendo de un tipo concreto
 *
 * Que pasa si este método ahora recibe un objeto de la interfaz lista, vamos a poder recibir como parametro el ArrayList
 * Pero tambien podriamos recibir como parametro una lista Linkelist u otro tipo de lista que se soporte
 *
 * Entonces podemos evidenciar que al programar contra la abstración nos permite:
 * - Escalar el código: Hacerlo más extensible porque podemos introducir nuevos tipos
 * - Facilita la mantenibilidad: Porque si solo dejaramos que recibiera como parametro el ArrayList, luego si quisiera recibir otro
 *   tipo de lista, tendriamos que cambiar el código
 *
 * La idea dependender de elementos abstractos lo más que puedas
 */
public class Main {

    public static void main(String[] args) {

    }
}
