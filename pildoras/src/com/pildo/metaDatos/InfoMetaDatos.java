package metaDatos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoMetaDatos {

	public static void main(String[] args) {

		mostrarInfoBBDD();
		
		System.out.println("=============================================================================");
		
		mostrarInfoTablas();
	}
	
	static void mostrarInfoBBDD() {
		
		Connection miConexion = null;
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root",
					"Nataly89");
			
			// Obtención de metadatos
			DatabaseMetaData datosBBDD = miConexion.getMetaData();
			
			// Mostrar información de la BBDD
			System.out.println("Gestor de BBDD ===> " + datosBBDD.getDatabaseProductName());
			
			System.out.println("Version del gestor ===> " + datosBBDD.getDatabaseProductVersion());
			
			System.out.println("Nombre del driver ===> " + datosBBDD.getDriverName());
			
			System.out.println("Version del drive ===> " + datosBBDD.getDriverVersion());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		
		} finally {
			
			try {
				miConexion.close();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} 
	}
	
	
	static void mostrarInfoTablas() {
		
		Connection miConexion = null;
		
		ResultSet miResultset = null;
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root",
					"Nataly89");
			
			// Obtención de metadatos
			DatabaseMetaData datosBBDD = miConexion.getMetaData();
		
			// Lista de tablas
			System.out.println("<==== LISTA DE TABLAS ====>");
			
			miResultset = datosBBDD.getTables(null, null, "p%", null);
			
			while (miResultset.next()) {
				System.out.println(miResultset.getString("TABLE_NAME"));
			}
			
			// Lista de columnas de producto
			System.out.println("");
			
			System.out.println("<=== CAMPOS DE PRODUCTOS ===>");
			
			miResultset = datosBBDD.getColumns(null, null, "productos", null);
			
			while (miResultset.next()) {
				System.out.println(miResultset.getString("COLUMN_NAME"));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		
		} finally {
			
			try {
				miConexion.close();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} 
	}

}
