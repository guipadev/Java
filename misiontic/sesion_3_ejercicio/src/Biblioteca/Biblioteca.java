/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yamid
 */
public class Biblioteca {
    
    public static void main(String[] args) {
        
        String dbURL = "jdbc:mysql://localhost:3306/museoDB";
        String username = "root";
        String password = "Nataly89*";
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
}
        
    }
    
}
