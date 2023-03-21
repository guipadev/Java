package com.mitocode.patronesdedisenio._12dao;

import com.mitocode.patronesdedisenio._12dao.dao.CRUD;
import com.mitocode.patronesdedisenio._12dao.dao.PersonaDAOImpl;
import com.mitocode.patronesdedisenio._12dao.model.Persona;

/**
 * Extraer la logica de acceso de un conjunto de operaciones, es muy común utilizar esto para
 * poder acceder a operaciones de base de datos
 */
public class App {
	
	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
		
		Persona per = new Persona();
		per.setNombres("MitoCode");
		dao.registrar(per);
	}

}
