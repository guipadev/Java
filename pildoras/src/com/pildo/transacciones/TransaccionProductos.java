package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class TransaccionProductos {

	public static void main(String[] args) {
		
Connection miConexion = null;
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root",
					"Nataly89");
			
			// Trate las sentencias SQL como un bloque
			miConexion.setAutoCommit(false);

			Statement miStatement = miConexion.createStatement();
			
			String instruccionSql1 = "DELETE FROM productos WHERE PAISDEORIGEN='ITALIA'";
			
			String instruccionSql2 = "DELETE FROM productos WHERE PRECIO > 3000"; 
			
			String instruccionSql3 = "UPDATE productos SET PRECIO"; 
			
			boolean ejecutar = ejecutarTransaccion();
			
			if (ejecutar) {
				
				miStatement.executeUpdate(instruccionSql1);
				
				miStatement.executeUpdate(instruccionSql2);
				
				miStatement.executeUpdate(instruccionSql3);
				
				miConexion.commit();
				
				System.out.println("Se ejecuto las transacciones correctamente");
			
			} else {
				
				System.out.println("No se realizó cambio alguno en BBDD");
			}	
			
		
		} catch(Exception e) {
			
			try {
				miConexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("Algo salio mal y no se realizo	cambio alguno en BBDD");
		}

	}
	
	static boolean ejecutarTransaccion() {
		
		String ejecucion = JOptionPane.showInputDialog("¿Ejecutamos transaccion?");
		
		if (ejecucion.equals("Si")) return true;
		
		else return false;
	}

}
