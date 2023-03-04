/*
 Existe una función especial en Java y es la función main(). Es el estándar
de la JVM para iniciar la ejecución de cualquier programa, y es donde
empieza a correr todo el proyecto
*/
package FuncionesyCondicionales;

// En esta parte se importan las librerias
import java.util.Scanner;

public class Estructura {
//En esta parte se pueden crear otras funciones

    //Cuadrado de un numero
    public static double hallarCuadrado(double number) {
        return number * number;
    }

    public static double hallarCuadrado2(double number) {
        double y = Math.pow(number, 2);
        return y;
    }

    //Funciones con varios parámetros
    public static double suma(double x, double y) {
        return x + y;
    }

    //Funcion área de un rectangulo
    public static double area_rectangulo(double l, double a) {
        return l * a;
    }

    //Otra posible escritura de la función puede ser
    public static double area_rectangulo2(double l, double a) {
        double area = l * a;
        return area;
    }

    public static void main(String[] args) {
        //En esta parte se realiza la lectura de los datos y el llamado a las funciones
        System.out.println(hallarCuadrado2(2));
        //Ejecutamos la funcion cuadrado
        System.out.println(hallarCuadrado(2));

        //Ejecucion funcion suma
        System.out.println(suma(2, 5));

        //Ejecutamos funcion area
        System.out.println(area_rectangulo(3, 4));

        //Ejecutamos funcion area2 por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado:");
        int l = sc.nextInt();
        System.out.println("Ingrese el ancho:");
        int a = sc.nextInt();
        System.out.println("Area: " + area_rectangulo2(l, a));
    }
}
