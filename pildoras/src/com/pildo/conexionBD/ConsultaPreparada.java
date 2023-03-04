package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
Consultas preparadas con más seguras, mejor rendimiento y más optimizadas	 
Ya puede utilizar la misma consulta con otro criterios
*/

public class ConsultaPreparada {

	public static void main(String[] args) {
		
		try {
			// Crear conexión
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "Nataly89");
		
			// Preparar consulta SQL
			PreparedStatement miSentencia = miConexion.prepareStatement("SELECT NOMBREDEARTICULO, SECCION, PAISDEORIGEN FROM productos WHERE SECCION=? AND PAISDEORIGEN=?");
			
			// Establecer parametros de consulta, en este caso son de tipo texto
			miSentencia.setString(1, "DEPORTES");
			miSentencia.setString(2, "USA");
			
			// Ejecutar y recorrer consulta
			ResultSet rtaQuery = miSentencia.executeQuery();
			
			while(rtaQuery.next()) {
				
				System.out.println(rtaQuery.getString(1) + " " + rtaQuery.getString(2) + " " + rtaQuery.getString(3));
			}
			
			rtaQuery.close();
			
			// Reutilización de consulta SQL
			System.out.println("------------------------ EJECUCIÓN DE SEGUNDA CONSULTA ------------------------");
			System.out.println("");
			
			miSentencia.setString(1, "CERAMICA");
			miSentencia.setString(2, "CHINA");
			
			// Ejecutar y recorrer consulta
			rtaQuery = miSentencia.executeQuery();
			
			while(rtaQuery.next()) {
				
				System.out.println(rtaQuery.getString(1) + " " + rtaQuery.getString(2) + " " + rtaQuery.getString(3));
			}
			
			rtaQuery.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
