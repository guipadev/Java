/*
Si pido prestados P cantidad de pesos para pagarlos en dos meses, si
el interés del préstamo es del 3%. ¿Cuánto se debe pagar al final del
segundo mes si el interés es compuesto mensualmente?.
 */
package $03_Funciones_Condicionales;

import java.util.Scanner;

public class Problema3 {
    
    public static int interes(int meses, double monto){
        int intereses = (int) (monto * (meses * 0.02));
        int totalPrestamo = (int) (monto + intereses);
        return totalPrestamo;
    }
    
    public static void main(String[] args){
        
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese Nro Meses : ");
        int mes = Integer.parseInt(ingreso.next());

        System.out.print("Ingrese Monto : ");
        int monto = Integer.parseInt(ingreso.next());

        System.out.println("TOTAL A PAGAR : " + interes(mes, monto));
    }
}
