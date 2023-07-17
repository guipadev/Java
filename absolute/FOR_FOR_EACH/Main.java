package Absolute.FOR_FOR_EACH;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FOR puede ingresar un WHILE dentro de un FOR y un IF dentro de un mismo WHILE que sea controlado por una VARIABLE
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa hasta qué tabla deseas conocer resultados: ");
            int respuesta = sc.nextInt();

            System.out.println("Ingresa hasta qué número quieres multiplicar: ");
            int tabla = sc.nextInt();

            for (int i = 1; i <= respuesta; i++) {
                System.out.println("***** Tabla del " + i + " *****");
                for (int j = 1; j <= tabla; j++) {
                    System.out.println(i + " x " + j + " = " + i * j);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa solo números enteros!!");
        }

        // FOR EACH
        String[] nombres = {"Hugo", "Paco", "Luis"};

        for (String name : nombres) {
            System.out.println(name);
        }

        int[] numeros = {21,35,65,8,48};

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
