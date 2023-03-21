package com.charlycimino.$30POLIMORFISMOsobreescrituraMetodos;

public class Avion extends Vehiculo {

    public void calefaccionCarburador() {
        System.out.println("Carburador listo");
    }

    public void regularMezclaDeCombustible() {
        System.out.println("Mezcla regulada");
    }

    public void inyectarCombustible() {
        System.out.println("Combustible inyectado");
    }

    public void masPasos() {
        System.out.println("Muchos pasos más...");
    }

    // Para considerar a un mètodo como sobreescrito, debe respetar la firma tal como se declaro
    // en la super clase
    @Override
    public void encender() {
        calefaccionCarburador();
        regularMezclaDeCombustible();
        inyectarCombustible();
        masPasos();
    }
}
