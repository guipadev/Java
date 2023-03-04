package com.pildo._06herencia;

public class Main {

        public static void main(String[] args) {

                Coche miCoche1 = new Coche();

                miCoche1.estableestableceColor("Rojo");

                Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

                miFurgoneta1.estableceColor("Amarillo");

                miFurgoneta1.configuraAsientos("Si");

                miFurgoneta1.configurarClimatizador("Si");

                System.out.println(miCoche1.dimeDatosGenerales() + " " + miCoche1.dimeColor());

                System.out.println(miFurgoneta1.dimeDatosGenerales() + " " + miFurgoneta1.dimeDatosFurgoneta());

        }
}
