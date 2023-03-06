package $08_Clases_POO.HerenciaMultipleTrianguloColorDimension;;
public class Triangulo extends DosDimensiones{
    private String estilo;

    //Constructor por defecto
    Triangulo(){
        super();
        estilo = "ninguno";
    }
    Triangulo(String style, double base, double haltura){
        // Llama al constuctor de la superclase
        super(base, haltura);
        estilo = style;
    }
    // Constructor con un argumento
    Triangulo(double x){
        // Llama al constuctor de la superclase
        super(x);
        estilo = "Estilo 1";
    }
    double area(){
        return getAltura() * getBase() / 2;
    }
    void mostrarEstilo(){
        System.out.println("El triángulo tiene: " + estilo);
    }

}
