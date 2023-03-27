package com.company;

public class DicierneCasoSwitch {

    public static void main(String[] args) {
        var estacion = "VERANO";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Estoy en default");
        }
    }
}
