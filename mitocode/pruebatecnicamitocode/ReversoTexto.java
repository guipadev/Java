package com.pruebatecnicamitocode;

import java.time.LocalDate;
import java.util.*;

public class ReversoTexto {

    // Uso algoritmico
    private void invertirCadenaFormaAlgoritmica(String text) {
        String [] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for (int i = array.length; i > 0; i--) {
            newText.append(array[i - 1]);
        }

        System.out.println(newText);
    }

    // Uso de clases por defecto Java
    private void invertirCadena(String text) {
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }

    private void capicua(int number) {
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)) {
            System.out.println("Si capicua");
        } else {
            System.out.println("No capicua");
        }
    }

    private void contarCaracteres (String text) {
         int i, lenght, counter[] = new int[256];

         lenght = text.length();

         for (i = 0; i < lenght; i++) {
             //counter[text.charAt(i)] = counter[text.charAt(i)] + 1;
             counter[text.charAt(i)]++;
         }

         for (i = 0; i < 256; i++) {
             if (counter[i] != 0) {
                 System.out.println((char)i + ": " + counter[i]);
             }
         }
    }

    private void caracteresRepetidos (String text) {
        int i, lenght, counter[] = new int[256];

        lenght = text.length();

        for (i = 0; i < lenght; i++) {
            counter[text.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] > 1) {
                System.out.println((char)i + ": " + counter[i]);
            }
        }
    }

    private void esMultiplo (int number) {
        if (number % 2 == 0) {
            System.out.println("Es multiplo");
        } else {
            System.out.println("No es multiplo");
        }
    }

    private void esBiciesto (int year) {
        boolean biciesto = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(biciesto);
    }

    private void desordenarCadena(String text) {
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::print);
    }

    private void encontrarNoDuplicados(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::print);
    }

    private void encontrarVocales(String text) {
        /*
        String[] array = text.split("");
        boolean isPresent = false;

        for (String s : array) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);
        */
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);

        // Otra forma funcional
        boolean rpta = Arrays.asList(text.split("")).stream().anyMatch(s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
        System.out.println(rpta);
    }

    private boolean esPalindromo(String text) {
        boolean result = true;
        int length = text.length();

        for(int i = 0; i < length/2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        // INVERTIR CADENA
        System.out.println("Voltear texto:");
        ReversoTexto entrada = new ReversoTexto();
        // Algoritmo
        System.out.println("Invertitr cadena forma algoritmica:");
        entrada.invertirCadenaFormaAlgoritmica("rosalia");
        // Clase Java
        System.out.println("Invertitr cadena con clases Java:");
        entrada.invertirCadena("rosalia");

        // PALABRA ES CAPICUA
        entrada.capicua(525);

        // CONTAR LA CANTIDAD DE CARACTERES QUE TENGAMOS COMO COINCIDENCIA
        System.out.println("Caracteres coincidencias:");
        entrada.contarCaracteres("mitocode");

        // CARACTERES REPETIDOS
        System.out.println("Caracteres repetidos:");
        entrada.caracteresRepetidos("mitocode");

        // SI # ES MULTIPLO DE 2
        System.out.println("Saber si es multipo de dos:");
        entrada.esMultiplo(20);

        // DETERMINAR SI EL AÑO ES BICIESTO
        System.out.println("Año biciesto:");
        entrada.esBiciesto(2024);

        // DESORDENAR CADENA DE TEXTO
        System.out.println("Texto desordenado:");
        entrada.desordenarCadena("Don Omar vs Daddy Yankee");

        // ENCONTRAR NO DUPLICADOS DE TEXTO
        System.out.println("\nEncontrar no duplicados del texto:");
        entrada.encontrarNoDuplicados(Arrays.asList(1,2,3,4,5,5,1,2,9));

        // VALIDAR SI HAY VOCALES EN EL TEXTO
        System.out.println("\nEncontrar vocales en texto:");
        entrada.encontrarVocales ("Don Omar vs Daddy Yankee");

        // VALIDAR SI PALABRA ES PALIDROME
        System.out.println("Validar si palabra es palindrome:");
        System.out.println(entrada.esPalindromo("ORO"));
    }
}
