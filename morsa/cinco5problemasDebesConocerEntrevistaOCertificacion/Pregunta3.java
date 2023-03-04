package com.morsa.cinco5problemasDebesConocerEntrevistaOCertificacion;

class Panda {
    int edad;

    // Estatico es un bloque de inicializacion
    static {
        System.out.println("Hello");
    }

    Panda() {
        System.out.println(edad);
        edad = 10;
    }

    // Este puede acceder atributos de la clase el static no
    {
        System.out.println(edad);
        edad = 4;
    }
}

public class Pregunta3 {
    /** (Osea en una clase constructor al final se ejecutan primero los bloques inicialaicer, se instancia/asginan los atributos)
     * Cuando se instancia una clase
     * Lo primero que se ejecuta son los bloques de inicializacion
     * Y al final se ejecuta el constructor
     * Como lo podemos ver al ejecutar este programa
     * */

    static {
        System.out.println("La pregunta 3");
    }

    public static void main(String[] args) {
        // ¿Funciona este programa? ¿Qué va a pasar si lo ejecuto?

        System.out.println("Aca empieza el main");
        Panda unPanda = new Panda();
        System.out.println(unPanda.edad);
    }
}
