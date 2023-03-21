package com.charlycimino.$38INTERFACESimplements;

import java.util.ArrayList;

public class PartidoDelBuenCodigo {

    private ArrayList<EnviadorDeMensaje> mensajeros;

    public PartidoDelBuenCodigo() {
        mensajeros = new ArrayList<>();
    }

    public void agregarMensajero(EnviadorDeMensaje mensajero) {
        this.mensajeros.add(mensajero);
    }

    public void hacerCampania() {
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Vote por el Partido del Buen Código");
        }
    }
}
