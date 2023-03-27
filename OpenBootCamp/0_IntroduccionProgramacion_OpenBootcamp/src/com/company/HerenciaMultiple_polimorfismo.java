package com.company;

public class HerenciaMultiple_polimorfismo {

    public static void main(String[] args) {
        Vehiculito motor = new Motor();
        motor.diHola();
        motor.sumaNumeros(3, 5);
        motor.sumaNumeros(2.3, 5.8);
    }
}

class Vehiculito {
    int velocidadMaxima;

    public Vehiculito() {
        System.out.println("Estoy en el constructor de vehiculito");
    }

    public void diHola() {
        System.out.println("Hola!!");
    }

    // Poliformismo cuando se llame y de acuerdo a lo parametros dara un valor X
    public int sumaNumeros(int a, int b) {
        System.out.println("Soy el suma numeros INT");
        return a + b;
    }

    public float sumaNumeros(float a, float b) {
        System.out.println("Soy el suma numeros FLOAT");
        return a + b * (float)9.0 ;
    }

    public void sumaNumeros(double a, double b) {
        System.out.println("Soy el suma numeros DOUBLE");
        System.out.println("El resultado es: " + (a + b));
    }
}

class Motor extends Vehiculito {
    String tipomotor;
    public Motor() {
        System.out.println("Estoy en el constructor de motor");
    }

    // Polimorfismo
    public void diHola() {
        System.out.println("Soy un motor!!");
    }




}

// Herencia multiple, aunque ya no se puede utilizar en las nuevas versiones de Java
// class Cochecito extends Vehiculito, Motor {}