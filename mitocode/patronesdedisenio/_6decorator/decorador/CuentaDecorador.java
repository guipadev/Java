package com.mitocode.patronesdedisenio._6decorator.decorador;


import com.mitocode.patronesdedisenio._6decorator.interf.ICuentaBancaria;
import com.mitocode.patronesdedisenio._6decorator.model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria {

	protected ICuentaBancaria cuentaDecorada;

	/**
	 * Recibe la implementación de cualquier interfaz en este caso puede ser cta ahorro o corriente
	 */
	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}

	/**
	 * Método de acuerdo a la implementación
	 */
	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}	
	
}
