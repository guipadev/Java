package com.w3schools;

public class Variables {

    public static void main(String[] args) {

        // Java Variables
        // Variables are containers for storing data values.
        // In Java, there are different types of variables, for example:
        /*
        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false
        */

        // Create a variable called name of type String and assign it the value "John":
        String name = "John";
        System.out.println(name);

        // Create a variable called myNum of type int and assign it the value 15:
        // You can also declare a variable without assigning the value, and assign the value later:
        int myNum;
        myNum = 15;
        System.out.println(myNum);

        /*
        Final Variables
        If you don't want others (or yourself) to overwrite existing values, use the final keyword
        (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
        */
        final int myNum2 = 15;
        //myNum2 = 20;  // will generate an error: cannot assign a value to a final variable

        // Other Types
        //A demonstration of how to declare variables of other types:
        float myFloatNum = 5.99f;   // Floating point number
        char myLetter = 'D';    // Character
        boolean myBool = true;  // Boolean
        String myText = "Hello";    // String

        /*
        The general rules for naming variables are:

        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter and it cannot contain whitespace
        Names can also begin with $ and _ (but we will not use it in this tutorial)
        Names are case sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        */
    }
}
