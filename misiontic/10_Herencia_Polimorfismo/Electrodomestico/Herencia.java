package HerenciayPolimorfismo.Electrodomestico;


public class Herencia {
    
    public static void main(String[] args) {
        
        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico("Samgung");
        Electrodomestico e3 = new Electrodomestico(3000.0, "Haceb", 60.0);
        
        Nevera n1 = new Nevera();
        Nevera n2 = new Nevera("Panasonic", 300.0);
        
        //Invocar el compartamiento heredado
        n1.encender();//imprime comportamiento cambiado de nevera
        n1.apagar();//imprime comportamiento heredado directamente
        n1.encender("Bencho");
        
        
        System.out.println("****** Comprbado informacion de nevera *****");
        System.out.println(n1.getMarca());  //se obtiene la marca de padre
        System.out.println(n1.getLitros());
        System.out.println(n1.isDispensadorHielo());
        
        System.out.println("****** Ejemplo uso Getters y Setter *****");
        System.out.println(n2.getMarca());
        n2.setMarca("Toshiba");
        System.out.println(n2.getMarca());
        
        
        
        System.out.println("******** INFORMACIÓN COMPUTADORES INTERFACE CON EXTENDS **********");
        
        PortatilMac pMac = new PortatilMac();
        PortatilPc pPc = new PortatilPc();
        
        pMac.encender();
        pMac.conectarWifi();
        
        pPc.encender();
        pPc.conectarWifi();
        
    }

}
