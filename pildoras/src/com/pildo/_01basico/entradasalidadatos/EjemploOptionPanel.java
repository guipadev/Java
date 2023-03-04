package com.pildo._01basico.entradasalidadatos;

import javax.swing.*;

public class EjemploOptionPanel {

    public static void main(String[] args) {

        String nombre_usuario = JOptionPane.showInputDialog("Introduce nombre:");

        String edad = JOptionPane.showInputDialog("Introduce edad");

        int edad_usuario = Integer.parseInt(edad);

        edad_usuario++;

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + edad_usuario + " años");

    }
}
