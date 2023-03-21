package com.charlycimino.$29EJERCICIOPOOHERENCIAjuegoBarajas.cartas;

import com.charlycimino.$29EJERCICIOPOOHERENCIAjuegoBarajas.Palo;

public abstract class CartaConPalo extends Carta {

    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }
}
