package Arreglo;

import java.util.Scanner;

class Ejemplo1 {

    //En Java para leer un arreglo de tipo entero se utiliza la siguiente función
    public static int[] leerArregloInt(Scanner sc,
                                       int[] x, int n) {
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.nextLine());
        }
        return x;
    }

//Otra opción para leer todos los elementos de un arreglo en Java puede ser
//utilizar la propiedad de tamaño del arreglo incluida en la definición de
//arreglos de Java. El tamaño de un arreglo x dado en Java puede obtenerse
//mediante la instrucción x.length.

    public static int[] leerArregloInt(Scanner sc, int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(sc.nextLine());
        }
        return x;
    }

    //En Java para escribir un arreglo de tipo entero se utiliza el siguiente procedimiento
    public static void escribirArregloInt(int[] x, int n){
        for(int i = 0; i < n; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    //Se podría utilizar también el siguiente procedimiento
    public static void escribirArregloInt2(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
