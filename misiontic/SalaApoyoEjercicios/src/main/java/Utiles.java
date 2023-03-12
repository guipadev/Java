/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class Utiles {

    public static double costo(double[] precio, int[] cantidad){
        double costo = 0;
        for (int i = 0; i < precio.length; i++) {
            costo = costo + precio[i]*cantidad[i];
        }
        return costo;
    }
    /**
     * @param args the command line arguments
     */
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
