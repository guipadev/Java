package com.pildo._11interfaces.pruebatemporizador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLaHora implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Date ahora = new Date();

        System.out.println("Te pongo la hora cada 5 seg: " + ahora);

        Toolkit.getDefaultToolkit().beep();
    }
}
