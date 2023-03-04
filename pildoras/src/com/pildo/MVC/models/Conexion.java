package MVC.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	Connection miConexion = null;
	
	public Conexion() {
		
	}
	
	// Método conexión
	public Connection dameConexion() {
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "Nataly89");

			
		} catch (Exception e) {
			
			
			
		}
		
		return miConexion;
	}

}
