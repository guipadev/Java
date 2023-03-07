package $10_Herencia_Polimorfismo.ElectroExam.PC;

import $10_Herencia_Polimorfismo.ElectroExam.PC.Portatil;

public class PortatilPc extends Portatil {

    @Override
    public void conectarWifi() {
        System.err.println("Soy un PC marca X y me conecté al WIFI");
    }
    

}
