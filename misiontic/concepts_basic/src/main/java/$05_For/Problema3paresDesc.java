/*
Imprimir los números pares en forma descendente hasta 2 que son menores o iguales a un número
natural n ≥ 2 dado
*/
package $05_For;
public class Problema3paresDesc {
    public static void main(String[] args) {
        int j;

        for (j = 12; j >= 2; j -= 2) {
            System.out.println(j);
        }
    }
}
