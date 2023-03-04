package com.pildo._12claseinternasinnerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Reloj {

    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha() {
        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

    // implementacion clase interna, en caso de tener dos clases es bueno utilizar esta forma
    private class DameLaHora2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            Date ahora = new Date();

            System.out.println("Te pongo la hora cada 3 seg " + ahora);

            // la clase interna pudo acceder al atributo externo, de la clase que lo engloba, sin necesidad de crear setters y getters
            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
