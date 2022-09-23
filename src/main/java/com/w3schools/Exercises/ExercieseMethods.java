package com.w3schools.Exercises;

public class ExercieseMethods {

    public static void main (String[] args) {

        // Insert the missing part to call myMethod from main.
        myMethod();

        // Insert the missing part to call myMethod from main two times.
        myMethod();

        // Add a fname parameter of type String to myMethod, and output "John Doe".
        myMethod2("John");

        // Insert the missing part to print the number 8 in main, by using a specific keyword inside myMethod:
        System.out.println(myMethod3(3));

        // Call the checkAge method and pass along an age of 20
        checkAge(20);
    }

    // Insert the missing part to call myMethod from main.
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    // Add a fname parameter of type String to myMethod, and output "John Doe".
    static void myMethod2(String fname) {
        System.out.println(fname + " Doe");
    }

    // Insert the missing part to print the number 8 in main, by using a specific keyword inside myMethod:
    static int myMethod3(int x) {
        return 5 + x;
    }

    // Follow the comments to insert the missing parts of the code below:
    // Create a checkAge() method with an integer variable called age
    static void checkAge (int age) {

        // If age is less than 18, print "Access denied"
        if (age < 18) {
            System.out.println("Access denied");
        } // If age is greater than, or equal to, 18, print "Access granted"
        else {
            System.out.println("Access granted");
        }

    }

}
