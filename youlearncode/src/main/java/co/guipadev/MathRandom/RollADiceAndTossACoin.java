package co.guipadev.MathRandom;

/**
 Cómo usar Math.random en Java: un ejemplo del mundo real

 El método analizado anteriormente se puede utilizar en varias aplicaciones.
 Puede generar contraseñas aleatorias, identificaciones aleatorias o nombres de usuario aleatorios.
 También se puede usar para agregar aleatoriedad a juegos de todo tipo (Tetris podría ser un ejemplo).

 A continuación puede encontrar un ejemplo de un programa que simula el lanzamiento de una moneda y un dado,
 para un número de veces proporcionado por el usuario.
 */
import java.util.Scanner;

public class RollADiceAndTossACoin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el numero de veces que tiras un dado");
        int number = scanner.nextInt();
        for (int i = 0;i < number; i++){
            System.out.println(getRandomIntInclusive(1,6));
        }
        System.out.println("Elige el número de veces que lanzarás una moneda");
        number = scanner.nextInt();
        for (int i = 0; i < number; i++){
            System.out.println(getCoinToss());
        }

    }

    // Metodo random
    public static int getRandomIntInclusive(double lowerLimit, double upperLimit){
        return (int)(lowerLimit + Math.random() * (upperLimit - lowerLimit + 1));
    }

    // Para simular un lanzamiento de moneda, obtenga un número entero aleatorio en [0, 1], y si es 0, devuelva Cara, de lo contrario, devuelva Cruz
    public static String getCoinToss(){
        int result = getRandomIntInclusive(0,1);
        if(result == 0)
            return "Cara";
        else
            return "Cruz";

    }

}
