package com.ricardoromerobenitez.lambda;
//https://programandoenjava.com/lambdas-en-java-8/
/**
 * Funcionalidad añadida a partir de Java 8
 * Se añade como solucion a las clases anonimas de un solo metodo
 * Ya que permiten expresar instancias de un clase con un unico metodo de forma mas compacta
 */


public class Main {

    public static void main(String[] args) {

        // Forma sin lambda
        Ejecutor claseAnonimaEjecutor = new Ejecutor() {
            @Override
            public void ejecutar() {
                System.out.println("Hola desde una clase anonima");
            }
        };

        // Forma lambda, aqui se podria omitir los corchetes {}
        Ejecutor lambdaEjecutor = () -> { System.out.println("Hola desde nuestra lambda"); };

        // Ejecutando
        claseAnonimaEjecutor.ejecutar();

        lambdaEjecutor.ejecutar();

        /**
         * EJEMPLO CON PARAMETROS
         */

        // Forma sin lambda
        EjecutorConParametro claseAnonimaParametro = new EjecutorConParametro() {
            @Override
            public void ejecutarParametro(String parametro) {
                System.out.println("Hola clase anonima con " + parametro);
            }
        };

        // Forma lambda, aqui se podria omitir los corchetes {}
        EjecutorConParametro lambdaParametro = (parametro) -> System.out.println("Hola desde nuestra lambda");

        // Ejecutando
        claseAnonimaParametro.ejecutarParametro("clase anonima con PARAMETRO");

        lambdaParametro.ejecutarParametro("lambda con PARAMETRO");

        /**
         * EJEMPLO CON RETORNO CON ALGUN TIPO PARAMETRO
         */

        // Forma sin lambda
        EjecutorRetornaParametro claseAnonimaRetorna = new EjecutorRetornaParametro() {
            @Override
            public String retorna(String parametro) {
                System.out.println("Hola clase anonima con " + parametro);
                return parametro.toUpperCase();
            }
        };

        // Forma lambda, aqui se podria omitir los corchetes {}
        EjecutorRetornaParametro lambdaretorna = (parametro) -> {
            System.out.println("Hola desde nuestra lambda");
            return parametro.toLowerCase();
        };

        // Ejecutando
        String resultadoClaseAnonima = claseAnonimaRetorna.retorna("clase anonima retorna parametro STRING");

        String resultadoLambda = lambdaretorna.retorna("lambda retorna parametro STRING");

        System.out.println(resultadoClaseAnonima);
        System.out.println(resultadoLambda);
    }
}
