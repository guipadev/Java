package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// Las 2 sentencias deben realizarse en bloque, no una si y la otra no, si una falla, la otra tambien no debe hacer nada
public class InsertarClientesPedidos {

	public static void main(String[] args) {
		
		Connection miConexion = null;
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root",
					"Nataly89");
			
			// Trate las sentencias SQL como un bloque
			miConexion.setAutoCommit(false);

			Statement miStatement = miConexion.createStatement();
			
			String instruccionSql1 = "INSERT INTO CLIENTES (CODIGOCLIENTE, EMPRESA, DIRECCION) VALUES ('CT84', 'IBM', 'CALLE FALSA 123')"; 
 
			miStatement.executeUpdate(instruccionSql1);
			
			String instruccionSql2 = "INSERT INTO PEDIDOS (NUMERODEPEDIDO, CODIGOCLIENTE, FECHAPEDIDO) VALUES ('82', 'CT84', '25-04-2020')"; 
			 
			miStatement.executeUpdate(instruccionSql2);
			
			// Indicar donde termina el bloque SQL
			miConexion.commit();
			
			System.out.println("Datos INSERTADOS correctamente!!");
			
		} catch (Exception e) {
			
			System.out.println("ERROR en la INSERCCIÓN  de datos!!");
			
			try {
				// Ejecute todo el SQL no una parte
				miConexion.rollback();
				
			} catch (Exception e2) {
				
				e2.printStackTrace();
			}
			
			e.printStackTrace();
		}
		
	}

}
