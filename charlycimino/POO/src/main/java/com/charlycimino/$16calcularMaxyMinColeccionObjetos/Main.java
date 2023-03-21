package com.charlycimino.$16calcularMaxyMinColeccionObjetos;

public class Main {

    public static void main(String[] args) {

        Consecionaria c = new Consecionaria("Toyoi");


        c.agregarAuto(new Auto("123", "Rojo", 1000));
        c.agregarAuto(new Auto("873", "Rosa", 2000));
        c.agregarAuto(new Auto("483", "Cafe", 3000));
        c.agregarAuto(new Auto("sfa123", "Gris", 1000));
        c.agregarAuto(new Auto("8sf7f3", "Morado", 2000));
        c.agregarAuto(new Auto("4sf8sf3", "Verde", 3000));

        System.out.println("Auto con mayor cantidad de kms recorridos: " + c.autoMasKmsRecorridos());

        System.out.println("Auto con menor cantidad de kms recorridos: " + c.autoMenosKmsRecorridos());

        System.out.println(c.autosMasKmsRecorridos());
    }
}
