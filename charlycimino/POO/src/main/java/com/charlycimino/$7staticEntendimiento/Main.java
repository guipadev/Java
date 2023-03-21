package com.charlycimino.$7staticEntendimiento;

public class Main {

    // Con un metodo static de instancia se puede acceder y comprobar metodos y atributos
    // de clases pero no asi al contrario, osea desde un metodo de clase static no se puede
    // acceder ni a variables, ni a metodos de instancia (static y this no se llevan... :()

    public static void main(String[] args) {

        Auto auto = new Auto("xyz456", "Chevrolet", 34136, "Azul");
        Auto auto2 = new Auto("xy454", "Renault", 41036, "Rojo");
        Auto auto3 = new Auto("xsz406", "Mazda", 3006, "Amarillo");

        System.out.println(auto.precioPromocional());
        System.out.println(auto2.precioPromocional());
        System.out.println(auto3.precioPromocional());

        // Al afectar la variable static afecta a todos, el cambio del descuento de un carro afecta a los demas
        // auto.anularDescuento();

        // Al haber cambiado el metodo a static, desde la clase auto se debe solicitar anular dcto
        Auto.anularDescuento();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        System.out.println(auto.precioPromocional());
        System.out.println(auto2.precioPromocional());
        System.out.println(auto3.precioPromocional());

    }
}
