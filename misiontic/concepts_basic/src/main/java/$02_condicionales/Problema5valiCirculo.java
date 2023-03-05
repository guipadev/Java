/*
Dado el centro y el radio de un círculo, determinar si un punto de R 2
pertenece o no al interior del círculo.
 */
package $02_condicionales;

import java.util.Scanner;

public class Problema5valiCirculo {
    
    Scanner lector = new Scanner(System.in);

    public static void main(String[] args){

        Problema5valiCirculo solucion = new Problema5valiCirculo();
    }
    public Problema5valiCirculo(){
        
        double radio, area, longitud;
        
        System.out.println("Ingrese radio cirulo");
        radio = lector.nextDouble();
        
        area = Math.PI * radio;
        longitud = 2 * Math.PI * radio;
        
        System.out.println("El cirulo es: "+ area);
        System.out.println("Longitud circunferencia es: "+ longitud);   
    }
    
}
