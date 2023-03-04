package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectaPrueba {

	public static void main (String[] args) {
		
		try {
			// Crear conexión, si la BD esta por defecto no habria necesidad de poner :3306
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "Nataly89");
		
			// Crear objeto statement
			Statement miStatement = miConexion.createStatement();
			
			// Ejecutar SQL
			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM productos");
			
			// Recorrer el ResultSet, la cual es una tabla virtual que se almacena en memoria, donde se almacenan los resultados que queremos ver
			while(miResultset.next()) {
				// Se coloca el nombre de la columna, pero si sabes la posición se pondria dicho número miResultset.getString(0) 
				// Hay todo los resultados se manejan como String
				System.out.println(miResultset.getString("NOMBREDEARTICULO") + " " + miResultset.getString("CODIGOARTICULO") + " " + miResultset.getString("PRECIO"));
				System.out.println("-------------------------------------------------------");
				// Si queremos operar como multiplicar no se podria, podemos utilizar de acuerdo al dato real que esta en BD
				System.out.println(miResultset.getString("NOMBREDEARTICULO") + " " + miResultset.getString("CODIGOARTICULO") + " " + miResultset.getDate("FECHA") + " " + miResultset.getDouble("PRECIO")*2);
			}
			
		} catch (Exception e) {
			
			System.out.println("NO CONECTA!!");
			
			e.printStackTrace();
		}
	}
}
