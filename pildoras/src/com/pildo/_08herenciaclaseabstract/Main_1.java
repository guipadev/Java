package com.pildo._08herenciaclaseabstract;

public class Main {

    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado("Luis Conde", 5000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("Ana Lopez", "Biologia");

        for (Persona person : lasPersonas) {
            System.out.println(person.dameNombre() + ", " + person.dameDescripcion());
        }
    }
}
