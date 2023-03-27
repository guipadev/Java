package com.todocode.CONDICIONALES;

import java.util.Scanner;

/**
 * Una pequeña despensa desea calcular los sueldos de sus empleados
 * Los puestos de los mismos pueden tener 3 categorias 1 repositar 2 cajero y 3 supervisor
 *
 * Los repositores cobra $15.890 + un bono del 10%
 * Los cajero cobran $25.630,89 fijos
 * Los supervisores cobran $35.560,20 en bruto al cual se le descuenta un 11% de jubilación
 *
 * Se necesita un programa que, dependiendo del tipo de empleado del que se trate, calcule y
 * muestre en pantalla el correspondiente sueldo
 */
public class Main {

    public static void main(String[] args) {

        double sueldo = 0;
        int categoria;

        System.out.println("Ingrese tipo de categoria a calcular");
        try (Scanner teclado = new Scanner(System.in)) {
            categoria = teclado.nextInt();
        }

        if (categoria == 1) {
            sueldo = 15890 + (15890*0.10);
        } else {
            if (categoria == 2) {
                sueldo = 25630.89;
            } else {
                if (categoria ==3) {
                    sueldo = 35560.20 - (35560.20 * 0.11);
                } else {
                    System.out.println("Debe ingresar un número de categoria valido");
                }
            }
        }

        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("El sueldo para la categoria " + categoria + " es igual a: $" + sueldo);
        }

    }

}
