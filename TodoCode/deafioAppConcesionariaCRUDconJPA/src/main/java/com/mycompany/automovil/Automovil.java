package com.mycompany.automovil;

import com.mycompany.automovil.igu.Principal;


public class Automovil {

    public static void main(String[] args) {
        
        // Llamamos y hacemos visible la IGU
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
