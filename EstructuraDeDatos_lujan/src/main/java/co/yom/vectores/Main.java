package co.yom.vectores;

import java.util.Vector;

/**
 * Java tiene una clase vector que contine una matriz que es cultivable de objetos
 * osea se pueden ir colocando igual que una matriz
 * Contine componentes que se puede acceder utilizando un indice entero
 * Sin embargo el tamaña de un vector puede crecer o reducirse segun sea lo necesario
 * para ir acomodando o eliminando los elementos despues de que se hallan creado
 */
public class Main {

    /**
     * Diferencia Vector VS ArrayList
     * ArrayList
     * No esta sincronizado
     * Se incrementa en el 50% de su tamaño actual
     * No es una clase heredada
     * Más rápido, no tiene el problema de sincronización
     * Usa interfaz Iterator para recorrer los elementos
     * No puede contener datos primitivos, solo objetos
     * Uso ArrayList y derivados de List
     *
     * Vector
     * Es sincronizado
     * Se incrementa su capacidad 100% si esta en 10 y se supera se amplia 20, se duplica la matriz
     * Es más lento, al ser sincronico debe mantener los estados, subprocesos y bloqueo
     * No se necesitan en muchos ocasiones
     * Usa interfaz Enum para recorrer elementos, pero tambien puede usar el Iterator
     * Muy poco y raro de usar, la frecuencia de uso es minima
     *
     */
    public static void main(String[] args) {

        // Declarar un vector, aunque este vacío inicialmente se pueden agregar 10 elementos
        Vector vector = new Vector();

        // Si le pongo un valor, ej. 20, su capacidad inicial sera de 20
        Vector vector2 = new Vector(20);

        // capacidad inicial 10, al agregar el elemento 11, en realidad tendremos disponible agregar 15 elementos
        // cuando ingresemos el elemento 16 esta aumenta la capacidad a 20 y así de 5 en 5
        Vector vector3 = new Vector(10, 5);

        // Insertar elementos
        vector.add("h");
        vector.add("hola");

        // Insertar mediante metodo, indicando en que posición queremos el elemento
        vector.insertElementAt("jj", 1);

        // Imprimir elementos del vector
        System.out.println(vector);

        // Eliminar elemento
        vector.remove("h");

        System.out.println(vector);

        // Acceder a información elemento exacto
        System.out.println(vector.elementAt(0));
    }
}
