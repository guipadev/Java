/*ENUNCIADO
Unos padres de familia desesperados por determinar el dinero que deben
pedir prestado para pagar los útiles escolares de su hijo, le han pedido crear
un programa de computador que a partir de una lista de los precios de
cada útil escolar y de la cantidad de cada útil escolar en la lista, determine
el precio total de la lista.
*/

/*ENTENDIENDO EL PROBLEMA
Entradas: Una lista con los precios de los útiles (en la posición i de la lista
esta el precio del útil i), una lista con las cantidades de dichos útiles (en la
posición i esta la cantidad requerida del útil i). Salida: El costo total de la
lista. Relaciones: El costo total es la suma sobre todos los útiles del precio
del útil por la cantidad del mismo.
*/

/*ESPECIFICANDO EL PROBLEMA     precio −1
    costo (precio, cantidad) =  ∑ precio i ∗ cantidad i
                                i=0
*/

package Repaso1;

import java.util.Scanner;

public class UtilesEscolares {
    
    public static double costo(double[] precio, int[] cantidad){
        double costo = 0;
        for (int i = 0; i < precio.length; i++) {
            costo = costo + precio[i]*cantidad[i];
        }
        return costo;
    }
    
    public static void main(String[] args) {
        double[] precio = new double[100]; //se define un tamaño máximo
        int[] cantidad = new int[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true){
            System.out.println("Ingresar util? S/N:");
            if(!sc.nextLine().toUpperCase().equals("S")){
                break;
            }
            System.out.println("Precio util?");
            precio[i] = Double.parseDouble(sc.nextLine());
            System.out.println("Cantidad?");
            cantidad[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.println("La lista cuesta: " + costo(precio, cantidad));
    }


}
