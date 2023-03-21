package com.charlycimino.$15calcularpromedios;

public class Main {

    public static void main(String[] args) {

        Consecionaria c = new Consecionaria("Toyoi");


        c.agregarAuto(new Auto("123", "Rojo", 1000));
        c.agregarAuto(new Auto("873", "Rosa", 2000));
        c.agregarAuto(new Auto("483", "Cafe", 3000));

        System.out.println("kms totales recorridos: " + c.sumatoriaKmsRecorridos());
        System.out.println("Cantidad de autos: " + c.cantAutos());
        System.out.println("Promedio de kms recorridos: " + c.promedioKmsRecorridos());
    }
}
