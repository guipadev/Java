package Absolute.IF_ELSE_IF;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");

        int num = sc.nextInt();

        System.out.println("Ingrese número del día");

        int numDia = sc.nextInt();

        String result = (num > 0) ? "Número positivo" : "Número negativo";

        System.out.println(result);

        if (numDia == 1) {
            System.out.println("Lunes");
        } else if (numDia == 2) {
            System.out.println("Martes");
        } else if (numDia == 3) {
            System.out.println("Miercoles");
        } else if (numDia == 4) {
            System.out.println("Jueves");
        } else if (numDia == 5) {
            System.out.println("Viernes");
        } else if (numDia == 6) {
            System.out.println("Sabado");
        } else if (numDia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número no representa ningun día de la semana");
        }
    }
}
