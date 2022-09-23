package com.w3schools.JavaClasses;

/*
* modificadores
* A estas alturas, está bastante familiarizado con la publicpalabra clave que aparece en casi todos nuestros ejemplos:
*
* La publicpalabra clave es un modificador de acceso , lo que significa que se utiliza para establecer el nivel de acceso para clases, atributos, métodos y constructores.
*
* Dividimos los modificadores en dos grupos:
*
* Modificadores de acceso : controla el nivel de acceso
* Modificadores sin acceso : no controlan el nivel de acceso, pero proporcionan otra funcionalidad
* */

/*
* MODIFICADORES DE ACCESO
*
* Para las clases, puede usar publico por defecto :
* Modifier	    Description
* public	    The class is accessible by any other class
* default	    The class is only accessible by classes in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
*
* Para atributos, métodos y constructores , puede usar uno de los siguientes:
* Modifier	Description
* public	The code is accessible for all classes
* private	The code is only accessible within the declared class
* default	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
* protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter
* */

/*
* MODIFICADORES DE NO ACCESO
*
* Para las clases , puede usar finalo abstract:
* Modifier	Description
* final	    The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)
* abstract	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters)
*
* Para atributos y métodos , puede usar uno de los siguientes:
* Modifier	    Description
* final	        Attributes and methods cannot be overridden/modified
* static	    Attributes and methods belongs to the class, rather than an object
* abstract	    Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
* transient	    Attributes and methods are skipped when serializing the object containing them
* synchronized	Methods can only be accessed by one thread at a time
* volatile	    The value of an attribute is not cached thread-locally, and is always read from the "main memory"
*
 * */


/*
* Final
Si no desea tener la capacidad de anular los valores de atributos existentes,
* declare los atributos como final:
*/
class MainFinal {
    final int x = 10;
    final double PI = 3.14;
}

/*
* Estático
* Un static método significa que se puede acceder a él sin crear un objeto de la clase,
* a diferencia de public:
*/

/*
* Un abstractmétodo pertenece a una abstractclase y no tiene cuerpo.
* El cuerpo lo proporciona la subclase:
* */
abstract class MainA {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends MainA {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Main.java

public class Modificadores {
    //Un ejemplo para demostrar las diferencias entre staticy publicmétodos:
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {

        MainFinal myObj = new MainFinal();
        // myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        // myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        Modificadores myObj2 = new Modificadores(); // Create an object of Main
        myObj2.myPublicMethod(); // Call the public method

        // create an object of the Student class (which inherits attributes and methods from Main)
        Student estudiante = new Student();

        System.out.println("Name: " + estudiante.fname);
        System.out.println("Age: " + estudiante.age);
        System.out.println("Graduation Year: " + estudiante.graduationYear);
        estudiante.study(); // call abstract method
        }
}
