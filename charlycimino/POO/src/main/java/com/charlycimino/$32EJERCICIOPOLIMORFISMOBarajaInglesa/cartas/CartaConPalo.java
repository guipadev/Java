package com.charlycimino.$32EJERCICIOPOLIMORFISMOBarajaInglesa.cartas;

import com.charlycimino.$32EJERCICIOPOLIMORFISMOBarajaInglesa.Palo;

public abstract class CartaConPalo extends Carta {

    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String getRepresentacion() {
        return " de " + palo;
    }
}
