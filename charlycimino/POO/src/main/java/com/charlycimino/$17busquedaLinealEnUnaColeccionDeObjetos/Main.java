package com.charlycimino.$17busquedaLinealEnUnaColeccionDeObjetos;

public class Main {

    public static void main(String[] args) {

        Consecionaria c = new Consecionaria("Toyoi");


        c.agregarAuto(new Auto("123", "Rojo", 1003));
        c.agregarAuto(new Auto("873", "Rosa", 4000));
        c.agregarAuto(new Auto("483", "Cafe", 2000));
        c.agregarAuto(new Auto("sfa123", "Gris", 4000));
        c.agregarAuto(new Auto("8sf7f3", "Morado", 3000));
        c.agregarAuto(new Auto("4sf8sf3", "Verde", 4000));

        // Busqueda por patente
        Auto a = c.buscarAuto("SFA123");

        if (a == null) {
            System.out.println("No se encontro :( !!");
        } else  {
            System.out.println("Se encontro: " + a);
        }
    }
}
