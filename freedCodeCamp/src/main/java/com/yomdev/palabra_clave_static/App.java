package com.yomdev.palabra_clave_static;

/**
 * Puede usar la static palabra clave en diferentes partes de un programa Java,
 * como variables, métodos y bloques estáticos.
 *
 * El propósito principal de usar la static palabra clave en Java es ahorrar memoria.
 *
 * Cuando creamos una variable en una clase a la que accederán otras clases,
 * primero debemos crear una instancia de la clase y luego asignar un nuevo valor a cada instancia de variable,
 * incluso si se supone que el valor de las nuevas variables es el mismo. en todas las clases/objetos nuevos.
 *
 * Pero cuando creamos variables estáticas, su valor permanece constante en todas las demás clases
 * y no tenemos que crear una instancia para usar la variable.
 * De esta manera, estamos creando la variable una vez, por lo que la memoria solo se asigna una vez.
 *
 * Para comprender qué static es la palabra clave y qué hace realmente,
 * veremos algunos ejemplos que muestran su uso al declarar variables, métodos y bloques estáticos en Java.
 */
public class App {

}

/**
 * Cómo crear una variable estática en Java
 * Para comprender el uso de la static palabra clave en la creación de variables,
 * veamos la forma habitual de crear variables compartidas en todas las instancias de una clase.
 */
class Student {
    /**
     * Creamos una clase llamada Studentcon tres variables: studentName, coursey school.
     */
    String studentName;
    String course;
    static String school;

    public static void main(String[] args) {

        /**
         * Luego creamos dos instancias de la Student clase:
         */
        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();

        /**
         * La primera instancia, Student1 que tiene acceso a las variables creadas en su clase,
         * tenía estos valores:
         */
        Student1.studentName = "Ana Lu";
        Student1.course = "Data Visualization";
        Student1.school = "UNAL";

        /**
         * La segunda instancia tenía estos valores:
         */
        Student2.studentName = "John";
        Student2.course = "Data Analysis with Python";
        //Student2.school = "UNAL";

        /**
         * Ahora, cuando creamos una nueva instancia de nuestra clase, no tenemos que inicializar la school variable
         * para cada instancia.
         * En nuestro código, solo asignamos un valor a la variable en la primera instancia y también fue heredado
         * por la segunda instancia.
         *
         * Tenga en cuenta que cambiar el valor de la variable estática en cualquier parte del código anula el valor
         * en otras partes del código donde se declaró anteriormente.
         *
         * Por lo tanto, solo debe usar la static palabra clave para las variables que se supone que deben permanecer
         * constantes en el programa.
         *
         * También puede asignar un valor a la variable cuando se crea para que no tenga que declararla nuevamente
         * cuando cree una instancia de clase:
         * static String school = "UNAL";.
         */
        Student3.studentName = "Luisa";
        Student3.course = "Data Analysis with R";

        /**
         * Si observa detenidamente, se dará cuenta de que ambos estudiantes tienen el mismo nombre de escuela:
         * "UNAL". ¿Qué pasaría si tuviéramos que crear 100 estudiantes para la misma escuela?
         * Eso significa que estaríamos inicializando una variable con el mismo valor 100 veces,
         * asignando nueva memoria cada vez.
         *
         * Si bien esto puede no parecer un problema, en una base de código mucho más grande,
         * podría convertirse en una falla y ralentizar innecesariamente su programa.
         *
         * Para solucionar este problema, usaremos la static palabra clave para crear la school variable.
         * Después de eso, todas las instancias de la clase pueden hacer uso de esa variable.
         */

        System.out.println(Student1.studentName + " " + Student1.course + " " + Student1.school + "\n");
        // Ana Lu Data Visualization UNAL
        System.out.println(Student2.studentName + " " + Student2.course + " " + Student2.school);
        // John Data Analysis with Python UNAL
        System.out.println(Student3.studentName + " " + Student3.course + " " + Student3.school);
        // Luisa Data Analysis with R UNAL
    }
}

/**
 * Cómo crear un método estático en Java
 * Antes de ver un ejemplo, aquí hay algunas cosas que debe saber sobre los métodos estáticos en Java:
 *
 * Los métodos estáticos solo pueden acceder y modificar variables estáticas.
 *
 * Los métodos estáticos se pueden llamar/usar sin crear una instancia de clase.
 *
 * Aquí hay un ejemplo:
 */
class EvenNumber {

    /**
     *  creamos un número entero ( evenNumber) en una clase llamada EvenNumber.
     */
    static int evenNumber;

    /**
     * Nuestro método estático se llama incrementBy2().
     * Este método aumenta el valor del evenNumber entero e imprime su valor.
     */
    static void incrementBy2(){
        evenNumber = evenNumber + 2;
        System.out.println(evenNumber);
    }

    /**
     * Sin crear una instancia de clase, pudimos llamar al incrementBy2() método en el método del programa main.
     * Cada vez que llamamos al método, el valor de evenNumber se incrementó en 2 y se imprimió.
     *
     * También puede adjuntar el nombre de la clase al método usando la notación de puntos mientras llama al método:
     * EvenNumber.incrementBy2();
     * Todo método estático pertenece a la clase y no a instancias de la clase.
     */
    public static void main(String[] args) {
        incrementBy2(); // 2
        incrementBy2(); // 4
        incrementBy2(); // 6
        incrementBy2(); // 8
    }
}

/**
 * Cómo crear un bloque estático en Java
 * Los bloques estáticos en Java son similares a los constructores.
 * Podemos usarlos para inicializar variables estáticas, y el compilador los ejecuta antes que el main método.
 */

class Block {

    /**
     * creamos una variable entera estática year.
     */
    static int year;

    /**
     * Luego lo inicializamos en un bloque estático:
     *
     * Puede crear un bloque estático, usando la static palabra clave seguida de corchetes.
     * En el bloque estático de nuestro código, inicializamos la year variable con un valor de 2022.
     * También imprimimos un texto: "Este bloque de código se ejecutó primero".
     */
    static {
        year = 2022;
        System.out.println("Este bloque de código se ejecutó primero");
    }

    public static void main(String[] args) {

        /**
         * En el main método, imprimimos "Hello World" y la year variable estática.
         */
        System.out.println("Hello World");
        System.out.println(year);

        /**
         * Esto demuestra cómo se ejecuta primero el código en el bloque estático antes que el main método.
         */

        // Este bloque de código se ejecutó primero
        // Hello World
        // 2022
    }
}

/**
 * sobre la static palabra clave en Java.
 * Es una palabra clave que principalmente nos ayuda a optimizar la memoria en nuestros programas Java.
 */