package com.w3schools.ArraysJava;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        /*
        Multidimensional Arrays
        A multidimensional array is an array of arrays.

        To create a two-dimensional array, add each array within its own set of curly braces:

        Example

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        myNumbers is now an array with two arrays as its elements.

        To access the elements of the myNumbers array, specify two indexes:
        one for the array, and one for the element inside that array.
        This example accesses the third element (2) in the second array (1) of myNumbers:
        */
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        int x = myNumbers[1][2];

        System.out.println(x); // Outputs 7

        // We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
        int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };

        for (int i = 0; i < myNumbers2.length; ++i) {
            for(int j = 0; j < myNumbers2[i].length; ++j) {
                System.out.println(myNumbers2[i][j]);
            }
        }

    }
}
