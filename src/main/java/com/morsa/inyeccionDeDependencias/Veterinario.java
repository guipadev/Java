package com.morsa.inyeccionDeDependencias;

public class Veterinario {

    public boolean diagnosticar(Gato gato) {

        if (gato.edad > 15) {
            throw new IllegalArgumentException("Fuera de mi expertiz");
        }

        return gato.pesoKg < 10 && gato.edad < 5 || gato.pesoKg < 7;
    }
}
