/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package $04_While;

public class MinimoMaquina {
    
    public static double min_maquina() {
        double Xo = 1.0;
        double Xi = Xo / 2;
        while (Xi > 0.0) {
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        return Xo;
    }
    
    public static void main(String [] arg){
        
        System.out.println(min_maquina());
    }
}
