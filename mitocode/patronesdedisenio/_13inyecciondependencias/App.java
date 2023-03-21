package com.mitocode.patronesdedisenio._13inyecciondependencias;

import com.mitocode.patronesdedisenio._13inyecciondependencias.dao.*;

/**
 * Se suministran objetos a una clase en lugar de ser la propia clase que cree dichos objetos
 *
 */
public class App {

	public static void main(String[] args) {
		IConexion cx1 = new ConexionMySQL("mitocode", "7482", "localhost");
		
		IConexion cx2 = new ConexionPostgre("mitocode", "7482", "192.168.1.1");
		
		PersonaDAO dao = new PersonaDAOImpl();
		dao.setConexion(cx1);
		
		dao.listarTodos();
		
	}
}
