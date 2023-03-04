/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesyCondicionales;

import java.util.Scanner;

public class Problema1 {
    
    public static int carneAves(int gallinas, int gallos, int pollitos) {
    int nGallinas = 6; 
    int mGallos = 7;
    int kPollos = 1;
    int resultGallinas = nGallinas * gallinas;
    int resultGallos = mGallos * gallos; 
    int resulPollitos = kPollos * pollitos;
    return resultGallinas + resultGallos + resulPollitos;
  }

  public static void main(String[] args) {
  //En esta parte se realiza la lectura de los datos y el llamado a las funciones
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese cantidad gallinas:");
    int gallinas = sc.nextInt();
    System.out.println("Ingrese gallos:");
    int gallos = sc.nextInt();
    System.out.println("Ingrese pollitos:");
    int pollitos = sc.nextInt();
    System.out.println("La cantidad de kilos de carnes de las ave son: "+carneAves(gallinas, gallos, pollitos));
  }
}
