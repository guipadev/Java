/*
Hacer un algoritmo que deje al final de un arreglo de números enteros
todos los ceros que aparezcan en dicho arreglo

Example1
arreglo original: [1, 6, 0, 7, -3, 8, 0, -2, 11]
arreglo salida: [1, 6, 7, -3, 8, -2, 11, 0, 0]

Example2
arreglo original: [0, 11, 36, 10, 0, 17, -23, 81, 0, 0, 12, 11, 0]
arreglo salida: [11, 36, 10, 17, -23, 81, 12, 11, 0, 0, 0, 0, 0]
*/
public class Problem1ElimaNumCeroArrays {

    public static void main (String[] args){

        int [] arrayNumeros  = {0, 11, 36, 10, 0, 17, -23, 81, 0, 0, 12, 11, 0};
        int positionTemporal;

        for(int i = 1; i < arrayNumeros.length; i++){
            for (int j = 0; j < arrayNumeros.length-1; j++){
                if (arrayNumeros[j] == 0){
                    positionTemporal = arrayNumeros[j];
                    arrayNumeros[j] = arrayNumeros[j+1];
                    arrayNumeros[j+1] = positionTemporal;
                }
            }
        }
        for (int i = 0; i < arrayNumeros.length; i++)
        {
            System.out.println(arrayNumeros[i]);

        }
    }
}
