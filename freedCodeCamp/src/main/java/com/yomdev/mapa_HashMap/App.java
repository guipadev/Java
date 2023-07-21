package com.yomdev.mapa_HashMap;

/**
 * En Java, usa un HashMap para almacenar elementos en pares clave/valor.
 * Puede acceder a los elementos almacenados en un HashMap utilizando la clave del elemento, que es única para cada elemento.
 *
 * ¿Cuáles son las características de un HashMap en Java?
 * Antes de trabajar con HashMaps, es importante comprender cómo funcionan.
 *
 * Estas son algunas de las características de un HashMap:
 *
 * Los elementos se almacenan en pares clave/valor.
 * Los elementos no mantienen ningún orden cuando se agregan. Los datos están desordenados.
 * En caso de que haya claves duplicadas, la última anulará a las otras.
 * Los tipos de datos se especifican utilizando clases contenedoras en lugar de tipos de datos primitivos.
 */

// Para crear y usar un HashMap, primero debe importar el java.util.HashMappaquete
import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        /**
         * Así es como se ve la sintaxis para crear un nuevo HashMap:
         *
         * HashMap<KeyDataType, ValueDataType> HashMapName = new HashMap<>();
         *
         * KeyDataType: indica el tipo de datos de todas las claves que se almacenarán en el archivo HashMap.
         * ValueDataType: indica el tipo de datos de todos los valores que se almacenarán en el HashMap.
         * HashMapName: denota el nombre del HashMap.
         */

        HashMap<Integer, String> StudentInfo = new HashMap<>();

        /**
         * En el código anterior, creamos un HashMap llamado StudentInfo.
         * Las claves que se almacenarán en HashMap serán todos números enteros, mientras que los valores serán cadenas.
         *
         * Notará que estamos trabajando con clases contenedoras y no con tipos primitivos al especificar los tipos de
         * datos para las claves y los valores. Así es como funcionan los HashMaps.
         *
         * Antes de sumergirnos en ejemplos, aquí hay una lista de clases contenedoras y sus tipos de datos primitivos
         * correspondientes en Java:
         *
         * WRAPPER CLASSES      PRIMITIVE DATA TYPES
         * Integer              int
         * Character            char
         * Float                float
         * Byte                 byte
         * Short                short
         * Long                 long
         * Double               double
         * Boolean              boolean
         */

        /**
         * HashMap se llama StudentInfo.
         * Especificamos las claves como números enteros mientras que los valores eran cadenas:
         * HashMap<Integer, String>.
         *
         * Para agregar elementos al HashMap, usamos el put() método:
         */
        StudentInfo.put(1, "Ihechikara");
        StudentInfo.put(2, "Jane");
        StudentInfo.put(3, "John");

        // Puede usar el get() método para acceder a los elementos almacenados en un archivo HashMap.
        System.out.println(StudentInfo.get(2)); // Jane

        System.out.println(StudentInfo); // {1=Ihechikara, 2=Jane, 3=John}

        // Para cambiar el valor de los elementos en un HashMap, hacemos uso del replace() método.
        // Se necesitan dos parámetros: la clave del elemento que se cambiará y el nuevo valor que se le asignará.
        StudentInfo.replace(1, "Doe");

        System.out.println(StudentInfo); // {1=Doe, 2=Jane, 3=John}

        // Puede usar el remove()método para eliminar un elemento de un archivo HashMap.
        // Toma un parámetro: la clave del elemento que se eliminará.
        StudentInfo.remove(1);

        System.out.println(StudentInfo); // {2=Jane, 3=John}

        // Si desea eliminar todos los elementos de HashMapuna vez, utilice el clear() método.
        StudentInfo.clear();

        System.out.println(StudentInfo); // {}

    }

    /**
     * Hay otros métodos útiles como:
     *
     * containsKey
     * Que devuelve true si existe una clave especificada en un archivo HashMap.
     *
     * containsValue
     * Que devuelve true si existe un valor especificado en un archivo HashMap.
     *
     * size()
     * Que devuelve el número de elementos en un HashMap.
     *
     * isEmpty()
     * Que regresa true si a HashMap no tiene elementos, y así sucesivamente.
     */
}
