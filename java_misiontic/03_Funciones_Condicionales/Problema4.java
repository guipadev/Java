/*
El número de contagiados de Covid-19 en el país de NuncaLandia se
duplica cada día. Hacer un programa que diga el número total de
personas que se han contagiado cuando pasen D días a partir de hoy,
si el número de contagiados actuales es C.
 */
package FuncionesyCondicionales;

import java.util.Scanner;

public class Problema4 {
    
    public static int calculoContagio(int numeroDias, int numeroContagioActual){
        
        int totalContagios = (numeroContagioActual + numeroDias * 2);
        return totalContagios;
    }
    
    public static void main(String[] args){
        
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese Nro contagios actuales: ");
        int numeroContagioActual = ingreso.nextInt();
        System.out.print("Ingrese numero de días a proyectar contagios: ");
        int numeroDias = ingreso.nextInt();
        System.out.println("Total de contagios en: " + numeroDias + " días, se proyecta en " + calculoContagio(numeroDias, numeroContagioActual));
    }
    
}
