package $06_Arrays;

/*
Programa Java que lea 10 números enteros por teclado y los guarde en un array.
Calcula y muestra la media de los números que estén en las posiciones pares del array.

Considera la primera posición del array (posición 0) como par.
*/
import java.util.Scanner;

class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        int[] numeros = new int[10];

        double media = 0;

        //lectura de datos y llenar el array
        System.out.println("Ingresa 10 numeros en el array: ");

        for (i = 0; i < 10; i++) {
            System.out.print("numero[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }

        //Recorrer el array y calcular la media
        for (i = 0; i < 10; i++) {

            if (i % 2 == 0){ //si la posición actual es par
                media = media + numeros[i]; //suma vr. de esa posición
            }
        }
        //Calcular y mostrar la media
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);
    }
}
