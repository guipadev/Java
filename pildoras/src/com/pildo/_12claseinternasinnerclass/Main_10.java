package com.pildo._12claseinternasinnerclass;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Reloj miReloj = new Reloj(3000, true);

        miReloj.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa 'OK' para finalizar");
    }
}
