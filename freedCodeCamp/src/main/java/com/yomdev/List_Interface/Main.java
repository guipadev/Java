package com.yomdev.List_Interface;

/**
 * Puede usar la List interfaz de Java para almacenar objetos/elementos en una colección ordenada.
 * Amplía la interfaz de Colección.
 *
 * La   List interfaz nos proporciona varios métodos para insertar, acceder y eliminar elementos en
 * una colección.
 *
 * Clases de implementación de la interfaz de lista de Java
 *
 * Aquí están las diferentes clases de implementación de la List interfaz en Java:
 *
 * AbstractList.
 * AbstractSequentialList.
 * ArrayList.
 * AttributeList.
 * CopyOnWriteArrayList.
 * LinkedList.
 * RoleList.
 * RoleUnresolvedList.
 * Stack.
 * Vector.
 *
 * Las implementaciones más utilizadas de la List interfaz son ArrayList y LinkedList
 *
 * Dado que las dos clases anteriores implementan la List interfaz, utilizan los mismos métodos para agregar,
 * acceder, actualizar y eliminar elementos en una colección.
 */

// primero importamos la ArrayList clase
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        /**
         * Cómo implementar un List en Java usando ArrayList
         * A diferencia de las matrices en Java, que tienen un tamaño específico,
         * ArrayListes más dinámica cuando se trata de almacenar elementos.
         * Esto significa que puede agregar elementos a su gusto.
         */

        /**
         * Luego creamos un nuevo ArrayList objeto llamado students:
         * Tenga en cuenta que los tipos de datos de los elementos que se almacenarían en el ArrayList
         * se especificaron entre paréntesis angulares: <String>.
         */

        ArrayList<String> students = new ArrayList<String>();

        // Cómo agregar elementos al ArrayList
        // Puede usar el add() método para agregar elementos al archivo ArrayList.

        students.add("John");
        students.add("Jane");
        students.add("Doe");

        System.out.println(students);   // [John, Jane, Doe]

        // Cómo acceder a los elementos en el ArrayList
        //Para acceder a los elementos del ArrayList, se utiliza el get() método

        System.out.println(students.get(1));    // Jane

        // Para actualizar el valor de los elementos en el ArrayList, utiliza el set() método.
        // Toma dos parámetros: el índice del elemento a actualizar y el nuevo valor.

        students.set(2,"Jaime");

        System.out.println(students);   // [John, Jane, Jaime]

        // Para eliminar elementos en el ArrayList, utiliza el remove() método.
        // También usamos el índice para especificar qué elemento eliminar.

        students.remove(2);

        System.out.println(students); // [John, Jane]

        // Puede usar el clear() método para eliminar todos los elementos de la colección:

        students.clear();

        System.out.println(students); // []
    }

    /**
     * Aunque las clases ArrayList y LinkedList tienen los mismos métodos,
     * la LinkedList clase tiene algunos métodos adicionales como:
     *
     * addFirst() añade un elemento al principio de la lista.
     * addLast() añade un elemento al final de la lista.
     * getFirst() devuelve el primer elemento de la lista.
     * getLast() devuelve el último elemento de la lista.
     * removeFirst() elimina el primer elemento de la lista.
     * removeLast() elimina el último elemento de la lista.
     */
}
