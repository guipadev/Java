package com.yadevom.b_palabraClave_STATIC;

/**
 *  Si alguna vez has visto la palabra clave STATIC en algunos de los proyectos en los que trabajas y no ha sabido que significa, en este JAVA tutorial veremos sus diferentes usos.
 *
 * La palabra clava STATIC en JAVA puede usarse tanto en variables o métodos.
 */
public class Main {

    public static void main(String[] args) {

        // Uso de la palabra clave STATIC
        System.out.println("********************* USO DE STATIC *********************");
        // En este ejemplo con el uso de STATIC se comparte el valor
        // Sin necesidad de invocar una instancia de la clase u objeto
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();

        contador1.contar();
        contador2.contar();
        contador3.contar();

        System.out.println(Contador.getValor()); // por ende dara 3

        // Sin necesidad de crear un tipo de objetos se puede llamar al metodo STATIC
        System.out.println(Contador.sum(1, 1));
    }
}
