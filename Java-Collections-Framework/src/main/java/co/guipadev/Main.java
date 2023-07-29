package co.guipadev;

import java.util.*;

/*
* Java Collection Framework
* Antes solo había Vector y Stack
* Agregado a Java en la versión 1.2 (en 1998)
*
* Una arquitectura unifica para representar y manipular colecciones, permitiendo manipular
* las colecciones independientemente de los detalles de la implementación.
*
* Vista simplificada: Java Collection Framework - Interfaces
* Colecction
* Set   List    Queue   Map
*               Deque
*
*|----------------------|
*| java.util.Collection |
*|----------------------|
*
* La raiz de la jerarquia de colecciones
* Representa un grupo de objetos (elementos)
* Debe ser usada cuando se desee pasar colecciones de objetos a otros objetos y se busque
* "la máxima generalidad"
* Por convención las implementaciones de colecciones tienen un constructor que recibe Collection
*
*
* */
public class Main {
    public static <Studen> void main(String[] args) {

        // RECORRER UNA COLECCIÓN

        // Iterar una colección con for-each
        Collection<Integer> numbers = createCollection(1, 2, 3);

        for (Integer number : numbers) {
            System.out.println("number = " + number);
        }

        // Iterar una coleccion con Iterator
        Collection<Integer> moreNumbers = createCollection(100, 200, 300);

        Iterator<Integer> it = moreNumbers.iterator();

        while (it.hasNext()) {
            System.out.println("value = " + it.next());
        }

        /**
         * OTRAS OPERACIONES DE COLLECTION
         *
         * size().isEmpty()
         * contains(obj).containsAll(otherCollection)
         * add(item).addAll(otherCollection)
         * remove(item).removeAll(otherCollection)
         * removeelf(somePredicate)
         * retainAll(otherCollection)
         * clear()
         * stream().parallelStream()
         * Entre otras...
         */
        Collection<Integer> otherNumbers = createCollection(900, 100, 3000);
        otherNumbers.removeIf(item -> item <= 200);
        System.out.println("numbers => " + otherNumbers);

        /**
         *
         *|----------------------|
         *| java.util.List       |
         *|----------------------|
         *
         * List
         * Colección que mantiene el orden de inserción |ordered| (también conocida como Secuencia)
         * Control preciso de dónde insertar un elemento en la lista
         * Se puede acceder a sus elementos por índice
         * Permite duplicados
         * Permite nulls
         */

        // Crear una lista mutable
        List<String> avengers = Arrays.asList("Iron Man", "Thor", "Captain America");

        avengers.set(1, "Hulk");
        //avengers.add("Ant-man"); // UnsupportedOperationException

        // Crear una lista inmutable
        List<String> justiceLeague = List.of("Superman", "Batman", "Wonder Women");

        //justiceLeague.set(4, "Aquaman"); // UnsupportedOperationException
        //justiceLeague.add("Flash"); // UnsupportedOperationException

        // Recorrer una lista - for por índice
        // Tambien usar for-each e Iterator (más sencillos)
        for (int i = 0; i < justiceLeague.size(); i++) {
            System.out.println("item = " + justiceLeague.get(i));
        }

        // Recorrer una lista - ListIterator
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3));

        ListIterator<Integer> litForward = numeros.listIterator();

        while (litForward.hasNext()) {
            System.out.println("next => " + litForward.next());
        }

        ListIterator<Integer> litBackward = numeros.listIterator(numeros.size());

        while (litBackward.hasPrevious()) {
            System.out.println("previous => " + litBackward.previous());
        }

        // BUSCAR EL ÍNDICE DE UN ELEMENTO
        avengers.indexOf("Spider Man");
        avengers.lastIndexOf("Thor");

        // ORDENAR [sorting] UNA LISTA DE ENTEROS
        List<Integer> numeritos = new ArrayList<>(List.of(9, 1, 2, 4, 5, 3, 6, 8, 7, 0));

        numeritos.sort(null); // ordenamiento por orden natural

        for (Integer num : numeritos) {
            System.out.println("num = " + num);
        }

        // ORDENAR [sorting] UNA LISTA DE OBJETOS
        List<Student> estudiante = new ArrayList<>(List.of(
           new Student("Studen1", 9.5),
           new Student("Studen2", 7.3),
           new Student("Studen3", 10.0)
        ));

        // estudiante.sort(null); // Genera Error Exception in

        // ORDENAR [sorting] UNA LISTA DE OBJETOS CON Comparator
        estudiante.sort((o1, o2) -> Double.compare(o1.grade(), o2.grade()));

        //estudiante.sort(Comparator.comparing(Studen::grade).thenComparing(Studen::name).reversed());


        // ORDENAR [sorting] UNA LISTA DE OBJETOS "comparables"
        // En la clase Student debe aplicado ya un compareTo para que funcione

        estudiante.sort(null);
    }

    private static Collection<Integer> createCollection(int num1, int num2, int num3) {
         // Inmutables
        // List<Integer> miLista = List.of(num1, num2, num3);

        // Mutables
        List<Integer> miLista = new ArrayList<Integer>(List.of(num1, num2, num3));
        return miLista;
    }
}


