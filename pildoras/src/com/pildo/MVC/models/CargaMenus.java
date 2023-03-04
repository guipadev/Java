package MVC.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class CargaMenus {
 
	Conexion miConexion;
	
	public ResultSet rs;
	
	public ResultSet rs2;
	
	public CargaMenus() {
		
		miConexion = new Conexion();
	}
	
	public String ejecutaConsultas() {
		
		Productos miProducto = null;
		
		Connection accesoBBDD = miConexion.dameConexion();
		
		try {
			
			Statement secciones = accesoBBDD.createStatement();
			
			Statement paises = accesoBBDD.createStatement();
			
			rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM productos");
			
			rs2 = secciones.executeQuery("SELECT DISTINCTROW PAISDEORIGEN FROM productos");
			
			miProducto = new Productos();
				
			miProducto.setSeccion(rs.getString(1)); 
			
			miProducto.setSeccion(rs2.getString(1)); 
			
			rs.close();
			
			rs2.close();
			
			accesoBBDD.close();
			
		} catch (Exception e) {	}
		// Devuelva un producto
		return miProducto.getSeccion();
	}
}	
	/*
	// Devolver un objecto de tipo ResultSet
	public ResultSet ejecutaConsultas() {
		// Establece conexión a BD
		Connection accessoBBDD = miConexion.dameConexion();
		try {
			// Crear la consulta
			Statement secciones = accessoBBDD.createStatement();
			return rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM productos");
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	*/
	

