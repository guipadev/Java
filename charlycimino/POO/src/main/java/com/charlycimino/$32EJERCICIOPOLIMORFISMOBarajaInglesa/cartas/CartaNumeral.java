package com.charlycimino.$32EJERCICIOPOLIMORFISMOBarajaInglesa.cartas;

import com.charlycimino.$32EJERCICIOPOLIMORFISMOBarajaInglesa.Palo;

public class CartaNumeral extends CartaConPalo {

    private int numero;

    public CartaNumeral(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }

    public String getRepresentacion() {
        return numero + super.getRepresentacion();
    }
}
