package com.charlycimino.$29EJERCICIOPOOHERENCIAjuegoBarajas.cartas;

import com.charlycimino.$29EJERCICIOPOOHERENCIAjuegoBarajas.Palo;

public class CartaFigura extends CartaConPalo {

    private char letra;

    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }
}
