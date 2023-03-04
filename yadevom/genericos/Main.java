package genericos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // EJemplo lista generica
        // No se sabe de que tip es ? con esto bastaria indicarle tipo lista <String> generico
        List lista = new ArrayList();
        lista.add("Hola");
        lista.add(1);

        // Tendremos que castiar para indicar el tipo
        final String ejemplo = (String) lista.get(0);

        // Los GENERICOS nos permiten crear una sola clase, interfaz o metodo
        // que se puede usar con diferentes tipos de datos y operan en un tipo parametrizado
        // en una entida generica

        Generico<Double> generico = new Generico<>(1.0);
        generico.mostrar();

        // Utilizamos el anterior generico y podemos cambiar el tipo de dato
        Generico<String> genericoB = new Generico<>("Hola ;)");
        genericoB.mostrar();

        // Generio exclusivo tipo Number
        Generico0<Integer> genericoNumero = new Generico0<>(6);
        genericoNumero.mostrar();

        // Uso generico en metodos
        Generico2 generico2 = new Generico2();
        generico2.mostrarGenerico(2);

        // uso de generico en metodos con varios tipos
        Generico3 generico3 = new Generico3();
        generico3.mostrarGenerico2("Hola Bebe", 1);
        final Integer resultado = generico3.mostrarGenerico2("hola", 1);
        System.out.println(resultado);

        // Uso del metodo genericos para recorrer lista que indica que el tipo debe ser numero
        Generico4 generico4 = new Generico4();

        List<Number> listota = new ArrayList<>();

        listota.add(1);
        listota.add(2.3);
        listota.add(10L);
        generico4.mostrarGenerico3(listota);
    }
}
