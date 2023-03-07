package $10_Herencia_Polimorfismo.ElectroExam.Electrodomestico;

//Extendemos desde electrodomestico y lavadora
//Pero solo podemos trabjar con los constructores del padre osea Lavadora

import $10_Herencia_Polimorfismo.ElectroExam.Electrodomestico.Lavadora;

public class LavadoraSecadora extends Lavadora {
    
    private double temperatura;
    private boolean gasNatural;
    
    public LavadoraSecadora(){
        super(); //adquiere datos del constructor clase Lavadora/Electrodomestico
        temperatura = 0.0;
        gasNatural = true;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isGasNatural() {
        return gasNatural;
    }

    public void setGasNatural(boolean gasNatural) {
        this.gasNatural = gasNatural;
    }
}
