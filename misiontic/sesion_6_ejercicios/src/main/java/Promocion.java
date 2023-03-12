/*
Al ver los precios y los anuncios del almacén Cobra Mosmas, un cliente le
pide crear un programa de computador que le permita ingresar el precio
individual de tres productos y el precio de la promoción en combo de los
tres productos anunciada por el almacen y determine si es preferible
comprarlos por separado o en el combo promoción.
 */

import java.util.Scanner;

public class Promocion {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double productOne = Double.parseDouble(sc.nextLine());
        double productTwo = Double.parseDouble(sc.nextLine());
        double productTree = Double.parseDouble(sc.nextLine());
        double comboProducts = Double.parseDouble(sc.nextLine());

        System.out.println("Comprar " + comprar(productOne, productTwo, productTree, comboProducts));
    }

    public static String comprar(double product1, double product2, double product3, double productCombo){
        return (productCombo <= product1 + product2 + product3) ? "en Combo" : "por separado";
        /*
        if(productCombo <= product1 + product2 + product3){
                return "en Combo";
            }else{
                return "por separado";
            }
        */
    }
    
}
