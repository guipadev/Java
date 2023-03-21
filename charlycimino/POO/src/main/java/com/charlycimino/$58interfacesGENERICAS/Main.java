package com.charlycimino.$58interfacesGENERICAS;

public class Main {

    public static void main(String[] args) {
        Persona p = new Persona(1234, "Luis", "Gomez");
        Auto a = new Auto("ABC789", "Rojo");

        identificar(p);
        identificar(a);
    }

    public static void identificar(Identificable objIdentif) {
        System.out.println("Yo soy " + objIdentif.getId());
    }
}
