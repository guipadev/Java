package com.yao.bd_registros;

import com.yao.bd_registros.conexion.Registro;


public class App {
    
     public static void main(String[] args) {
        
        Registro pantalla = new Registro();
        pantalla.setVisible(true);
        pantalla.setLocation(100, 100);
        
         System.out.println("Funciona!!");
        
    }    
    
    
}
