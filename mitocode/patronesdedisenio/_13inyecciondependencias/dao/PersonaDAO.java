package com.mitocode.patronesdedisenio._13inyecciondependencias.dao;


import com.mitocode.patronesdedisenio._13inyecciondependencias.model.Persona;

public interface PersonaDAO extends CRUD<Persona>{

	void mostrarNombre();
	void setConexion(IConexion conexion);
	
}
