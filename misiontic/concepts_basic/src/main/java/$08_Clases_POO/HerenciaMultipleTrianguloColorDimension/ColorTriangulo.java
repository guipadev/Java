package $08_Clases_POO.HerenciaMultipleTrianguloColorDimension;;

public class ColorTriangulo extends Triangulo {

    private String color;
    ColorTriangulo(String colore, String style, double base, double heigh){
        super(colore, base, heigh);
        color = colore;
    }
    String getColor(){ return color; }

    void mostrarColor(){
        System.out.println("El color es: " + color);
    }

}
