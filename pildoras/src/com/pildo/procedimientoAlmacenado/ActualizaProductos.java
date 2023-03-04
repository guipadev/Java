package procedimientoAlmacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ActualizaProductos {

	public static void main(String[] args) {

		int nPrecio = Integer.parseInt(JOptionPane.showInputDialog("Introduce precio"));
		
		String nArticulo = JOptionPane.showInputDialog("Introduce nombre articulo");
		
		try {

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root",
					"Nataly89");

			CallableStatement miSentencia = miConexion.prepareCall("{call ACTUALIZA_PROD(?,?)}");

			miSentencia.setInt(1, nPrecio);
			
			miSentencia.setString(2, nArticulo);
			
			miSentencia.execute();
			
			System.out.println("Actualización OK");
			
		} catch (Exception e) {

			System.out.println("NO CONECTA!!");

			e.printStackTrace();

		}

	}

}
