package com.morsa.inyeccionDeDependencias;

public class Main {

    public static void main(String[] args) {

        // Solo main dependera de la clase veterinario
        // Ahora el main pasaria a depender del objeto veterinario
        Gato miGato = new Gato(new Veterinario(),4, 8);

        boolean estaSano = miGato.esUnGatoSaludable();

        if (estaSano) {
            System.out.println("Mi gato esta sano :)");
        } else {
            System.out.println("Mi gato deberia bajar de peso :(");
        }
    }
}
