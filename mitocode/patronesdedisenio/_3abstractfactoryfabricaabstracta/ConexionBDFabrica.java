package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta;


import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.FabricaAbstracta;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionBD;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionREST;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.impl.*;

/**
 * Se implementa la interfaz con el objetivo de que podamos indicar que si el usuario selecciono la fabrica BD
 * igual indiques cual es el indetificador para que retorne la instancia propia de esa familiar de BD
 * obviamente al implementar la interfaz, se tiene en este caso que escribir los 2 métodos de dicha interfaz
 *
 * Pero el segundo se deja como null porque el objetivo de esta clase solo es BD
 */
public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
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

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
