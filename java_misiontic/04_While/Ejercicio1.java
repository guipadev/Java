/*
Imprimir un listado con los números del 1 al 100 cada uno con su
respectivo cuadrado.
 */
package EstructurasCiclicas;

public class Ejercicio1 {
    
    public static void main(String[] args) {
    int i = 0; 
    while (i < 100){
      i++;
      System.out.println(i +" y su cuadrado " + (i*i)); 
    }
  } 
}

/*
//Opcion con FOR
class Problema1 {
  public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int n, i, j;
    System.out.println("Ingrese cantidad # a evaluar");
    n = leer.nextInt();
    for(i=0; i<=n; i++)
      System.out.println(i + " su cuadrado es "+(i*i)+".");
  }
}
*/
