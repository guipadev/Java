/*
Diseñe una función que calcule la cantidad de carne de aves en kilos
si se tienen N gallinas, M gallos y K pollitos cada uno pesando 6
kilos, 7 kilos y 1 kilo respectivamente
*/

import java.util.Scanner;

public class CarneAves {
    
    public static int kilos(int Ngallinas, int Mgallos, int Kpollitos){
    
        Ngallinas *= 6;
        Mgallos *= 7;
        Kpollitos *= 1;
        return Ngallinas + Mgallos + Kpollitos;
    }  
        
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad gallinas");
        int NG = sc.nextInt();
        System.out.println("Ingrese cantidad gallos");
        int MG = sc.nextInt();
        System.out.println("Ingrese cantidad pollitos");
        int KP = sc.nextInt();
       
        System.out.println("La cantidad de kilos de carne son: "+ kilos(NG, MG, KP) + " Kilos");
    }
}
