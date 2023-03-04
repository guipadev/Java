package MVC.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EjecutarConsultas {

	// private String pruebas;

	private Conexion miConexion;

	private ResultSet rs;

	private PreparedStatement enviaConsultaSeccion;

	private final String consultaSeccion = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM productos WHERE SECCION=?";

	private PreparedStatement enviaConsultaPais;

	private final String consultaPais = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM productos WHERE PAISDEORIGEN=?";

	private PreparedStatement enviaConsultaTodos;

	private final String consultaTodos = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM productos WHERE PAISDEORIGEN=? AND SECCION=?";
	
	public EjecutarConsultas() {

		miConexion = new Conexion();
	}

	public ResultSet filtrarBBDD(String seccion, String pais) {

		Connection conecta = miConexion.dameConexion();

		rs = null;

		try {

			if (!seccion.equals("Todos") && pais.equals("Todos")) {

				enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);
				
				enviaConsultaSeccion.setString(1, seccion);
				
				rs = enviaConsultaSeccion.executeQuery();
				
			} else if (seccion.equals("Todos") && !pais.equals("Todos")) {

				enviaConsultaPais = conecta.prepareStatement(consultaPais);
				
				enviaConsultaPais.setString(1, pais);
				
				rs = enviaConsultaPais.executeQuery();
				
			} else {
				
				enviaConsultaTodos = conecta.prepareStatement(consultaTodos);
				
				enviaConsultaTodos.setString(1, pais);
				
				enviaConsultaTodos.setString(2, seccion);
				
				rs = enviaConsultaTodos.executeQuery();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return rs;
	}
}
