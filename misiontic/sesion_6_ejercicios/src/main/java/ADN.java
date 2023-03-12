/*
Entradas: Dos cadenas de carácteres (representando cadenas de ADN) a y
b de la misma longitud. Los límites p, f para considerar una relación
’Padre-Hijo’, ’Familiar’ o ’Ninguna’ Salida: Un texto indicando si las
cadenas tienen una relacion ’Padre-Hijo’, ’Familiar’ o ’Ninguna’.
Relaciones: Si las dos cadenas a, b se diferencian en menos de p letras,
existe una relación de ’Padre-Hijo, si se diferencian en menos de f > p
letras, existe una relación de ’Familia’. En otro caso tienen ’Ninguna’
relación.
 */
import java.util.Scanner;

public class ADN {
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
}
