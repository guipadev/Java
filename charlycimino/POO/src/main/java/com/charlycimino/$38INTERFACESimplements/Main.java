package com.charlycimino.$38INTERFACESimplements;

public class Main {

    public static void main(String[] args) {

        PartidoDelBuenCodigo p = new PartidoDelBuenCodigo();

        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new Persona());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());

        p.hacerCampania();
    }
}
