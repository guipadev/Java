/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        String str1 = "abc";
        char a=str1.charAt(1);
        System.out.println(str1.substring(0, str1.length()));
        
        if("abc".contains(str2)){
            System.out.println("Si la contiene y el tamaño es: " +a+ str2.length());
        }else{
            System.out.println("No la contiene");
        }
    }
    
}
