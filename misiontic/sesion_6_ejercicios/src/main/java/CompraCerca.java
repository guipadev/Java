/*
 Un campesino de la región le pide crear un programa de computador que
le permita determinar cual de dos opciones (madera o alambre) es la mejor
opción (menor costo) para encerrar un terreno rectangular de n ∗ m metros
cuadrados, sabiendo el costo de un metro lineal de alambre, el costo de un
metro de madera y la cantdad de hilos de alambre o hileras de madera. El
campesino solo piensa en usar una de las dos opciones, no las piensa combinar
 */

import java.util.Scanner;
public class CompraCerca {
    
    public static double enMadera(double n, double m, double w, double p){
        return (2 * n + 2 * m) * w * p;
    }

    public static double enAlambre(double n, double m, double h, double a){
        return (2 * n + 2 * m) * h * a;
    }

    public static String usar(double n, double m, double h, double a, double w, double p) {
        return (enMadera(n, m, w, p) <= enAlambre(n, m, h, a)) ? "Madera" :  "Alambre";
        /*
        if (enMadera(n, m, w, p) <= enAlambre(n, m, h, a)) {
            return "Madera";
        } else {
            return "Alambre";
        }
         */
    }
    
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
