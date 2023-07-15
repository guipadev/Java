package Absolute.SWITCH;

import java.util.Scanner;

/**
 * Compuesta por los casos que se pongan:
 *
 * switch(variable) {
 *     case 1: // Instrucciones
 *      breack;
 *     case 2: // Instrucciones
 *      break;
 *     default: // Instrucciones
 * }
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        String nombre;

        System.out.println("Ingrese el número: ");
        num = sc.nextInt();

        // Consumir el carácter de nueva línea pendiente
        sc.nextLine();

        System.out.println("Ingrese nombre usuario a ingresar: ");
        nombre = sc.nextLine();

        switch (num) {
            case 1:
                System.out.println("Soy el primero");
                break;
            case 2:
                System.out.println("Soy el segundo");
                break;
            default:
                System.out.println("No hay más opción");
        }

        /**
         * Cuando usuario de netflix necesita ingresar al sitio
         */
        switch (nombre) {
            case "Mike":
                AccesoCorrecto();
                break;
            case "Paul":
                AccesoCorrecto();
                break;
            default:
                AccesoDenegado();
        }
    }

    private static void AccesoCorrecto() {
        System.out.println("Acesso exitoso!!");
    }

    private static void AccesoDenegado() {
        System.out.println("Acceso denegado!!");
    }
}
