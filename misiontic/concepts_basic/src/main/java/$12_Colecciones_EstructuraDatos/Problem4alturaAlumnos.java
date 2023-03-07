package $12_Colecciones_EstructuraDatos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calcular la altura media de los alumnos de una clase
 * pida por teclado las alturas de N alumnos de una clase y las guarde en un ArrayList de tipo Double.
 * calcular altura media de todos los alumnos, cuantos alumnos hay más altos que la media y cuantos más bajos.
 * Para resolverlo vamos a utilizar 4 métodos además del método main:
 * Método numeroAlumnos(): pide el número de alumnos de la clase y devuelve dicho número.
 * Método leerAlturas(): pide las alturas de los N alumnos y almacena en el ArrayList.
 * Este método recibe como parámetros el ArrayList inicialmente vacío y el número de alumnos a leer.
 * Método calcularMedias(): calcula y devuelve la media de los alumnos de la clase.
 * Este método recibe como parámetro el ArrayList con las alturas de todos los alumnos.
 * Método mostrarResultados(): muestra por pantalla todas las alturas y calcula y muestra el número de alumnos
 * ***/

public class Problem4alturaAlumnos {

    public static void main(String[] args) {
        //creamos el ArrayList que contendrá la altura de los alumnos
        ArrayList<Double> altura = new ArrayList();
        int numStudents;
        double media;

        //obtenemos el número de alumnos de la clase
        numStudents = numeroAlumnos();

        //leemos la altura de los N alumnos
        leerAlturas(altura, numStudents);

        //calculamos la media
        media = calcularMedia(altura);

        //mostramos los resultados
        mostrarResultados(altura, media);
    }

    //Método para pedir por teclado el número de alumnos de la clase
    public static int numeroAlumnos() {
        Scanner datoNumero = new Scanner(System.in);

        int numeroAlumnos;

        do {
            System.out.print("Introduce número de alumnos: ");
            numeroAlumnos = datoNumero.nextInt();
        } while (numeroAlumnos < 1);

        return numeroAlumnos;
    }

    //Este método recibe el ArrayList y el número de alumnos de la clase
    //Pide por teclado la altura de todos los alumnos y las guarda en el ArrayList
    public static void leerAlturas(ArrayList<Double> datosAltura, int n) {
        Scanner digitarAltura = new Scanner(System.in);

        int i;

        double alto;

        for (i = 1; i <= n; i++) {
            do {
                System.out.print("Alumno " + i + " altura: ");
                alto = digitarAltura.nextDouble();
            } while (alto <= 0);

            datosAltura.add(alto); //añade la altura al final del ArrayList
        }
    }

    //Este método recibe el ArrayList con todas las alturas
    //calcula y devuelve la media
    public static double calcularMedia(ArrayList<Double> a) {
        double media = 0;

        for (Double d : a) {
            media = media + d;
        }

        return media / a.size();
    }

    //Muestra la altura de todos los alumnos, la media y calcula y muestra
    //cuantos alumnos hay con altura superior a la media
    //y cuántos con altura inferior
    public static void mostrarResultados(ArrayList<Double> a, double media) {
        int superior = 0, inferior = 0;

        System.out.println("alturas introducidas: ");

        System.out.println(a);

        for (Double d : a) {
            if (d > media)
                superior++;
            else if (d < media)
                inferior++;
        }

        System.out.printf("Media: %.2f %n", media);

        System.out.println("Hay " + superior + " alumnos más altos que la media");

        System.out.println("Hay " + inferior + " alumnos más bajos que la media");
    }
}
