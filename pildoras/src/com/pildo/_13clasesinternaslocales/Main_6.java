package com.pildo._13clasesinternaslocales;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Reloj miReloj = new Reloj();

        miReloj.enMarcha(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa 'OK' para finalizar");
    }
}
