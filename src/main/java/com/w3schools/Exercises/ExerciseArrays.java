package com.w3schools.Exercises;

public class ExerciseArrays {

    public static void main(String[] args) {

        // Create an array of type String called cars.
        String[] cars = {"Volvo", "BMW", "Ford"};

        // Print the second item in the cars array.
        System.out.println(cars[1]);

        // Change the value from "Volvo" to "Opel", in the cars array.
        cars[0] = "Opel";
        System.out.println(cars[0]);

        // Find out how many elements the cars array have.
        System.out.println(cars.length);

        // Loop through the items in the cars array.
        for (String carro : cars) {
            System.out.println(carro);
        }

        // Insert the missing parts to create a two-dimensional array.
        int [][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    }
}
