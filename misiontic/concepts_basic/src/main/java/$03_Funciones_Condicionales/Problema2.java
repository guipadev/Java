/*
Mi mamá me manda a comprar P panes a $ 300 cada uno, M bolsas
de leche a $ 3300 cada una y H huevos a $ 350 cada uno. Hacer un
programa que me diga las vueltas (o lo que quedo debiendo) cuando
me da un billete de B pesos.
 */
package $03_Funciones_Condicionales;

import java.util.Scanner;

public class Problema2 {
    
    public static int vueltas(int cPanes, int cLeche, int cHuevos, int dinero) {
    int pan = 300; 
    int leche = 3300;
    int huevo = 350;
    int resultPan = pan * cPanes;
    int resultLeche = leche * cLeche; 
    int resultHuevo = huevo * cHuevos;
    int compra = resultPan + resultLeche + resultHuevo;
    int resultado = compra - dinero;
    
    if(compra > dinero){
      System.out.println("Te falta para la compra");
    }else if(dinero < compra){
      System.out.println("Tus devueltas son");
    }else{
      System.out.println("Cubres apenas la compra");
    }
    return resultado;
  }

  public static void main(String[] args) {
  //En esta parte se realiza la lectura de los datos y el llamado a las funciones
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantos panes quieres?:");
    int cPanes = sc.nextInt();
    System.out.println("Cuantas bolsas de leche quieres?:");
    int cLeche = sc.nextInt();
    System.out.println("Cuantos huevos quieres:");
    int cHuevos = sc.nextInt();
    System.out.println("Dinero que tienes para pagar:");
    int dinero = sc.nextInt();
    System.out.println(vueltas(cPanes, cLeche, cHuevos, dinero));
  }
}
