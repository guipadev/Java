package com.charlycimino.$57COMODINESlimitadosEXTENDSySUPER;

public class Futbolista extends Deportista {

    private int nroCamiseta;

    public Futbolista(String nombre, String apellido, int energia, int nroCamiseta) {
        super(nombre, apellido, energia);
        this.nroCamiseta = nroCamiseta;
    }

    public void patear() {
        System.out.println("Pateando...");
    }

    @Override
    public String toString() {
        return super.toString() + " que es Futbolista{" + "nroCamiseta=" + nroCamiseta + '}';
    }
}
