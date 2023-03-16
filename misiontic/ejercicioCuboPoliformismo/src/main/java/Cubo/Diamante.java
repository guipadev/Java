
package Cubo;

//Clase hija
public class Diamante extends Cubo {
    private int xp;
    
    //Aqui se esta realizando polimorfismo
    public void destruir() {
        System.out.println("Uy me rompi, ten un diamante");
    }
    
    public static void main(String[] args) {
        
        Cubo diamantito = new Diamante();
        
        diamantito.destruir();
    }
}
