package com.todocode.VECTORESCargayrecorridonombres;

/**
 * Llevar a cabo un programa que incluya un vector que almacene los nombres:
 * Alejandra, Leonardo, Rosa, GUillermo, Gabriel, Daniel, Luisa y Ludmila.
 * Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla
 */
public class Main {

    public static void main(String[] args) {

        //Tener un vector que guarde 8 nombres
        String vector[] = new String[8];

        vector[0] = "Alejandra";
        vector[1] = "Leonardo";
        vector[2] = "Rosa";
        vector[3] = "Guillermo";
        vector[4] = "Gabriel";
        vector[5] = "Daniel";
        vector[6] = "Luisa";
        vector[7] = "Ludmila";

        //Recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("En la posición: " + i + " Esta el nombre: " + vector[i]);
        }
    }
}
