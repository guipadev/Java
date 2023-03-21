package com.charlycimino.$38INTERFACESimplements;


public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje {

    public void llamar() {
        System.out.print("Llamando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.println(" Conectando con la API de WhatsApp para enviar un mensaje que dice: " + mensaje);
    }
}
