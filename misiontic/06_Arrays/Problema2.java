package Arreglo;

/*
Modele mediante una función matemática y desarrolle un algoritmo
con ciclos en Java que calcule el mínimo de un vector de números
reales.
*/

import java.util.Scanner;

public class Problema2 {

    public static int[] leerArregloInt(Scanner sc, int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        return x;
    }

    public static void escribirArregloInt(int[] x, int n) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static int[] calculoMin(int[] x) {
        int max, min;
        max = min = x[0];

        for (int i = 0; i < x.length; i++) {

            if (x[i] < min) {
                min = x[i];
            }
        }
        return new int[]{min};
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el tamaño arreglo:");
        n = sc.nextInt();
        int[] x = new int[n];

        System.out.println("Digite los datos del arreglo: ");
        x = leerArregloInt(sc, x);
        int[] y = calculoMin(x);

        System.out.println("El numero minimo es: ");
        escribirArregloInt(y, n);
    }
}

/*DESARROLLO COMPROBADO FUNCIONAMIENTO SIN USAR FUNCION
* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int max, min;
        System.out.println("Ingresa el tamaño # de tu arreglo: ");
        int num = sc.nextInt();
        int [] vectorNumReal = new int[num];
        max = min = vectorNumReal[0];

        // lectura de datos y llenar el array
        System.out.println("Ingresemos la cantidad de "+num+" # a calcular: ");
        for (i = 0; i < vectorNumReal.length; i++) {
            System.out.print("# "+i+" :");
            vectorNumReal[i] = sc.nextInt();

            if(vectorNumReal[i] > max){
                max = vectorNumReal[i];
            }

            if(vectorNumReal[i] < min){
                min = vectorNumReal[i];
            }
        }

        System.out.println("El valor max del vector: "+max);
        System.out.println("El valor min del vector: "+min);

    }
*
* */