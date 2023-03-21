package com.charlycimino.$31SUPERPOLIMORFISMOLlamarMetodoSobreescrito;

public class Bicicleta {

    private final int CANT_KMS_MAX = 50;
    private String marca;
    private int rodado;
    private int cantKms;

    public Bicicleta(String marca, int rodado, int cantKms) {
        this.marca = marca;
        this.rodado = rodado;
        this.cantKms = cantKms;
    }

    public boolean cumpleRequisitos() {
        return this.cantKms < CANT_KMS_MAX;
    }
}
