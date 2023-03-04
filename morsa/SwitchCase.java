package com.morsa;

import static Utilidades.Utils.*;

public class SwitchCase {

    public static void main(String[] args) {

        String dia = input("Que dia es? ");

        switch (dia) {
            case "lunes": {
                println("Dia de lavar");
                break;
            }
            case "martes": {
                println("Dia de cantar");
                break;
            }
            case "viernes": {
                println("Dia de jugar");
                break;
            }
        }

        int num = inputInt("Digita numero de 1 al 9: ");

        switch (num) {
            case 2:
            case 4:
            case 6:
            case 8:{
                println("Numero par");
                break;
            }
            case 1:
            case 3:
            case 7:
            case 9:{
                println("Numero impar");
                break;
            }
            default: {
                println("Recuerda que solo numeros de 1 a 9!!");
            }
        }
    }

}
