package procedimientoAlmacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultaProductos {

	public static void main(String[] args) {
		

		try {
			
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "Nataly89");
			
			
			CallableStatement miSentencia = miConexion.prepareCall("{call MUESTRA_PRODUCTOS}");
			
			ResultSet rs = miSentencia.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			rs.close();
			
		} catch (Exception e) {
			
			System.out.println("NO CONECTA!!");
			
			e.printStackTrace();

		}
		
	}

}
