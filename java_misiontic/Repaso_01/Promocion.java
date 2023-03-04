/*ENUNCIADO
 Al ver los precios y los anuncios del almacén Cobra Mosmas, un cliente le
 pide crear un programa de computador que le permita ingresar el precio
 individual de tres productos y el precio de la promoción en combo de los
 tres productos anunciada por el almacen y determine si es preferible
 comprarlos por separado o en el combo promoción. 
 */

/*ENTENDIENDO EL PROBLEMA
Entradas: Los precios p1, p2, p3 de tres productos y del combo pc. Salida:
Un texto indicando si se debe comprar el combo o los tres productos por
separado. Relaciones: Si el precio del combo pc es menor o igual que la
suma de los precios de los tres productos se debe imprimir ”Combo” en
otro caso se debe imprimir ”Por separado”.
 */

/*ESPECIFICANDO EL PROBLEMA
comprar (p1, p2, p3, pc) = {
                            ’Combo’             if pc ≤ p1 + p2 + p3
                            ’Por separado’      en otro caso
*/

package Repaso1;

import java.util.Scanner;

public class Promocion {
    
    public static String comprar(double product1, double product2, double product3, double prodCombo){
            if(prodCombo <= product1 + product2 + product3){
                return "en Combo";
            }else{
                return "por separado";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese valor del producto 1: ");
        double productA = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese valor del producto 2: ");
        double productB = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese valor del producto 3: ");
        double productC = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese valor del combo de productos: ");
        double combo = Double.parseDouble(sc.nextLine());
        System.out.println("Te sugerimos comprar " + comprar(productA, productB, productC, combo));
    }

}
