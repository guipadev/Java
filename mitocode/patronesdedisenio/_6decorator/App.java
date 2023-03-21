package com.mitocode.patronesdedisenio._6decorator;


import com.mitocode.patronesdedisenio._6decorator.decorador.BlindajeDecorador;
import com.mitocode.patronesdedisenio._6decorator.interf.ICuentaBancaria;
import com.mitocode.patronesdedisenio._6decorator.interf.impl.CuentaAhorro;
import com.mitocode.patronesdedisenio._6decorator.model.Cuenta;

/**
 * Lo que ofrece el pátron decorador es que podamos agregar funcionalidades a un objeto existente sin alterar
 * su estructura, no hay necesidad de modificar el código de la clase base, es decir para indicar por ejemplo
 * que herede de otra clase que tienen una funcionalidad que necesitamos o agregar algunos atributos que quizas
 * nos puede hacer falta
 *
 * EJEMPLO:
 * En esta aplicación un cliente se acerca al banco abrir una cuenta y va abrir una cuenta de ahorro y el asesor
 * le indica si desea agregar una proteccion (seguro), como este escenario es opcional, ya que no todos los clientes
 * van a querer tomar la protección
 * Podemos definir una clase normal y una clase decorada con esta caracteristica
 */
public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "MitoCode");
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		//cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}

}
