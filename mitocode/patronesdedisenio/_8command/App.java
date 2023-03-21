package com.mitocode.patronesdedisenio._8command;


import com.mitocode.patronesdedisenio._8command.commands.Cuenta;
import com.mitocode.patronesdedisenio._8command.commands.DepositarImpl;
import com.mitocode.patronesdedisenio._8command.commands.Invoker;
import com.mitocode.patronesdedisenio._8command.commands.RetirarImpl;

/**
 * El patrón comando promueve la encapsulación de la petición de alguna operación bajo un método
 * entendamos como que nosotros no conocemos la implementación que necesitamos y solamente vamos
 * accedera una caja negra
 *
 * EJEMPLO
 * Cuenta (Receiver/Request) se realizara un retiro y deposito de la cta
 *
 * El objetivo de este pátron es tener un enfoque orientado a comandos
 */
public class App {

	public static void main(String[] args) {
		// Instanciamos una cuenta
		Cuenta cuenta = new Cuenta(1, 200);

		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.realizarOperaciones();
	}

}
