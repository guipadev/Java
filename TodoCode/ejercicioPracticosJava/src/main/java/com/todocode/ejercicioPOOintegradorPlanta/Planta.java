package com.todocode.ejercicioPOOintegradorPlanta;

public abstract class Planta {
    private String nombre;
    private int altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;


    public Planta() {
    }
    public Planta(String nombre, int altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(int altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    protected abstract void saludo();
}