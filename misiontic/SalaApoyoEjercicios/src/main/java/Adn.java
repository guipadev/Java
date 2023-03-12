/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adn;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Adn {

    /**
     * @param args the command line arguments
     */
    public static int diferencia(String a, String b) {
        int cuenta = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                cuenta++;
            }
        }
        return cuenta;
    }
    
    public static String relacion(String a, String b, int p, int f) {
        int d = diferencia(a, b);
            if (d <= p) {
                return "Padre-Hijo";
            } else if (d <= f) {
                return "Familia";
            } else {
                return "Ninguna";
            }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Cadena ADN individuo 1?");
        String ind1 = sc.nextLine();
        System.out.println("Cadena ADN individuo 2?");
        String ind2 = sc.nextLine();
        System.out.println("Diferencia máxima para ser Padre-Hijo?");
        int p = Integer.parseInt(sc.nextLine());
        System.out.println("Diferencia máxima para ser Familia?");
        int f = Integer.parseInt(sc.nextLine());
        System.out.println("Relación " + relacion(ind1, ind2, p, f));
    }
    
}
