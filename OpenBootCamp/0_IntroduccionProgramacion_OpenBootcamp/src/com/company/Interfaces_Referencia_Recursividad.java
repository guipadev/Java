package com.company;

public class Interfaces_Referencia_Recursividad {

    public static void main(String[] args) {
        Voleibol voleibol = new Voleibol();
        Baloncesto baloncesto = new Baloncesto();

        // Sin necesidad de tocar la función se mostrar de acuerdo a esta tipo pasado
        EjecutaTipo(voleibol);
        EjecutaTipo(baloncesto);

        // Referencia por valor, lo malo es que va sumando muchos bytes
        int valA = 5; // int = 32bits, = 4 bytes
        int valB = 10; // int = 32bits, = 4 bytes

        suma(valA, valB); // 64bits, = 16 bytes

        System.out.println(valA);
        System.out.println(valB);

        System.out.println(voleibol.velocidad);

        factorial(8);
    }

    // Función por recursividad, aunque se podria de no hacerlo recursivo
    public static int factorial(int numero) {
        int resultado;
        if (numero == 1) {
            return 1;
        }

        resultado = factorial(numero - 1) * numero;
        return resultado;
    }

    // Paso por Referencia
    public static void balonChanger(Voleibol voleibol) {
        voleibol.velocidad += 50;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    // Pedirle a funcion que el parametro sea un interface, Esta función no esta pidiendo un parametro
    // Esta solicitando el nombre de una clase que implemente esta interface
    public static void EjecutaTipo(Balon balon) {
        // Obligatoriamente debe tener los métodos de la interface
        balon.Diametro(2);
    }
}

interface Balon {
    void Diametro(int cuantoMide);
    void Color(String cualColor);
}

class Voleibol implements Balon {
    int velocidad = 0;

    public void Diametro(int cuantoMide){
        System.out.println("Diametro 5");
    }

    public void Color(String cualColor){
        System.out.println("Amarillo");
    }
}

class Baloncesto implements Balon {
    public void Diametro(int cuantoMide){
        System.out.println("Diametro 10");
    }

    public void Color(String cualColor){
        System.out.println("Naranja");
    }
}