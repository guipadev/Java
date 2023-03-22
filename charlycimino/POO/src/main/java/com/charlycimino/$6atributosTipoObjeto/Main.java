package com.charlycimino.$6atributosTipoObjeto;

public class Main {

    public static void main(String[] args) {

        Motor motor = new Motor("12345", 1.6, "Nafta");

        Auto auto = new Auto("xyz456", "Chevrolet", 34136, "Azul", motor);

        // Podemos crear varios vehiculo con el mismo motor,
        // pero el daño de un motor de un carro afecta a los demas porque se esta apuntando al mismo objeto en memoria
        Auto auto2 = new Auto("xy454", "Renault", 41036, "Rojo", motor);
        Auto auto3 = new Auto("xsz406", "Mazda", 3006, "Amarillo", motor);

        System.out.println(motor);
        System.out.println(auto);

        // Aumento cilindrada vehiculo
        motor.setCilindrada(2.3);

        System.out.println("- - - - - - - - - - - -- - - -  -- - - - - - - -");

        System.out.println(motor);
        System.out.println(auto);
    }
}
