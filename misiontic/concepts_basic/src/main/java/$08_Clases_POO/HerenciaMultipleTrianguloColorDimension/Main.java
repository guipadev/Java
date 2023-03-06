package $08_Clases_POO.HerenciaMultipleTrianguloColorDimension;

public class Main {

    public static void main(String[] args) {

        ColorTriangulo t1= new ColorTriangulo("Azul","Estilo x", 8.0,12.0);

        ColorTriangulo t2= new ColorTriangulo("Rojo","Estilo y", 4.0,3.0);

        System.out.println("Información para t1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        t1.mostrarColor();

        System.out.println("El área es: " + t1.area());

        System.out.println("==============================================");

        System.out.println("Información para t2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        t2.mostrarColor();

        System.out.println("El área es: " + t2.area());
    }
}
