import java.util.Scanner;

public class UsoCadenasdeTexto {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
               
        String a = "hola";
        String b = "hola";
        String c = "HOLA";

        System.out.println ("A es igual a B: " + a.equals(b));
        System.out.println ("A es igual a C: " + a.equals(c));
        System.out.println ("A es igual a C ingnorando diferencias: " + a.equalsIgnoreCase(c));
        
        //determinar si una cadena se encuentra dentro de otra
        String d = "hola potter";
        String e = "hola";
        System.out.println("Alguna cadena de texto de D condicide en E: " + d.contains(e));
        
        /*concatenación de cadenas
        "Hello" + "World!" = "HelloWorld!"
        myString + "123" = "Hello World!123"
        "Cadenas de" + " " + "texto" = "Cadenas de texto"
        "Hola " + "Mundo" = "Hola Mundo"
        */
        
        /*saber exactamente cuántos caracteres tiene una cadena
        "Hello World!".length()
        "1234567".length() = 7
        myString.length() = 12
        "".length() = 0
        */
        
        /*extraer un único caracter de una cadena
        "Hello World!".charAt(0) = "H"
        "1234567".charAt(6) = "7"
        myString.charAt(11) = "!"
        */
        
        
        // Es posible extraer parte de una cadena utilizando el método
        // substring(inicio, fin) de la clase String.
        String x = "Programar es genial!";
        System.out.println(x.substring(10, x.length()));
        
        //Es posible extraer partes de una cadena dado una subcadena utilizando
        //split(cad) de la clase String.
        
        String xx = "Gandalf 3000 1.68";
        String[] lineas = xx.split(" ");
        String nombres = lineas[0];
        int edades = Integer.parseInt(lineas[1]);
        double estaturas = Double.parseDouble(lineas[2]);
        
        System.out.println("nombre: " + nombres);
        System.out.println("edad: " + edades);
        System.out.println("estatura: " + estaturas + "cm");
        
        //Es posible leer una cadena de texto y procesarla. Si la cadena está
        //separada por ejemplo por & y el formato del texto es nombre&edad&estatura:
        System.out.println("Digita inf. de esta manera nombres&edad&estatura");
        String digitado = sc.nextLine();
        String[] line = digitado.split("&");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "cm");
        
        
    }
   
}
