package com.mitocode.patronesdedisenio._2factoryfabrica.inter.impl;

import com.mitocode.patronesdedisenio._2factoryfabrica.inter.IConexion;

public class ConexionVacia implements IConexion {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}
