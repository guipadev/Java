package com.morsa.PatronDeDisenoState;

/**
 * El patrón State (Estado) es muy útil en la programación de videojuegos para definir las acciones
 * de un personaje a medida que va cambiando su estado a lo largo del juego.
 */

/*
Ejemplo crear juego tamagoshi sin State
Con muchos casos de decision lo cual es complejo

class Tamagoshi {

    void alimentar() {
        if (tieneHambre) {
            print("comiendo...");
        } else if (tieneSueño) {
            print("No tengo hambre...");
        } else if (estaDuermiendo) {
            print("Zzzz...");
        }
        ......
        ......
    }
}


Ejemplo uso State

Se definen diferentes estados
Durmiendo, Hambriento, Cansando, Aburrido que se entrelaza entre si.

Todos estos estados estaran dentro de una intefaz estado:

Estado {
    void alimentar();
    void jugar();
    void dormir();
    void comoEstas();
}

Al implementarlo en la clase seria

class Cansado implements Estado {
    void alimentar() {
        print("No tengo hambre");
    }

    void dormir() {
        print("Buenas noches Zzzz");
    }
}

* */

public class Main {

    public static void main(String[] args) {

        Tamagotchi miTamagotchi = new Tamagotchi();

        new Menu(miTamagotchi).display();
    }
}
