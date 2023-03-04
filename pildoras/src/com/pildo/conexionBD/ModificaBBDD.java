package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {

	public static void main(String[] args) {
		
		try {
			// Crear conexión
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "Nataly89");
		
			// Crear objeto statement
			Statement miStatement = miConexion.createStatement();
			
			// SQL Insertar
			// String instruccionSQL = "INSERT INTO productos (CODIGOARTICULO, SECCION, NOMBREDEARTICULO, PRECIO, FECHA, IMPORTADO, PAISDEORIGEN, FOTO) VALUES ('4', 'FERRETERIA', 'TEJAS', '380000', '2019-02-20', 'TRUE', 'CHINA', '')";
			
			// SQL Actualizar
			// String instruccionSQL = "UPDATE productos SET PRECIO=PRECIO*2 WHERE CODIGOARTICULO = '2'";
			
			// SQL Eliminar
			String instruccionSQL = "DELETE FROM productos WHERE CODIGOARTICULO = '4'";
			
			// INSERT, UPDATE or DELETE
			miStatement.executeUpdate(instruccionSQL);
			
			System.out.println("Script SQL ejecutado correctamente");
			
		} catch (Exception e) {
			
			System.out.println("NO CONECTA!!");
			
			e.printStackTrace();
		}

	}

}
