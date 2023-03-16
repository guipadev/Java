
package Cubo;

//Clase hija
public class Carbon extends Cubo {
    private int xp;
    
    //Aqui se esta realizando polimorfismo
    public void destruir(){
        System.out.println("Uy me rompi, ten un carbon");
    }
    
    public static void main(String[] args) {
        
        Cubo carboncito = new Carbon();
        
        carboncito.destruir();
    }
}
