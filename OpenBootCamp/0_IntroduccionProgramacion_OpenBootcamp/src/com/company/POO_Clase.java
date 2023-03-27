package com.company;

public class POO_Clase {

    public static void main(String[] args) {
        Carro coche = new Carro("rojo", 1);

        System.out.println(coche.velocidadActual);
        coche.acelarar();
        System.out.println(coche.velocidadActual);
        coche.decelerarr();
        System.out.println(coche.colorCarro);
        System.out.println(coche.tipoCarro);

        Carro coche2 = new Carro();
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);

        Carro coche3 = new Carro("azul", 0);
        System.out.println(coche3.numeroDePuertas);
        System.out.println(coche3.velocidadMaxima);
        System.out.println(coche3.velocidadActual);
    }
}

class Carro {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;
    String colorCarro;
    int tipoCarro;

    // Constructor
    public Carro(String color, int tipo) {
        // Con el constructor se pueden inicializar los valores por defecto
        numeroDePuertas = 5;
        velocidadActual = 120;
        colorCarro = color;
        tipoCarro = tipo;
        System.out.println("Estoy en el constructor, con parametros");
    }

    // Sobre carga
    public Carro() {
        // Con el constructor se pueden inicializar los valores por defecto
        numeroDePuertas = 2;
        velocidadActual = 350;
        System.out.println("Estoy en el constructor de sobre carga,en este caso sin parametros");
    }

    // Inicializar una propiedad de la clase cuyo nombre es igual al parametro de la funcion
    // para hacer referencia al nombre de la clase/propiedad debes anteponer this
    public Carro(int numeroDePuertas, int velocidadMaxima) {
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Forma inicializar");
    }

    public void acelarar() {
        velocidadActual += 15;
    }

    public void decelerarr() {}
}
