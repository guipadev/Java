package usoStreams;

/*
Un stream es una secuencia de objetos que admite varios métodos que se pueden canalizar para producir el resultado deseado.
Los streams de Java 8 no deben confundirse con los flujos de E/S de Java (por ejemplo, FileInputStream, etc.) estos tienen muy poco que ver entre sí.

Los streams son envoltorios (wrappers) alrededor de una fuente de datos, lo que nos permite operar con esa fuente de datos y hacer que el procesamiento masivo sea conveniente y rápido.
* */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Declaracion de Stream - Ingresamos tanto valores como queramos
        Stream<String> streamDeStrings = Stream.of("Antonio", "Maria", "Juan", "Pedro");

        // Declaracion de Stream a traves de una lista - enerar a traves de coleciones
        List<String> lista = Arrays.asList("Monica", "Cris", "Yepe", "May");
        Stream<String> streamDeLista = lista.stream();

        // Convertir a una lista
        List<String> listica = streamDeStrings.collect(Collectors.toList());
        System.out.println(listica);

        /**
         * FILTER filtrar datos que contenga letra a minuscula
         */
        Stream<String> datosPersonas = Stream.of("Antonio", "Maria", "Juan", "Pedro")
                .filter(people -> people.contains("a"));

        List<String> listaPersonas = datosPersonas.collect(Collectors.toList());

        System.out.println(listaPersonas);

        /**
         * MAP recorrer y transformar lista gente a mayuscula
         */
        Stream<String> datosGente = Stream.of("Antonio", "Maria", "Juan", "Pedro")
                .map(people -> people.toUpperCase());

        List<String> listaGente = datosGente.collect(Collectors.toList());

        System.out.println(listaGente);


        /**
         * COUNT conocer la cantidad de la lista gente
         */
        long cantLista = Stream.of("Antonio", "Maria", "Juan", "Pedro")
                .count();

        System.out.println(cantLista);


        /**
         * ANYMATCH devuelve valor boolean si cumple condicion a buscar
         */
        boolean encontrarLista = Stream.of("Antonio", "Maria", "Juan", "Pedro")
                .anyMatch(b -> b.contains("M"));

        System.out.println(encontrarLista);

        /**
         * Podemos realizar varias operaciones concatenandolas
         * en este caso declaramos que desamos tener un resultado boolean
         * pero si lo cambiamos podemos tener el string, long etc...
         */
        boolean variosDatos = Stream.of("Voleibol", "Cristiano", "Moto", "Zorro", "Silla", "Hombres X", "Limon")
                .filter(x -> x.contains("a"))
                .filter(x -> x.startsWith("M"))
                .anyMatch(b -> b.contains("z"));

        System.out.println(variosDatos);

        /**
         * Otro ejemplo de busqueda en el cual buscaremos el resultado String de las condiciones
         */
        Stream<String> datoGente = Stream.of("Antonio", "Maria", "Juan", "Pedro")
                .filter(x -> x.contains("a"))
                .filter(x -> x.startsWith("M"));

        List<String> listGente = datoGente.collect(Collectors.toList());

        System.out.println(listGente);

    }


}

