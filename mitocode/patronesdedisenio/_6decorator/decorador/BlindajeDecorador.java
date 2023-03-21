package com.mitocode.patronesdedisenio._6decorator.decorador;


import com.mitocode.patronesdedisenio._6decorator.interf.ICuentaBancaria;
import com.mitocode.patronesdedisenio._6decorator.model.Cuenta;

/**
 * Extendemos de la clase abstracta
 */
public class BlindajeDecorador extends CuentaDecorador {

	/**
	 * proveemos la instancia de la implementacion de la interfaz
	 */
	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}

	/**
	 * Aquí agregamos funcionalidad adicional
	 */
	@Override
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
	}

	public void agregarBlindaje(Cuenta c) {		
		System.out.println("Se agreg� blindaje a la cuenta del cliente " + c.getCliente());
	}

}
