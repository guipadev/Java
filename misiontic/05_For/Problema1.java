/*
Imprimir un listado con los números del 1 al 100 cada uno con su respectivo cuadrado
*/
package EstructuraFor;

/**
 *
 * @author yamid
 */
public class Problema1 {
    
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1, j = 1; i <= num; i++, j++) {
            System.out.println("# " + i + ", cuadrado: " + j * 2);
        }
    }
    
}
