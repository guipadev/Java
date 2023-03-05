/*
Diseñe un programa que muestre las tablas de multiplicar del 1 al 9
*/
package $05_For;

import java.util.Scanner;
public class Problema7tablaMultiplicar {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese tabla inicial: ");

        int numTablaInicial = teclado.nextInt();

        System.out.print("Ingrese tabla final: ");

        int numTablaFinal = teclado.nextInt();

        tablasMultiplicar(numTablaInicial, numTablaFinal);
    }
    
    public static int tablasMultiplicar(int tablaIni, int tablaFin){
        
        for(int i = tablaIni; i <= tablaFin; i++){

            System.out.println("--- TABLA DEL " + i + " --- ");

            for(int j = 1; j <= 10; j++){
                System.out.println(i + " X " + j + " = " + (i * j));
            }

            System.out.println();
        }
        return 0;
    }
       
    
}
