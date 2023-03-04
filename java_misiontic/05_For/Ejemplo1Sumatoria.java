/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraFor;

/**
 *
 * @author yamid
 */
public class Ejemplo1Sumatoria {
    
    public static int suma(int n) {
    int s = 0;
    for (int i = 1; i <= n; i++){
      s = s + i;
    }
    return s;
  }

  public static void main(String[] args) {
    System.out.println(suma(10));
  }
    
}
