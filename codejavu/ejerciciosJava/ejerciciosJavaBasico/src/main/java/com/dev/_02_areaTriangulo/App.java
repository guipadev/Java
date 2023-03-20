package com.dev._02_areaTriangulo;

import javax.swing.*;
import java.util.Scanner;

/*
PROBLEMA:
Halle el área de un triángulo rectángulo si su base y altura son de un valor desconocido
área = (base*altura)/2 este proceso debe realizarse n veces.

SOLUCION:
Se resuelve usando Scanner para el ingreso de datos, ciclo do while para repetir el proceso,
así como el uso de .equalsIgnoreCase() para la validación
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String resp = "";

        do {

            System.out.println("Ingrese la base: ");

            double base = sc.nextDouble();

            System.out.println("Ingrese la altura: ");

            double altura = Double.parseDouble(sc.next());

            double area = (base * altura) / 2;

            System.out.println("El area del triangulo es: " + area);

            resp = JOptionPane.showInputDialog("Ingres si, para calcular un nuevo area");
        } while (resp.equalsIgnoreCase("si"));


    }
}
