package $10_Herencia_Polimorfismo.ElectroExam.Electrodomestico;

import $10_Herencia_Polimorfismo.ElectroExam.Electrodomestico.Electrodomestico;

public class Lavadora extends Electrodomestico {
    
    private double kilos;
    private double litros;
    private double tiempo;
    private boolean cargaFrontal;
    
    public Lavadora(){
        super();
        kilos = 0;
        litros = 0;
        tiempo = 0;
        cargaFrontal = true;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isCargaFrontal() {
        return cargaFrontal;
    }

    public void setCargaFrontal(boolean cargaFrontal) {
        this.cargaFrontal = cargaFrontal;
    }
    
    

}
