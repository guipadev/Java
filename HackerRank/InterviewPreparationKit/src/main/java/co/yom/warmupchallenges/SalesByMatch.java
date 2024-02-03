package co.yom.warmupchallenges;

import java.util.ArrayList;
import java.util.List;

/*
There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example
n = 7
ar = [1,2,1,2,1,3,2]

There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

Function Description
Complete the sockMerchant function in the editor below.
sockMerchant has the following parameter(s):
- int n: the number of socks in the pile
- int ar[n]: the colors of each sock

Returns
- int: the number of pairs

Input Format
The first line contains an integer , the number of socks represented in ar.
The second line contains  space-separated integers, ar[i], the colors of the socks in the pile.

Constraints
- 1 <= n <= 100
- 1 <= ar[i] <= 100 where 0 <= i < n

Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

Sample Output
3

*/

public class SalesByMatch {
 
    public static void main(String[] args) {
        int n = 9;
        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

        System.out.println(sockMerchant(n, ar));
        
    }
    
    public static int sockMerchant(int n, List<Integer> ar) {
      
        List<Integer> arreglo = new ArrayList<>(ar);
        
        int pares = 0;

        for (int i = 0; i < arreglo.size(); i++) {
            int elementoActual = arreglo.get(i);

            for (int j = i + 1; j < arreglo.size(); j++) {
                int elementoSiguiente = arreglo.get(j);

                if (elementoActual == elementoSiguiente) {
                    pares++;
                    arreglo.remove(j);
                    arreglo.remove(i); // Eliminamos el par actual
                    i--; // Ajustamos el índice después de la eliminación
                    break;
                }
            }
        }
        return pares;
    
    }
}
