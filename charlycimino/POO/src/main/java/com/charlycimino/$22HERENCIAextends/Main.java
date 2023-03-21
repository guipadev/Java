package com.charlycimino.$22HERENCIAextends;

public class Main {

    /*
    * Las subclases heredan todos los miembros NO privados de la superclase
    * (excepto los constructores)
    * */

    public static void main(String[] args) {

        Auto a = new Auto();
        Moto m = new Moto();

        m.acelerar();
        m.hacerWheliee();
    }
}
