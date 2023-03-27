package com.curso.solucionejerciciosjava.movimientodevaloresenvector;

public class App {

    /*
    MOVIMIENTO DE VALORES EN UN VECTOR
    ------------------------------------------
    0   1   2   3   4   5   6   7   8   9   10
    ------------------------------------------
    6   16  45  55  93  103 31  41  14  24  73
    ==========================================
    16  45  55  93  103 31  41  14  24  73  6
    
    Teniendo un vector de N posiciones, vamos hacer una rotación total a la izquierda
    de los valores, por lo cual la posición 1 del vector pasa a posicion 0
    y la posicion 0 pasaria a la posición -1 pero eso indicaria un desbordamiento por lo cual
    lo que hacemos es colocar la posición 0 en la última posición
    */
    public static void main(String[] args) {
       
        System.out.println("-------- MOVIMIENTO DE VALORES EN UN VECTOR --------");
        
        int[] valores = new int[] {6,16,45,55,93,103,31,41,14,24,73};
        
        mostrarVector(valores);
        
        int temporal = valores[0];
        
        for (int i = 1; i < valores.length; i++) {
            valores[i - 1] = valores[i];
        }
        
        System.out.println("\n---- posición 1 vector cambiado a última posición ----");
        
        valores[valores.length-1] = temporal;
        
        mostrarVector(valores);
    }
    
    public static void mostrarVector(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + ",");
        }
    }
}
