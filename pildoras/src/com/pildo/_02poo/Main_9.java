package com.pildo._02poo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Instanciar una clase. Ejemplar de clase
        Coche miCoche = new Coche();

        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(miCoche.dimeDatosGenerales());

        System.out.println(miCoche.dimeColor());

        miCoche.configuraAsientos(JOptionPane.showInputDialog("Asientos de cuero Si o No"));

        System.out.println(miCoche.dimeAsientos());

        miCoche.configurarClimatizador(JOptionPane.showInputDialog("Tiene AA, Si o No"));

        System.out.println(miCoche.dimeClimatizador());

        System.out.println(miCoche.dimePesoCoche());

        System.out.println("El precio final del coche es " + miCoche.precioCoche());

        //System.out.println(Renault.dimeLargo());
        //System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
    }
}
