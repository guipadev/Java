/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promocion;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Promocion {

    
    public static String comprar(double p1, double p2, double p3, double pc){
        if(pc <= p1 + p2 + p3){
            return "en Combo";
        }else{
            return "por separado";
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        double d = Double.parseDouble(sc.nextLine());
        System.out.println("Comprar " + comprar(a, b, c, d));



    }
    
}
