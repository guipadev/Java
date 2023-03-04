package Herencia_Multiple;

public class ColorTriangulo extends Triangulo {

    private String color;
    ColorTriangulo(String c, String s, double b, double h){
        super(c,b,h);
        color=c;
    }
    String getColor(){
        return color;
    }

    void mostrarColor(){
        System.out.println("El color es: "+color);
    }

}
