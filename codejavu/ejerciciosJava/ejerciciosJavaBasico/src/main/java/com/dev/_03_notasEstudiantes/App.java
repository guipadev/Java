package com.dev._03_notasEstudiantes;

import javax.swing.*;

/*
PROBLEMA:
Solicite tres notas de un estudiante y calcule el promedio de ellas, el sistema debe validar que las ntoas se encuentren
entre 0 y 5 y diga si gana o pierde

SOLUCIÓN:
Se resuelve usando ciclos para la validación de datos negativos y for para repetir el proceso
 */
public class App {

    public static void main(String[] args) {

        double nota1, nota2, nota3, promedio;

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));

        for (int i = 0; i < 3; i++) {

            String nombre = JOptionPane.showInputDialog("Ingre el nombre el estudiante");

            do {
                nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));

                if (nota1 < 0 || nota1 > 5) {
                    System.out.println("El rango de la nota a ingresa debe ser de 0 a 5");
                }

            } while (nota1 < 0 || nota1 > 5);

            do {
                nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));

                if (nota2 < 0 || nota2 > 5) {
                    System.out.println("El rango de la nota a ingresa debe ser de 0 a 5");
                }

            } while (nota2 < 0 || nota2 > 5);

            do {
                nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));

                if (nota3 < 0 || nota3 > 5) {
                    System.out.println("El rango de la nota a ingresa debe ser de 0 a 5");
                }

            } while (nota3 < 0 || nota3 > 5);



            promedio = (nota1 + nota2 + nota3) / 3;


            String rta = (promedio >= 3) ? "El estudiante " + nombre + "GANA la Materia" : "El estudiante " + nombre + "PIERDE la Materia";


            System.out.println("El promedio es: " + promedio);
        }


    }
}
