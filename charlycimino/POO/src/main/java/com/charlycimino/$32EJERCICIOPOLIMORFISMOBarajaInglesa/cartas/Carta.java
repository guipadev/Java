package com.charlycimino.$32EJERCICIOPOLIMORFISMOBarajaInglesa.cartas;

import lombok.extern.java.Log;

@Log
public abstract class Carta {

    private boolean tapada;

    protected Carta() {
        this.tapada = true; // Por defecto, 'tapada' es false
    }

    public boolean isTapada() {
        return tapada;
    }

    /**
     * En vez de utilizar: if (tapada) { tapada = false; } else { tapada = true; }
     */
    public void darVuelta() {
        tapada = !tapada;
    }

    public void mostrar() {
        if (tapada) {
            log.info("****");
        } else {
            log.info(getRepresentacion());
        }
    }

    /**
     * Este método se convierte en abstracto
     * public String getRepresentacion() { return "Carta genérica"; }
     */
    public abstract String getRepresentacion();
}
