package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.impl;


import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionBD;

public class ConexionVacia implements IConexionBD {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}
