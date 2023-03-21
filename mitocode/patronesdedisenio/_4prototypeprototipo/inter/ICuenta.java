package com.mitocode.patronesdedisenio._4prototypeprototipo.inter;

public interface ICuenta extends Cloneable {

	/**
	 * En esta interfaz se establece un método que va a devolver la misma interfaz
	 * Porque si devuelve la misma interfaz se supone que puede haber alguna clase que implemente esa interfaz
	 * y cumpla con este objetivo
	 */
	ICuenta clonar();

}
