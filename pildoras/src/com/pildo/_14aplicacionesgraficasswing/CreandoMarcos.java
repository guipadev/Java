package com.pildo._14aplicacionesgraficasswing;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {

    public static void main(String[] args) {

        miMarco marco1 = new miMarco();

        marco1.setVisible(true);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class miMarco extends JFrame {

    public miMarco() {

        //setSize(500,300); //tamaño ventana

        //setLocation(500,300); //posicion ubicacion pantalla

        setBounds(500,300,250,250); // declara posicion y tamaño ventana

        // setResizable(false); // pantalla bloqueada

        // setExtendedState(Frame.MAXIMIZED_BOTH); // ocupacion pantalla completa

        setTitle("Mi ventana"); //titulo ventana
    }
}
