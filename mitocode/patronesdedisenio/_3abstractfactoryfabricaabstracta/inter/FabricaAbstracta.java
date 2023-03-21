package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter;

/**
 * Al tener una fábrica independiente para cada familia puedo crear una interfaz llamada fábrica abstracta
 * En el cual se define para obtener la base de datos o motor rest de acuerdo a la familia que estoy necesitando
 *
 */
public interface FabricaAbstracta {

	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
	
}
