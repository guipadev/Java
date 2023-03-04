/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasCiclicas;

import java.util.Scanner;

/**
 *
 * @author yamid
 */
public class DoWhile_Ejemplo2NOBreackSimplificado {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int dato = 1;
        int suma = 0;
        while (dato != 0){
            System.out.print("Ingrese un número entero ");
            System.out.println("a sumar o 0 para salir: ");
            dato = Integer.parseInt(sc.nextLine());
            suma += dato;
        } 
        System.out.println("La suma es: " + suma);
    }
}
