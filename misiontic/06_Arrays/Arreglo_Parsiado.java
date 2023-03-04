package Arreglo;

import java.util.Scanner;

public class Arreglo_Parsiado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] arreglo = new String[n];

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = sc.nextLine();
        }
    }
}
