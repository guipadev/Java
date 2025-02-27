package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.impl;


import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionBD;

public class ConexionMySQL implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conect� a MySQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
}
