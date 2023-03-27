package com.yao.bd_registros.conexion;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {

    private Conexion() {}
    
    // Variable guarda el estado conexion a nuestra BD
    private static Connection conexion;
    
    // Var para crear una sola instancia
    
    private static Conexion instancia;
    
    // Var para conexion a BD
    private static final String URL = "jdbc:mysql://localhost/bd_registros";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Nataly89";
    
    
    // método conexión BD
    public Connection conectar() {
    
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        
            return conexion;
        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return conexion;
    }
    
    // método cerrar conexión BD
    public void cerrarConexion() throws SQLException {
    
        try {
        
            conexion.close();
            JOptionPane.showConfirmDialog(null, "Se desconecto de la BD");
                    
        } catch(Exception e) {
        
            JOptionPane.showMessageDialog(null, "Error: " + e);
            conexion.close();
        
        } finally {
            conexion.close();
        }
        
    }
    
    // Patrón Singleton
    public static  Conexion getInstance() {
    
        if (instancia == null) {
            instancia = new Conexion();
        }
        
        return instancia;
    }
}
