package com.morsa.DepedencyInversionPrinciple;

/*
Principio Inverion de Depedencia
Segun la arquitectura limpia toda lógica de negocios o sea la lógica más importante de un programa
debe estar al centro/corazon del programa y no debe depender explícitamente de otras dependencias

En el caso anterior del paquete inyeccion de dependencia la clase principal, esta dependiendo de una
clase externa veterinario

Por ende las dependenicas deben depender de nuestra logica mas importante y no viceversa, para eso
creamos una interfaz diagnosticador, de la cual nuestra clase principal gato, va a depender ahora
de una abstracion y no de una dependencia en si
Y la clase veterinario va a implementar esta interfaz
*/

// La clase main es la unica parte de nuestro programa donde tenemos una dependencia explicita
// a la clase veterinario, pero de aqui hacia adelante el programa solo trabaja con un diagnosticador
public class Main {

    public static void main(String[] args) {
        Gato miGato = new Gato(new Veterinario(), 4, 8);

        boolean estaSano = miGato.esUnGatoSaludable();

        if (estaSano) {
            System.out.println("Mi gato esta sano :)");
        } else {
            System.out.println("Mi gato debe bajar de peso.");
        }
    }
}