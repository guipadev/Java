package com.pildo._10tiposenumerados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Tallas s = Tallas.MINI;
        Tallas m = Tallas.MEDIANO;
        Tallas l = Tallas.GRANDE;
        Tallas xl = Tallas.MUY_GRANDE;

        // Enum tambien permite la creacion de constructores, metodos getters y setters

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

        String entrada_datos = entrada.next().toUpperCase();

        UsoTallas.Talla laTalla = Enum.valueOf(UsoTallas.Talla.class, entrada_datos);

        System.out.println("Talla = " + laTalla);

        System.out.println("Abreviatura = " + laTalla.dameAbreviatura());
    }
}
