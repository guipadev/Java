package com.pildo._11interfaces;


public class Jefatura extends Empleado implements Jefes {

    private double incentivo;

    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        super(nom, sue, agno, mes, dia);
    }

    public void estableceIncentivo(double b) {
        incentivo = b;
    }

    public double dameSueldo() {
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }

    @Override
    public String tomarDecisiones(String decision) {
        return "Un miembro de dirección ha tomado la decisión de: " + decision;
    }

    @Override
    public double estableceBonus(double gratificacion) {

        double prima = 2000;

        return Trabajadores.bonusBase + gratificacion + prima;
    }
}