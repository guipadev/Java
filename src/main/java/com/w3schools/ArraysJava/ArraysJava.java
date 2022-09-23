package com.w3schools.ArraysJava;

public class ArraysJava {

    public static void main(String[] args) {

        /*
        Java Arrays
        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        To declare an array, define the variable type with square brackets:

        String[] cars;

        We have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-separated list, inside curly braces:

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        To create an array of integers, you could write:

        int[] myNum = {10, 20, 30, 40};
        */

        // Access the Elements of an Array
        //You can access an array element by referring to the index number.

        //This statement accesses the value of the first element in cars:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars[0]); // Outputs Volvo

        // Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        /*
        Change an Array Element
        To change the value of a specific element, refer to the index number:

        Example
        cars[0] = "Opel";
        */
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};

        cars2[0] = "Opel";

        System.out.println(cars2[0]); // Now outputs Opel instead of Volvo

        /*
        Array Length
        To find out how many elements an array has, use the length property:
        */
        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars3.length); // Outputs 4
    }
}
