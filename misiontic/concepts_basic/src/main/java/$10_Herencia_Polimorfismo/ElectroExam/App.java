package $10_Herencia_Polimorfismo.ElectroExam;

import $10_Herencia_Polimorfismo.ElectroExam.Electrodomestico.Electrodomestico;
import $10_Herencia_Polimorfismo.ElectroExam.Electrodomestico.Nevera;
import $10_Herencia_Polimorfismo.ElectroExam.PC.PortatilMac;
import $10_Herencia_Polimorfismo.ElectroExam.PC.PortatilPc;

public class App {
    
    public static void main(String[] args) {
        
        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico("Samgung");
        Electrodomestico e3 = new Electrodomestico(3000.0, "Haceb", 60.0);
        
        Nevera nevera1 = new Nevera();
        Nevera nevera2 = new Nevera("Panasonic", 300.0);
        
        //Invocar el compartamiento heredado
        nevera1.encender();//imprime comportamiento cambiado de nevera
        nevera1.apagar();//imprime comportamiento heredado directamente
        nevera1.encender("Bencho");
        
        System.out.println("****** Comprobando informacion de nevera *****");
        System.out.println(nevera1.getMarca());  //se obtiene la marca de padre
        System.out.println(nevera1.getLitros());
        System.out.println(nevera1.isDispensadorHielo());
        
        System.out.println("****** Ejemplo uso Getters y Setter *****");
        System.out.println(nevera2.getMarca());
        nevera2.setMarca("Toshiba");
        System.out.println(nevera2.getMarca());
        
        System.out.println("******** INFORMACIÓN COMPUTADORES INTERFACE CON EXTENDS **********");
        
        PortatilMac pMac = new PortatilMac();
        PortatilPc pPc = new PortatilPc();
        
        pMac.encender();
        pMac.conectarWifi();
        
        pPc.encender();
        pPc.conectarWifi();
    }
}
