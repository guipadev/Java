package com.todocode.VECTOREStresTEMPERATURASciudades;

import java.util.Scanner;

/**
 * En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades de la provincia de Misiones.
 * En el primer vector se guardan los nombres de las ciudades, en el segundo las temperaturas mínimas alcazadas y en el tercero las
 * temperaturas máximas alcanzadas en la última semana. Se necesita un programa que permita la carga de las ciudades, sus
 * temperaturas mínimas y máximas; además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja y
 * cual no la temperatura más alta (dando a conocer al mismo tiempo la cantida de grados).
 *
 * Oberá        16      29
 * Posadas      18      32
 * L.N. Alem    15      28
 * ...          ...     ...
 */
public class Main {

    public static void main(String[] args) {

        //creamos los 3 vectores
        String ciudades[] = new String[5];
        double minimas[] = new double[5];
        double maximas[] = new double[5];

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        //cargar los vectores
        for (int i = 0; i < ciudades.length; i++) {

            System.out.println("Ingrese el nombre de la ciudad " + i);
            ciudades[i] = teclado.next();

            System.out.println("Ingrese la mínima de la ciudad " + i);
            minimas[i] = teclado.nextDouble();

            System.out.println("Ingrese la máxima de laa ciudad " + i);
            maximas[i] = teclado.nextDouble();
        }

        double minima = 999999999.00;
        int posMin = -1;

        //determinamos la mínima
        for (int i = 0; i < minimas.length; i++) {

            if (minimas[i] < minima) {
                minima = minimas[i];
                posMin = i;
            }
        }

        double maxima = -999999999.00;
        int posMax = -1;

        //determinamos la máxima
        for (int i = 0; i < maximas.length; i++) {

            if (maximas[i] > maxima) {
                maxima = maximas[i];
                posMax = i;
            }
        }

        System.out.println("La temperatura mínima es de: " + minima);
        System.out.println("Se registró en la ciudad de: " + ciudades[posMin]);

        System.out.println("La temperatura máxima es de: " + maxima);
        System.out.println("Se registró en la ciudad de: " + ciudades[posMax]);

    }
}