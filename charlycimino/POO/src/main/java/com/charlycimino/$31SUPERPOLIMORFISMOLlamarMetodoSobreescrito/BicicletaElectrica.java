package com.charlycimino.$31SUPERPOLIMORFISMOLlamarMetodoSobreescrito;

public class BicicletaElectrica extends Bicicleta {

    private final int CANT_POT_MAX = 400;
    private int potencia;

    public BicicletaElectrica(String marca, int rodado, int cantKms, int potencia) {
        super(marca, rodado, cantKms);
        this.potencia = potencia;
    }

    @Override
    public boolean cumpleRequisitos() { // aplicación de super al ver ambiguedad
        return this.potencia < CANT_POT_MAX && super.cumpleRequisitos();
    }
}
