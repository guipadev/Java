package com.charlycimino.$0estadoObjetos;

public class Principal {

    public static void main(String[] args) {

        Auto carro = new Auto();

        System.out.println(carro.patente + " " + carro.color + " " + carro.kms + " " + carro.conAire);

        carro.patente = "ABC123";
        carro.color = "Verde";
        carro.kms = 500;
        carro.conAire = true;

        Auto otroAuto;
        otroAuto = carro;
        // otroAuto = null; // daria un error

        System.out.println("Referencia carro 1: ");
        System.out.println(carro);

        System.out.println("Referencia carro 2: ");
        System.out.println(otroAuto);

        System.out.println("Carro 1 color:");
        System.out.println(carro.color);

        System.out.println("Carro 2 color:");
        otroAuto.color = "Gris";
        System.out.println(carro.color); // Saldra color gris ya que es el mismo objeto en la misma direccion en memoria


        Auto bmw = new Auto();

        bmw.patente = "AC102";
        bmw.color = "Azul";
        bmw.kms = 200;
        bmw.conAire = false;

        System.out.println("Patente: " + bmw.patente + ", Color: " + bmw.color + ", con recorrido de: " + bmw.kms + ", AA: " + bmw.conAire);
    }
}
