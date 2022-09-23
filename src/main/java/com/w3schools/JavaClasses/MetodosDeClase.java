package com.w3schools.JavaClasses;

/**
 * Métodos de clase Java
 * En el capítulo Métodos de Java , aprendió que los métodos se declaran dentro de una clase y
 * que se utilizan para realizar ciertas acciones:
 *
 *
 * Estático vs Público
 * A menudo verá programas Java que tienen atributos statico public métodos.
 *
 * static método, significa que se puede acceder a él sin crear un objeto de la clase,
 * a diferencia public, al que solo pueden acceder los objetos:
 */

public class MetodosDeClase {

    // Cree un método llamado myMethod()en Main:
    static void myMethod() {
        System.out.println("Hello World!");
    }

    // Un ejemplo para demostrar las diferencias entre staticy public métodos :

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {

        // myMethod()imprime un texto (la acción), cuando se llama.
        // Para llamar a un método, escriba el nombre del método seguido de dos paréntesis () y un punto y coma ;

        myMethod(); // Outputs "Hello World!"

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        MetodosDeClase myObj = new MetodosDeClase(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object

        // Cree un objeto Car llamado myCar. Llame a los métodos fullThrottle()y en el objeto y ejecute el programa:speed()myCar
        MetodosDeClase myCar = new MetodosDeClase();   // Create a myCar object
        myCar.fullThrottle();   // Call the fullThrottle() method
        myCar.speed(200);   // Call the speed() method

        // The car is going as fast as it can!
        // Max speed is: 200
    }

    /*
    * Ejemplo explicado
    1) Creamos una Mainclase personalizada con la classpalabra clave.

    2) Creamos los métodos fullThrottle()y en la clase. speed()Main

    3) El fullThrottle()método y el speed() método imprimirán algo de texto, cuando sean llamados.

    4) El speed() método acepta un intparámetro llamado maxSpeed: lo usaremos en 8) .

    5) Para usar la Mainclase y sus métodos, necesitamos crear un objeto de la MainClase.

    6) Luego, vaya al main()método, que ya sabe que es un método Java incorporado que ejecuta su programa (se ejecuta cualquier código dentro de main).

    7) Usando la newpalabra clave creamos un objeto con el nombre myCar.

    8) Luego, llamamos a los métodos fullThrottle()y en el objeto, y ejecutamos el programa usando el nombre del objeto ( ), seguido de un punto ( ), seguido del nombre del método ( y ). Observe que agregamos un parámetro de 200 dentro del método.speed() myCarmyCar.fullThrottle(); speed(200);int speed()
    * */

    /*
    * Recuérdalo..
    El punto ( .) se usa para acceder a los atributos y métodos del objeto.

    Para llamar a un método en Java, escriba el nombre del método seguido de un conjunto de paréntesis () , seguido de un punto y coma ( ;).

    Una clase debe tener un nombre de archivo coincidente ( Mainy Main.java ).
    * */

    /*
    Uso de varias clases
    Como especificamos en el capítulo Clases , es una buena práctica crear un objeto de una clase y acceder a él en otra clase.

    Recuerde que el nombre del archivo java debe coincidir con el nombre de la clase. En este ejemplo, hemos creado dos archivos en el mismo directorio:

    Principal.java
    Segundo.java
    **/
}
