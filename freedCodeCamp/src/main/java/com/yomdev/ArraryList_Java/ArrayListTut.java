package com.yomdev.ArraryList_Java;

// Para hacer uso de un ArrayList, primero debe importarlo desde la clase ArrayList
import java.util.ArrayList;

public class ArrayListTut {

    /**
     * Puede usar an ArrayList en Java para almacenar y manipular una colección de variables similares.
     *
     * Un ArrayList como una matriz pero ofrece más flexibilidad.
     * Un ArrayList más dinámico con el tamaño de la colección y le da más control sobre los elementos de una colección.
     *
     * Cómo declarar e inicializar un ArrayList Java.
     * Diferentes métodos integrados que se pueden usar para agregar, acceder, modificar y eliminar
     * elementos en un archivo ArrayList
     */
    public static void main(String[] args) {

        /**
         * Tenga en cuenta que el tipo de datos de ArrayList especifica entre paréntesis angulares:
         * ArrayList<String>.
         *
         * En este punto, hemos creado un ArrayList pero no tiene elementos.
         */
        ArrayList<String> people = new ArrayList<>();

        // Alternativamente, puede crear un ArrayList con valores/elementos en el punto
        // de declaración utilizando el add método en un bloque inicializador:
        ArrayList<String> gente = new ArrayList<>() {{
            add("John");
            add("Jane");
            add("Doe");
        }};

        System.out.println(gente);  // [John, Jane, Doe]

        // Cómo agregar elementos a un Java ArrayList
        //Puede usar el add()método para agregar elementos a un archivo ArrayList.
        people.add("Jose");
        people.add("Juana");
        people.add("Diana");

        System.out.println(people); // [Jose, Juana, Diana]

        // Puede acceder a los elementos en Java ArrayList utilizando el índice del elemento.
        // El índice del elemento se pasará como parámetro al get()método. Eso es:

        System.out.println(people.get(0)); // Jose

        // Puede cambiar o modificar el valor de un elemento utilizando el set() método.
        // El set() método toma dos parámetros:
        // el índice del elemento que se cambiará y el nuevo valor que se asignará a ese índice.

        people.set(1, "Lucho");

        System.out.println(people); // [Jose, Lucho, Diana]

        /**
         * Cómo eliminar elementos en un Java ArrayList
         * Puede eliminar un elemento utilizando el remove() método.
         * El método toma como parámetro el índice del elemento a eliminar.
         */

        // Usando remove() método, eliminamos tercer elemento de colección usando índice del elemento:
        people.remove(2);

        System.out.println(people); // [Jose, Lucho]

    }
}
