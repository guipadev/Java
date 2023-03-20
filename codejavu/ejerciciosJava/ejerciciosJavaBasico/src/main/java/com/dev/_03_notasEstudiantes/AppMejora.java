package com.dev._03_notasEstudiantes;

import javax.swing.*;

/*
PROBLEMA:
Solicite tres notas de un estudiante y calcule el promedio de ellas, el sistema debe validar que las ntoas se encuentren
entre 0 y 5 y diga si gana o pierde

SOLUCIÓN:
Se resuelve usando ciclos para la validación de datos negativos y for para repetir el proceso
 */
public class AppMejora {

    public static void main(String[] args) {

        double nota = 0, promedio, sumatoria = 0;

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));

        for (int i = 0; i < cantidad; i++) {

            String nombre = JOptionPane.showInputDialog("Ingre el nombre el estudiante " + (i + 1));

            for (int j = 0; j < 3; j++) {

                do {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + (j + 1)));

                    if (nota < 0 || nota > 5) {
                        System.out.println("El rango para notas es de 0 a 5");
                    }
                } while (nota < 0 || nota > 5);

                sumatoria += nota;

                System.out.println(nota);
            }

            promedio = sumatoria / 3;

            System.out.println("Promedio = " + promedio);

            String rta = (promedio >= 3) ? "El estudiante " + nombre + ", GANA la Materia" : "El estudiante " + nombre + ", PIERDE la Materia";
            System.out.println(rta);

            sumatoria = 0;
        }
    }
}
