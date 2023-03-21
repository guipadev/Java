package com.charlycimino.$12coleccionArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Auto a1 = new Auto("SDTR484", "Verde");
        //Auto a2 = new Auto("SRT8555", "Rojo");
        //Auto a3 = new Auto("GRSTS45", "Azul");

        // Una variable guarde varios datos, inicializar darle un valor =
        ArrayList<Auto> misAutos = new ArrayList<>();

        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("*******************************");

        misAutos.add(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        misAutos.add(new Auto("SRT8555", "Rojo"));
        misAutos.add(new Auto("GRSTS45", "Azul"));

        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("*******************************");
        System.out.println("El 2do auto es: " + misAutos.get(1));

        System.out.println("*******************************");
        System.out.println("Mostrando todos los autos de la lista:");
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posicion " + i + " es: " + misAutos.get(i));
        }

        // Borrar elemento de la lista
        misAutos.remove(0);
    }
}
