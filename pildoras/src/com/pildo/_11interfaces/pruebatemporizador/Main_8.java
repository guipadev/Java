package com.pildo._11interfaces.pruebatemporizador;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Otra forma
        // ActionListener oyente = new DameLaHora;

        DameLaHora oyente = new DameLaHora();

        Timer miTemporizador = new Timer(5000, oyente);

        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa 'OK' para detener");
    }
}
