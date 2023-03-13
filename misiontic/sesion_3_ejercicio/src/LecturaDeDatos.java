// Se importa el paquete donde se encuentra Scanner
import java.util.Scanner;

/*
* Dependiendo del tipo de dato que se vaya a leer se usan diferentes formas de lectura.
* Para variables numéricas:
*
* Tipo de Dato      Forma de lectura
    byte            byte b = Byte.parseByte(sc.nextLine());
    short           short s = Short.parseShort(sc.nextLine());
    int             int i = Integer.parseInt(sc.nextLine())
    long            long l = Long.parseLong(sc.nextLong());
    float           float f = Float.parseFloat(sc.nextLine());
    double          double d = Double.parseDouble(sc.nextLine());
*Para variables booleanas y de tipo char:
    Tipo de Dato    Forma de lectura
    boolean         boolean b = Boolean.parseBoolean(sc.nextLine());
    char            char c = sc.nextLine().charAt(0);
***/

public class LecturaDeDatos {

    public static void main(String[] args) {
        // instancia del objeto Scanner
        Scanner sc = new Scanner(System.in);

        // leer datos de tipo byte
        byte b = Byte.parseByte(sc.nextLine());

        // leer datos de tipo short
        short s = Short.parseShort(sc.nextLine());

        // leer datos de tipo int
        int i = Integer.parseInt(sc.nextLine());

        // leer datos de tipo long
        long l = Long.parseLong(sc.nextLine());

        // leer datos de tipo float
        float f = Float.parseFloat(sc.nextLine());

        // leer datos de tipo double
        double d = Double.parseDouble(sc.nextLine());

        // leer datos de tipo boolean
        boolean bo = Boolean.parseBoolean(sc.nextLine());

        // leer datos de tipo char
        char c = sc.nextLine().charAt(0);
    }
}
