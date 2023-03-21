package com.charlycimino.$30POLIMORFISMOsobreescrituraMetodos;

public class BicicletaElectrica extends Vehiculo {

    public void prenderPantalla() {
        System.out.println("Pantalla prendida");
    }

    public void energizarMotor() {
        System.out.println("Motor listo");
    }

    // Redefinir un método implicaria que ante un mismo mensaje,
    // haya un comportamiento diferente al declarado en la super clase
    @Override
    public void encender() {
        prenderPantalla();
        energizarMotor();
    }
}
