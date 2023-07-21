package com.yomdev.convertir_String_a_Integer;

/**
 * Convertir una cadena en un número entero en Java utilizando dos métodos de la Integer clase:
 * parseInt() y valueOf().
 */
public class StrToInt {

    public static void main(String[] args) {

        /**
         * Cómo convertir una cadena en un entero en Java usando Integer.parseInt
         * El parseInt() método toma la cadena que se va a convertir en un número entero como parámetro.
         * Integer.parseInt(string_variable)
         */

        // Creamos una age variable con un valor de cadena de "10".
        String age = "10";

        // Cuando se suma a un valor entero de 20, obtenemos 1020 en lugar de 30.
        System.out.println(age + 20); // 1020

        // Aquí hay una solución rápida usando el parseInt() método:
        int age_to_int = Integer.parseInt(age);

        // Para convertir la age variable a un número entero, la pasamos como parámetro
        // al parseInt() método — Integer.parseInt(age) — y la almacenamos en una variable
        // llamada age_to_int.
        //Cuando se suma a otro entero, se obtiene una suma adecuada: age_to_int + 20.

        System.out.println(age_to_int + 20); // 30

        /**
         * Cómo convertir una cadena en un entero en Java usando Integer.valueOf
         * Los valueOf() métodos funcionan igual que el parseInt()método.
         * Toma la cadena a convertir a un número entero como su parámetro.
         */

        String ages = "10";

        // Pasamos la cadena como parámetro a valueOf(): Integer.valueOf(age).
        // Se almacenaba en una variable llamada age_to_int.
        int ages_to_int = Integer.valueOf(ages);

        // Luego sumamos 20 a la variable creada:
        // age_to_int + 20.
        // El valor resultante fue 30 en lugar de 1020.
        System.out.println(ages_to_int + 20); // 30


    }
}
