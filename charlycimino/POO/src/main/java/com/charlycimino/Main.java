package com.charlycimino;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    static int[] myArray = {1,3,4,2,7,0};

    public static void main(String[] args) {

        int n = 10;
        for (int i = 0; i < myArray.length; i += 1) {
            for (int j = 0; j < myArray.length; j += 1) {
                if (i != j && (myArray[i] + myArray[j]) == n) {
                    System.out.println("Los numeros son: " + myArray[i] + " " + " " + myArray[j]);
                }

            }
            
        }
    }
}