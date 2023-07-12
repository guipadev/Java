import java.util.Scanner;

/**
 * Scanner nos permite leer de una forma estructurada y ordenada cadenas de
 * caracteres
 * o fuentes de datos externas como archivos, conexiones de red, teclado
 */
public class Main {

    public static void main(String[] args) {

        String datos = "Hola bebe que mas pues";

        Scanner scan = new Scanner(datos);

        System.out.println(scan.next()); // Hola
        System.out.println(scan.next()); // bebe
        System.out.println(scan.next()); // que
        System.out.println(scan.next()); // mas

        while (scan.hasNext()) {
            System.out.println("Una palabra: " + scan.next());
        }
    }
}