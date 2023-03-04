/*ENUNCIADO
En la última edición de la revista científica ”ADN al día” se indica que las
pruebas de relación entre individuos a partir de código genético se define
de la siguiente manera: Si las dos cadenas se diferencian en menos de p letras,
existe una relación de padre-hijo, si se diferencian en menos de f > p letras,
existe una relación de formar parte de la misma familia.
De otra manera no existe relación. El laboratorio Tein Cul Pan, le pide
desarrollar un programa que a partir de dos cadenas de ADN del mismo tamaño,
determine si existe una relación pader-hijo, de la misma familia o ninguna,
siguiendo las reglas definidas por la revista científica ”ADN al día”.
*/

/*ENTENDIENDO EL PROBLEMA
Entradas: Dos cadenas de carácteres (representando cadenas de ADN) a y b de la misma longitud.
Los límites p, f para considerar una relación ’Padre-Hijo’, ’Familiar’ o ’Ninguna’ Salida:
Un texto indicando si las cadenas tienen una relacion ’Padre-Hijo’, ’Familiar’ o ’Ninguna’.
Relaciones: Si las dos cadenas a, b se diferencian en menos de p letras,
existe una relación de ’Padre-Hijo, si se diferencian en menos de f > p letras,
existe una relación de ’Familia’. En otro caso tienen ’Ninguna’ relación.
*/

/*ESPECIFICACION DEL PROBLEMA
             a −1
dif (a, b) = ∑ 1ifa i ≠ b i
             i=0


                        ⎧ ’Padre-Hijo’  if dif(a, b) ≤ p
relacion (a, b, p, f) = ⎨ ’Familiar’    ifp < dif(a, b) ≤ f
                          ’Ninguna’     en otro caso
*/

package Repaso1;

import java.util.Scanner;

public class PruebaADN {
    
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
        }else if(d <= f){
            return "Familia";
        }else{
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
