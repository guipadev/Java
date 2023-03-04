package com.pildo._13clasesinternaslocales;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Reloj {


    public void enMarcha(int intervalo, final boolean sonido) { // final porque se usa en la clase interna

        // Creacion clase interna local, ya que solo se utiliza en este ejemplo una vez, por lo cual aplica
        class DameLaHora2 implements ActionListener {

            public void actionPerformed(ActionEvent evento) {

                Date ahora = new Date();

                System.out.println("Te pongo la hora cada 3 seg " + ahora);

                // la clase interna pudo acceder al atributo externo, de la clase que lo engloba, sin necesidad de crear setters y getters
                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

}

