package com.company;

public class Interfaces {

    public static void main(String[] args) {

    }
}

interface Car {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Moto implements Car {
    public void Acelerar(int cuantaVelocidad) {}

    public void Frenar(int cuantaVelocidad) {}
}