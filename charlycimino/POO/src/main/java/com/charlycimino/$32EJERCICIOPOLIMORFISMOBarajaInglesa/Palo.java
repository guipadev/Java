package com.charlycimino.$32EJERCICIOPOLIMORFISMOBarajaInglesa;

public enum Palo {
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO),
    PICA(Color.NEGRO),
    TREBOL(Color.NEGRO);

    private Color color;

    private Palo(Color co) {

        this.color = co;
    }
}
