package Herencia_Multiple;

//Extendiendo de DosDimensiones
//Triangulo.java

public class Triangulo extends DosDimensiones{

    private String estilo;
    //Constructor por defecto
    Triangulo(){
        super();
        estilo="ninguno";
    }
    Triangulo(String s, double b, double h){
        super(b,h);  //Llama al constuctor de la superclase
        estilo=s;
    }
    //Constructor con un argumento
    Triangulo(double x){
        super(x); //Llama al constuctor de la superclase
        estilo="Estilo 1";
    }
    double area(){
        return getAltura()*getBase()/2;
    }
    void mostrarEstilo(){
        System.out.println("El triángulo tiene: "+estilo);
    }

}
