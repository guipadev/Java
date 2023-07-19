package com.todocode.ejercicioPOOintegradorPlanta;

public class Flor extends Arbol {

    private String colorPetalos;
    private int cantidadPromedioPetalos;
    private String colorPistilo;
    private String getColorPetalos;
    private String variedadFLor;
    private String estacionQueFlorece;

    public Flor() {}
    public Flor(String nombre, int altoTallo, boolean tieneHojas, String climaIdeal, String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas, String colorPetalos, int cantidadPromedioPetalos, String colorPistilo, String getColorPetalos, String variedadFLor, String estacionQueFlorece) {
        super(nombre, altoTallo, tieneHojas, climaIdeal, variedad, tipoTronco, radioTronco, color, tipoHojas);
        this.colorPetalos = colorPetalos;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPistilo = colorPistilo;
        this.getColorPetalos = getColorPetalos;
        this.variedadFLor = variedadFLor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public void setCantidadPromedioPetalos(int cantidadPromedioPetalos) {
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getGetColorPetalos() {
        return getColorPetalos;
    }

    public void setGetColorPetalos(String getColorPetalos) {
        this.getColorPetalos = getColorPetalos;
    }

    public String getVariedadFLor() {
        return variedadFLor;
    }

    public void setVariedadFLor(String variedadFLor) {
        this.variedadFLor = variedadFLor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    @Override
    protected void saludo() {
        System.out.println("Hola soy una flor");
    }
}
