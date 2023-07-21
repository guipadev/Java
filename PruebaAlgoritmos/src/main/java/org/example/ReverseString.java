package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String text = "Bird";

        String reverseString = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseString += text.charAt(i);
        }

        System.out.println(reverseString);

        // Otra forma mas optima para no estar creando un String en cada iteración
        String texto = "Bird";

        String[] stringArray = new String[texto.length()];

        int index = 0;

        for (int i = texto.length() - 1; i >= 0; i--) {
            stringArray[index] = String.valueOf(texto.charAt(i));
            index++;
        }

        System.out.println(Arrays.toString(stringArray));
    }
}
