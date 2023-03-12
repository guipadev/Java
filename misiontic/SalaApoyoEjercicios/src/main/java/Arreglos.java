/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Arreglos {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int n =1000;
        double arreglo[]=new double[n];
        double []arreglo2 = {0.1,0.2,0.3,0.4,0.5};
        System.out.println(arreglo2.length);
        
        //i++ es lo mismo que i+=1
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=0.0;
        }
        
        //para imprimir
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }
        
        //para asignar
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=i*i;
        }
        System.out.println("");
        //para imprimir
        for (int i = 0; i <= arreglo.length -1; i+=1) {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
        //System.out.println(Arrays.toString(arreglo));
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i <= arreglo2.length -1; i+=1) {
            arreglo[i]=Double.parseDouble(sc.nextLine());
        
        }
    }
}
