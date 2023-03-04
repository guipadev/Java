package CadenaCaracteres_String;

import java.util.Scanner;

/**
La forma de crear cadenas de texto en Java es la siguiente
Primero se indica el tipo de objeto que se va a instanciar, en este caso sería
String
Luego se define un nombre para el objeto que se está creando
String myString
Por último se inicializa el objeto con el valor del String. Es importante recordar
que las cadenas de texto van entre comillas dobles.
String myString = "Hello World!";
**/

public class Ejemplo1 {

    public static void main (String[] args){

        String myString = "Hello World!";

        /**
         Como las cadenas de texto no son de tipo primitivo la forma de comparar
         si dos cadenas son iguales es usar str1.equals(str2)
         para determinar si la cadena str1 es igual a la cadena str2.
         Para comparar dos cadenas ignorando si son mayúsculas o minúsculas se utiliza
         str1.equalsIgnoreCase(str2)
         **/

        String a = "hola";
        String b = "hola";
        String c = "HOLA";
        System.out.println(a.equals(b));    //true
        System.out.println(a.equals(c));    //false
        System.out.println(a.equalsIgnoreCase(c));  //true

        /**Para determinar si una cadena str1 se encuentra dentro de otra str2 se utiliza
        str1.contains(str2):**/

        String d = "hola potter";
        String e = "hola";
        System.out.println(d.contains(e));  //true

        /**Se puede saber exactamente cuántos caracteres tiene una cadena de texto
        mediante el método length() de la clase String.
        Este método retorna un entero igual a la cantidad de caracteres que tiene
        la cadena de texto.**/

        System.out.println("Hello World!".length()); //12
        System.out.println("1234567".length()); //7
        System.out.println(myString.length());  //12
        System.out.println("".length());    //0

        /**EXTRACIÒN DE CARACTER
         Se puede extraer un único caracter de una cadena de texto mediante el
         método charAt() de la clase String.
         Se debe pasar como parámetro el índice dentro de la cadena, y retornará el
         caracter en esa posición.
         **/

        System.out.println("Hello World!".charAt(0));  //"H"
        System.out.println("1234567".charAt(6));   //"7"
        System.out.println(myString.charAt(11));   //"!"

        /**
        Es posible extraer parte de una cadena utilizando el método
        substring(inicio, fin) de la clase String.
        El método retornará parte de la cadena que se encuentra entre inicio y fin.
        **/

        String s = "Programar es genial!";
        System.out.println(s.substring(10, s.length()));

        /**
         Es posible extraer partes de una cadena dado una subcadena utilizando
         split(cad) de la clase String.
         El método retorna un arreglo de Strings. Para leer el nombre de una
         persona, la edad y la estatura separados por espacio se puede utilizar el
         siguiente código:
         **/

        String z = "Gandalf 3000 1.68";
        String[] line = z.split(" ");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "cm");

        /**
        Es posible leer una cadena de texto y procesarla.
        Si la cadena está separada por ejemplo por & y el formato del texto es
        nombre&edad&estatura:
        **/

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre, edad, estatura separadas por &, ejemplo Nata&25&1.80");
        String texto = sc.nextLine();
        String[] linea = texto.split("&");
        String nombres = linea[0];
        int edades = Integer.parseInt(linea[1]);
        double estaturas = Double.parseDouble(linea[2]);
        System.out.println("nombre: " + nombres);
        System.out.println("edad: " + edades);
        System.out.println("estatura: " + estaturas + " cm");
    }
}
