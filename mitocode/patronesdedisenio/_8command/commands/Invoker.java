package com.mitocode.patronesdedisenio._8command.commands;

import java.util.ArrayList;
import java.util.List;

/**
 * Es el responsable de apilar las informaciones y ejecutarlas
 */
public class Invoker {

	private List<IOperacion> operaciones = new ArrayList<>();

	/**
	 * Recibimos las operaciones sea un deposito o retiro, n operaciones
	 * que se almacenan a la lista
	 */
	public void recibirOperacion(IOperacion operacion) {
		this.operaciones.add(operacion);
	}

	/**
	 * Se itera la var operaciones y por cada iteración encontrada se ejecuta una lambda
	 */
	public void realizarOperaciones() {
		this.operaciones.forEach(x -> x.execute());
		this.operaciones.clear();
	}

}
