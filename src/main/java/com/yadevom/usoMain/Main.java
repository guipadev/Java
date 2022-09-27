package usoMain;

/**
 * El metodo main en java es el punto de partida de nuestro programa, sin el ningun programa funcionaria
 * es un metodo estatico por lo cual debe estar dentro de un clase
 *
 * El identificador de acceso es "public" para ser visible a la JVM
 * Tipo "static" con esto no se debe crear ningun tipo de objeto para poder ejecutar el programa
 * Valor retorno "void" no esperar que se retorno cualquier tipo de valor
 * Nombre reservado  "main" que significa principal
 * Tipo de parametro un array "String[] arg" que acepta tipos de argumentos para ejecutar el programa
 */

public class Main {
    // Ejecuta por consola javac Main.java
    // Con argumentos java Main youtube

    public static <Persona> void main(String[] args) {
        System.out.println("Hola mundo");

        // recorrer args
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
