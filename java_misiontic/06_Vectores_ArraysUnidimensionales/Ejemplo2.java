/*
Un programa completo en Java que permite calcular el cubo de las componentes 
de un arreglo obtenido a partir del archivo presentado anteriormente es:
*/
package Vectores_arreglosUunidimensionales;

import java.util.Scanner;

public class Ejemplo2 {
   
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

    public static int[] cuboComponentesArreglo(int[] x, int n) {
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = x[i] * x[i] * x[i];
        }
        return y;
    }

    public static void main(String[] args) {
        //Crear/Leer arreglo
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        n = sc.nextInt();
        int[] x = new int[n];

        //Escribir arreglo
        System.out.println("Digite datos del arreglo, separa con espacio o enter:");
        x = leerArregloInt(sc, x);
        int[] y = cuboComponentesArreglo(x, n);
        System.out.println("El arreglo elevado al cubo es:");
        escribirArregloInt(y, n);
    }
    
}
