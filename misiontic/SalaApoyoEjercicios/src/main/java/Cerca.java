/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerca;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Cerca {

    public static double enMadera(double n, double m, double w, double p){
        return (2 * n + 2 * m) * w * p;
    }
    public static double enAlambre(double n, double m, double h, double a){
        return (2 * n + 2 * m) * h * a;
    }
    public static String usar(double n, double m, double h, double a,
        double w, double p) {
        if (enMadera(n, m, w, p) <= enAlambre(n, m, h, a)) {
            return "Madera";
        } else {
            return "Alambre";
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Largo terreno?");
        double n = Double.parseDouble(sc.nextLine());
        System.out.println("Ancho del terreno");
        double m = Double.parseDouble(sc.nextLine());
        System.out.println("Costo metro alambre?");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Hilos de alambre?");
        double h = Double.parseDouble(sc.nextLine());
        System.out.println("Costo metro madera?");
        double p = Double.parseDouble(sc.nextLine());
        System.out.println("Hileras de madera?");
        double w = Double.parseDouble(sc.nextLine());
        System.out.println("Usar " + usar(n, m, a, h, p, w));
    }
    
}
