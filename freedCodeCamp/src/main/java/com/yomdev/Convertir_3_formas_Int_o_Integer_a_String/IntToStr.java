package com.yomdev.Convertir_3_formas_Int_o_Integer_a_String;

/**
 * Puede convertir variables de un tipo de datos a otro en Java usando diferentes métodos.
 *
 * Convertir números enteros en cadenas en Java de las siguientes maneras:
 *
 * Usando el Integer.toString() método.
 * Usando el String.valueOf() método.
 * Usando el String.format() método.
 * Usando la DecimalFormat clase.
 *
 * Cómo convertir un entero a una cadena en Java usando Integer.toString()
 * El Integer.toString() método toma el número entero a convertir como parámetro.
 * Así es como se ve la sintaxis:
 *
 * Integer.toString(INTEGER_VARIABLE)
 */

import java.text.DecimalFormat;
public class IntToStr {

    public static void main(String[] args) {

        /**
         * Creamos un número entero age y le asignamos un valor de 2.
         *
         * Para convertir la age variable en una cadena, la pasamos como parámetro al Integer.toString() método:
         * Integer.toString(age).
         *
         * Almacenamos este nuevo valor de cadena en una variable de cadena llamada AGE_AS_STRING.
         *
         * Luego concatenamos la nueva variable de cadena con otras cadenas:
         * "The child is " + AGE_AS_STRING + " years old"
         */

        int age = 2;

        String AGE_AS_STRING = Integer.toString(age);

        System.out.println("The child is " + AGE_AS_STRING + " years old"); // The child is 2 years old

        // Pero, ¿aparecería un error si simplemente concatenáramos la variable de edad a estas otras
        // cadenas sin ningún tipo de conversión?

        int edad = 2;

        // El resultado anterior es el mismo que el ejemplo en el que tuvimos que convertir el número
        // entero en una cadena.

        System.out.println("The child is " + edad + " years old"); // The child is 2 years old

        // Entonces, ¿cómo sabemos si la conversión de tipo realmente funcionó?
        // Podemos verificar los tipos de variables usando el getClass() objeto Java

        System.out.println(((Object)age).getClass().getSimpleName()); // Integer

        System.out.println(AGE_AS_STRING.getClass().getSimpleName()); // String

        /**
         * Ahora podemos verificar que cuando age se creó la variable, era un Integer,
         * y después de la conversión de tipos, se convirtió en un String.
         */

        /**
         * Cómo convertir un entero a una cadena en Java usando String.valueOf()
         * El String.valueOf() método también toma la variable a convertir en una cadena como su parámetro.
         */
        int anio = 2000;

        System.out.println(((Object)age).getClass().getSimpleName()); // Integer

        // Pasamos el ageentero como parámetro al String.valueOf() método: String.valueOf(age).
        String ANIO_STRING = String.valueOf(anio);

        System.out.println("El año  " + ANIO_STRING + " fue un nuevo siglo"); // El año 2000 fue un nuevo siglo

        System.out.println(AGE_AS_STRING.getClass().getSimpleName()); // String

        /**
         * Cómo convertir un entero a una cadena en Java usandoString.format()
         * El String.format()método toma dos parámetros: un especificador de formato y la variable a formatear.
         */
        int age2 = 2;

        System.out.println(((Object)age).getClass().getSimpleName()); // Integer

        // pasamos dos parámetros al String.format() método: "%d"y age.
        // "%d" es un especificador de formato que indica que la variable a formatear es un número entero.
        // age, que es el segundo parámetro, se convertirá en una cadena y se almacenará en la AGE_AS_STRING variable.
        String AGE_AS_STRING2 = String.format("%d", age2);

        System.out.println("The child is " + AGE_AS_STRING2 + " years old"); // The child is 2 years old

        System.out.println(AGE_AS_STRING.getClass().getSimpleName()); // String

        /**
         * Cómo convertir un entero a una cadena en Java usando DecimalFormat
         * La DecimalFormat clase se utiliza para formatear números decimales en Java.
         * Puede usarlo de diferentes maneras, pero lo usaremos para convertir un número entero en una cadena.
         */

        // Para poder usar la DecimalFormat clase importamos: import java.text.DecimalFormat;

        // Creamos la age variable entera
        int age3 = 2;

        // Creamos un nuevo objeto de la DecimalFormat clase llamado DFormat.
        DecimalFormat DFormat = new DecimalFormat("#");

        // Usando el format() método del objeto, convertimos age a una cadena: DFormat.format(age);

        String AGE_AS_STRING3 = DFormat.format(age3);

        System.out.println("The child is " + AGE_AS_STRING3 + " years old"); // The child is 2 years old

        System.out.println(((Object)age3).getClass().getSimpleName()); // Integer

        System.out.println(AGE_AS_STRING3.getClass().getSimpleName()); // String
    }
}
