/*ENUNCIADO
Un campesino de la región le pide crear un programa de computador que
le permita determinar cual de dos opciones (madera o alambre) es la mejor
opción (menor costo) para encerrar un terreno rectangular de n ∗ m metros
cuadrados, sabiendo el costo de un metro lineal de alambre, el costo de un
metro de madera y la cantdad de hilos de alambre o hileras de madera. 
El campesino solo piensa en usar una de las dos opciones, no las piensa combinar
*/

/*ENTENDIENDO EL PROBLEMA
Entradas: Los dos lados del rectángulo n y m. El costo de un metro lineal
de alambre a, el costo de un metro lineal de madera p, el número de hilos
de alambre si se hace el cercado en alambre h y el número de hileras de
madera w si se hace el cercado en madera. Salida: Un texto indicando si
se debe cercar en madera o si se debe cercar en alambre. Relaciones: El
perímetro del rectángulo es 2n + 2m. Una cerca en madera usará
(2n + 2m) ∗ w metros lineales de madera. Una cerca de alambre usará
(2n + 2m) ∗ h metros lineales de alambre. De esta manera el costo de usar
alambre será (2n + 2m) ∗ h ∗ a y el de usar madera será (2n + 2m) ∗ w ∗ p.
Si el costo de usar madera es menor o igual que el de alambre se debe
imprimir ”Madera” en otro caso se debe imprimir ”Alambre”.
*/

/*ESPECIFICAR EL PROBLEMA
enMadera (n, m, w, p) = (2n + 2m) ∗ w ∗ p
enAlambre (n, m, h, a) = (2n + 2m) ∗ h ∗ a

usar (n, m, h, a, w, p) =   ’Madera’ if enM adera(n, m, w, p) ≤ enAlambre(n, m, h, a)
                            ’Alambre’ en otro caso
*/

package Repaso01;

import java.util.Scanner;

public class La_Cerca {

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
            }else {
                return "Alambre";
            }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Largo terreno?");
        double largoTerreno = Double.parseDouble(sc.nextLine());
        System.out.println("Ancho del terreno");
        double anchoTerreno = Double.parseDouble(sc.nextLine());
        System.out.println("Costo metro alambre?");
        double costoMtsAlambre = Double.parseDouble(sc.nextLine());
        System.out.println("Hilos de alambre?");
        double hilosAlambre = Double.parseDouble(sc.nextLine());
        System.out.println("Costo metro madera?");
        double costoMtsMadera = Double.parseDouble(sc.nextLine());
        System.out.println("Hileras de madera?");
        double hilerasMadera = Double.parseDouble(sc.nextLine());
        System.out.println("Usar " + usar(largoTerreno, anchoTerreno, costoMtsAlambre, hilosAlambre, costoMtsMadera, hilerasMadera));
    }
    
}
