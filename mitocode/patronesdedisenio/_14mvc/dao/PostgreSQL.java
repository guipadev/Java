package com.mitocode.patronesdedisenio._14mvc.dao;

public class PostgreSQL implements Conexion{

	@Override
	public void conectar() {
		System.out.println("Conexi�n a POSTGRESQL");
	}

}
