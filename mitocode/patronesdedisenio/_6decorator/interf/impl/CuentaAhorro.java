package com.mitocode.patronesdedisenio._6decorator.interf.impl;


import com.mitocode.patronesdedisenio._6decorator.interf.ICuentaBancaria;
import com.mitocode.patronesdedisenio._6decorator.model.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------");
		System.out.println("Se abri� una cuenta de Ahorros");
		System.out.println("Cliente: " + c.getCliente());		
	}

}