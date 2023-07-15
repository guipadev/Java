package Absolute.FOR;

import java.util.Scanner;

/**
 * FOR puede ingresar un WHILE dentro de un FOR y un IF dentro de un mismo WHILE que sea controlado por una VARIABLE
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa hasta que tabla deseas conocer resultados: ");

        int respuesta = sc.nextInt();

        System.out.println("Ingresa hasta que numero quieres multiplicar: ");

        int tabla = sc.nextInt();

        for (int i = 1; i <= respuesta; i++) {

            System.out.println("***** Tabla del " + i + " *****");

            for (int j = 1; j <= tabla; j++) {
                System.out.println(i + " x " + j + " = "+ i * j);
            }
        }
    }
}
