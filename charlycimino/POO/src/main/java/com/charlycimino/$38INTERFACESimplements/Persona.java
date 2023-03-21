package com.charlycimino.$38INTERFACESimplements;


public class Persona implements EnviadorDeMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Yendo casa por casa a tocar timbre para decir: " + mensaje);
    }
}
