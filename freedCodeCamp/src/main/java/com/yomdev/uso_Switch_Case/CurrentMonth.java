package com.yomdev.uso_Switch_Case;

/**
 * Utiliza la switch declaración en Java para ejecutar un bloque de código particular
 * cuando se cumple una determinada condición.
 *
 * expression entre switch paréntesis se compara con cada case.
 * Cuando el expressiones igual que el, se ejecuta case el bloque de código correspondiente en el case
 *
 * Si todos los casos no coinciden con el, entonces se ejecuta expression el bloque de código definido
 * bajo la palabra clave default
 *
 * Usamos la break palabra clave para terminar el código cada vez que se cumple una determinada condición
 * (cuando coincide expression con un case).
 *
 * switch(expression) {
 *   case 1:
 *     // code block
 *     break;
 *   case 2:
 *     // code block
 *     break;
 *     case 3:
 *     // code block
 *     break;
 *   default:
 *     // code block
 * }
 *
 *
 */
public class CurrentMonth {

    public static void main(String[] args) {

        int month = 6;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            // June
        }
    }
}
