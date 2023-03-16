package Cubo;

//Clase Padre
public abstract class Cubo {
    protected int dimension;
    protected String nombre;
    protected String textura;
    
    public void destruir(){
        System.out.println("Uy me rompi, pero no se que hacer xq no tengo identidad");
    }
}
