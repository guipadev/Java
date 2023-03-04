package Herencia_Multiple;

public class DosDimensiones {

    private double base;
    private double altura;

    //Constructor por defecto
    DosDimensiones(){
        base=altura=0.0;
    }

    //Parametrizando constructor
    DosDimensiones(double b, double h){
        base= b;
        altura= h;
    }

    //Construir objeto con misma base y altura
    DosDimensiones(double x){
        base=altura=x;
    }

    //Métodos de acceso para base y altura
    double getBase(){
        return base;
    }

    double getAltura(){
        return altura;
    }

    void setBase(double b){
        base=b;
    }

    void setAltura(double h){
        altura=h;
    }

    void mostrarDimension(){
        System.out.println("La base y la altura son: "+base+" y "+altura);
    }
}
