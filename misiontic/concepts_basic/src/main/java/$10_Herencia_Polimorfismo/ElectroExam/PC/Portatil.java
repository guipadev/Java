package $10_Herencia_Polimorfismo.ElectroExam.PC;

// se imprementas las funciones del interface en este caso Computador
// clase es abstract porque hay un metodo de ese tipo en la clase
// la clase abstract tampoco puede ser instanciada, ya que hay metodos por definir
// para definirlo se haria en otro clase, ejemplo class PortatilMac

public abstract class Portatil implements Computador {
    
    @Override
    public void encender(){
        System.out.println("El portatil encendio");
    };
    
    @Override
    public void apagar(){
        System.out.println("El portatil se apago");
    };
    
    @Override
    public void calcular(){
        System.out.println("Se ha realizado un calculo");
    };
    
    @Override
    //Metodo ABSTRATO que la clase no pone la implementacion, porque no sabemos como hacerlo
    //Al ver este metodo la clase sera abtract
    public abstract void conectarWifi();

}
