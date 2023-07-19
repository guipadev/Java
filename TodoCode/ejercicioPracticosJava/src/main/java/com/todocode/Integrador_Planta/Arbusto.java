package com.todocode.ejercicioPOOintegradorPlanta;

public class Arbusto extends Arbol {

    private int anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePodaONo;

    public Arbusto() {}

    public Arbusto(String nombre, int altoTallo, boolean tieneHojas, String climaIdeal, String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas, int anchoArbusto, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePodaONo) {
        super(nombre, altoTallo, tieneHojas, climaIdeal, variedad, tipoTronco, radioTronco, color, tipoHojas);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public int getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(int anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    protected void saludo() {
        System.out.println("Hola soy un arbusto");
    }
}
