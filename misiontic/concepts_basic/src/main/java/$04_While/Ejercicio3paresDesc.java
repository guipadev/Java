/*
Imprimir los números pares en forma descendente hasta 2 que son
menores o iguales a un número natural n ≥ 2 dado.
 */
package $04_While;

public class Ejercicio3paresDesc {
    public static void main(String[] args) {
        int i, n = 99;
        for (i = n; i >= 2; i -= 2) {
            System.out.println(+i);
        }
    }
    
}
