package Exercises;

// Fill in the missing parts to import the java.util.Scanner class from the Java API:
// import.java.util.Scanner;

public class ExerciseClassObjects {

    public static void main(String[] args) {

        // Create an object of MyClass called myObj.
        // Create an myObj object of class MyClass (This will call the constructor)
        MyClass myObj = new MyClass();

        // Use myObj to access and print the value of the x attribute of MyClass.
        // Print the value of x
        System.out.println(myObj.x);

        // Call myMethod on the object.
        myObj.myMethod();

    }
}

// Create a class called MyClass.
// Create and call a class constructor of MyClass
// Follow the comments to insert the missing parts of the code below:
// The class below should not be inherited by other classes. Add the correct modifier:
final class MyClass {

    int x; // Create a class attribute x

    // Create a class constructor for the MyClass class
    public MyClass() {
        x = 5; // Set the initial value for the class attribute x to 5
    }

    public void myMethod() {
        System.out.println("Hello World");
    }
}

// The Car class should inherit the attributes and methods from the Vehicle class. Add the correct keyword to make this possible.
// class Car extends Vehicle