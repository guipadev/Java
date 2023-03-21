package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.impl;


import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {

	@Override
	public void leerURL(String url) {		
		System.out.println("Conect�ndose a " + url);
	}

}
