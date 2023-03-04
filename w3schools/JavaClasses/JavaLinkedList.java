package JavaClasses;

// Import the LinkedList class
import java.util.LinkedList;

/*
Java LinkedList
En el capítulo anterior, aprendiste sobre la ArrayListclase. La LinkedListclase es casi idéntica a la ArrayList:
*/

public class JavaLinkedList {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
    }

    /*
    * ArrayList frente a LinkedList
    * La LinkedListclase es una colección que puede contener muchos objetos del mismo tipo, al igual que el ArrayList.
    *
    * La LinkedListclase tiene todos los mismos métodos que la ArrayListclase porque ambos implementan la Listinterfaz. Esto significa que puede agregar elementos, cambiar elementos, eliminar elementos y borrar la lista de la misma manera.
    *
    * Sin embargo, aunque la ArrayListclase y la LinkedListclase se pueden usar de la misma manera, se construyen de manera muy diferente.
    *
    * Cómo funciona ArrayList
    * La ArrayListclase tiene una matriz regular dentro de ella. Cuando se agrega un elemento, se coloca en la matriz. Si la matriz no es lo suficientemente grande, se crea una nueva matriz más grande para reemplazar la anterior y se elimina la anterior.
    *
    * Cómo funciona LinkedList
    * El LinkedListalmacena sus artículos en "contenedores". La lista tiene un enlace al primer contenedor y cada contenedor tiene un enlace al siguiente contenedor de la lista. Para agregar un elemento a la lista, el elemento se coloca en un nuevo contenedor y ese contenedor se vincula a uno de los otros contenedores de la lista.
    * */

    /*
    * Cuándo usar
    * Use an ArrayList para almacenar y acceder a datos, y LinkedList para manipular datos.
    * */

    /*
    Métodos de lista enlazada
    Para muchos casos, ArrayList es más eficiente ya que es común necesitar acceso a elementos aleatorios en la lista,
    pero LinkedList proporciona varios métodos para realizar ciertas operaciones de manera más eficiente:

    Method	        Description
    addFirst()	    Adds an item to the beginning of the list.
    addLast()	    Add an item to the end of the list
    removeFirst()	Remove an item from the beginning of the list.
    removeLast()	Remove an item from the end of the list
    getFirst()	    Get the item at the beginning of the list
    getLast()	    Get the item at the end of the list
    */
}
