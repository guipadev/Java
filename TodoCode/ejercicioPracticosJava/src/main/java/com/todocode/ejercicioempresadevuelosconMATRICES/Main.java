package com.todocode.ejercicioempresadevuelosconMATRICES;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creamos la matriz
        int vuelos[][] = new int[6][3];

        // cargamos la matriz
        Scanner teclado = new Scanner(System.in);

        for (int fila = 0; fila < 6; fila++) {
            for (int column = 0; column < 3; column++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + fila + " horario: " + column);
                vuelos[fila][column] = teclado.nextInt();
            }
        }

        // venta de asientos
        Scanner teclado2 = new Scanner(System.in);
        String bander = "";
        int destino, horario, asientos;

        while (!bander.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el No de destino");
            destino = teclado.nextInt();
            System.out.println("Ingrese el horario de vuelo");
            horario = teclado.nextInt();
            System.out.println("Ingrese la cantidad de asientos");
            asientos = teclado.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con éxito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asiento disponibles");
                    }
                } else {
                    System.out.println("Horario no existe. Ingrese entro 0 y 2");
                }
            } else {
                System.out.println("Destino no existe. Ingrese entro 0 y 5");
            }
            System.out.println("¿Desea continuar reservando?. Ingrese finish para terminar o cualquier valor para seguir");
            bander = teclado2.next();
        }
    }
}
