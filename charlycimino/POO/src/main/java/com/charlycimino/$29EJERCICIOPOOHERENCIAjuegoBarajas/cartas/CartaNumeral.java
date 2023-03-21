package com.charlycimino.$29EJERCICIOPOOHERENCIAjuegoBarajas.cartas;

import com.charlycimino.$29EJERCICIOPOOHERENCIAjuegoBarajas.Palo;

public class CartaNumeral extends CartaConPalo {

    private int numero;

    public CartaNumeral(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }
}
