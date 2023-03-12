/*
Hacer un algoritmo que calcule el máximo común divisor para un
arreglo de enteros positivos.

Example
arreglo: [12, 20, 14, 124, 72, 2458].

m.c.d del arreglo: 2.
*/

import java.util.Arrays;
public class Problem2CalculoMaxDivisorArray {

    public static void main(String[] args) {

        int[] numeros={12, 20, 14, 124, 72, 2458};

        System.out.println("Lista de numeros:"+Arrays.toString(numeros));
        System.out.println("Máximo cómun divisor: "+minComunDivisor(numeros));
    }

    static int minComunDivisor(int[] lista){
        int i, menor;
        boolean no_es_mcd = false, probar_siguiente = true;

        //Primero obtengo el menor número del array porque empezaremos
        //a probar a dividir por él hacia abajo
        menor=lista[0];
        for (i = 1; i < lista.length; i++){
            if (lista[i] < menor){
                menor=lista[i];
            }
        }
        //Ya tengo en la variable "menor" el menor número del array

        while (probar_siguiente==true){
            //comprobar si "menor" es divisible por todos los números del array
            for (i=0;i < lista.length && no_es_mcd==false;i++){
                if (lista[i]%menor!=0)
                    no_es_mcd=true;
            }
            //Si no lo es, se probara con el siguiente número, que será menor-1
            if (no_es_mcd){
                menor--;
                no_es_mcd=false;
            }
            else{
                //si todos los números son divisible por menor,
                //saldra del bucle while debido a se encontro el mcd
                probar_siguiente=false;
            }
        }

        return menor;
    }
}
