package com.company;

/***
- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
  Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

- Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
  el bloque de código que tendrá el bucle deberá:
  - Incrementar el valor de la variable en uno cada vez que se ejecute.
  - Mostrarlo por pantalla cada vez que se ejecute.

- Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute
  y deberá mostrarse por pantalla.

- Por último, para el Switch, deberás crear la variable estacion, y distintos *case* para las cuatro estaciones
  del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
  de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea
  una estación.
***/

public class Ejercicios_2_DeControl {

    public static void main(String[] args) {
        int numeroIf = 5;

        System.out.println("---------------Ejercicio IF---------------");

        if(numeroIf < 0) {
            System.out.println("Número negativo");
        } else if (numeroIf > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número neutro");
        }

        System.out.println("---------------Ejercicio WHILE---------------");

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("---------------Ejercicio DO-WHILE---------------");

        int numeroW = 3;

        do {
            System.out.println(numeroW);
            numeroW = numeroW + 1;
        } while (numeroW < 3);

        System.out.println("-----------------Ejercicio FOR-------------------");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("-----------------Ejercicio SWITCH-----------------");

        var estacion = "VERANO";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No corresponde a ninguna estacion");
        }
    }
}
