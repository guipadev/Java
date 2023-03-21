package com.mitocode.patronesdedisenio._2factoryfabrica;


import com.mitocode.patronesdedisenio._2factoryfabrica.inter.IConexion;
import com.mitocode.patronesdedisenio._2factoryfabrica.inter.impl.*;

public class ConexionFabrica {

	/**
	 * Método público que devuelva una interfaz conexión, ya que el objetivo de este pátron es devolver una
	 * instancia segun lo pida el usuario
	 */
	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}
}
