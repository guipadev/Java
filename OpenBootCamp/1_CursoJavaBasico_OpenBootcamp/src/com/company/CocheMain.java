package com.company;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romeo";
        // Coche cocheOb = new Coche();

        Coche cocheOb2 = new Coche("rojo", "honda", "civic", 1430.45, 5.4);

        cocheOb2.acelerar(50);

        System.out.println(cocheOb2);

        cocheOb2.peso = 1350.8;

        System.out.println(cocheOb2);

        // Mostrando los datos de la Herencia de cocheMain
        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Motor Electron";
        cocheElectrico.color = "Azul";
        cocheElectrico.fabricante = "toyota";
        cocheElectrico.modelo = "coupe";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico();
       // CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500d, 4.99, "coco");

    }
}
