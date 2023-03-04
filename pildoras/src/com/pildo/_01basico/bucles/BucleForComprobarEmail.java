package com.pildo._01basico.bucles;

import javax.swing.*;

public class BucleForComprobarEmail {

    public static void main(String[] args) {

        int arroba = 0;

        boolean punto = false;

        String mail = JOptionPane.showInputDialog("Introduce emial");

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                arroba++;
            }

            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }



        if (arroba == 1 && punto == true)  {
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
        }
    }
}
