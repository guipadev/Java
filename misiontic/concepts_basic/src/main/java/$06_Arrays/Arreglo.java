package $06_Arrays;

import java.util.Scanner;
public class Arreglo {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo que deseas: ");

        int tamanoArreglo = sc.nextInt();

        double[] datos = new double[tamanoArreglo];

        System.out.println("Ingrese la cantidad de " + tamanoArreglo + " enteros al arreglo");

        for (int i = 0; i < tamanoArreglo; i++){
            datos[i] = sc.nextDouble();
        }

        double suma = 0.0;

        for (int i = 0; i < datos.length; i++){
            suma += datos[i];
        }

        double promedio = suma / datos.length;

        System.out.println("El promedio de los nùmeros es: " + promedio);
    }
}