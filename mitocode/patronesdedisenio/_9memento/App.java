package com.mitocode.patronesdedisenio._9memento;


import com.mitocode.patronesdedisenio._9memento.memento.Caretaker;
import com.mitocode.patronesdedisenio._9memento.memento.Juego;
import com.mitocode.patronesdedisenio._9memento.memento.Originator;

/**
 * https://youtu.be/Q5CL1b-FD9E
 * Este pátron promueve el guardado del estado de alguna operación de lo que estás trabajando en tú app
 * para eso vamos a tener como si estuvieramos haciendo un checkpoint de algún video juego para que podamos
 * restaurar ese estado cuando lo solicitemos
 *
 * Si no hacemos el uso del operador new por teoria de POO vamos a estar trabajando bajo la misma referencia
 * en memoria, al validar las posiciones todas estarian apuntando al mismo bloque de memoria
 * y se tendra el mismo valor final
 */
public class App {

	public static void main(String[] args) {
		String nombreJuego = "Crash Bandicoot";
		
		Juego juego = new Juego();
		juego.setNombre(nombreJuego);
		// Apenes inicie el juego tendremos un checkpoint iniciando en 1
		juego.setCheckpoint(1);

		// Se guarda todos los checkpoints del juego
		Caretaker caretaker = new Caretaker();
		// Responsable que guarda el estado del objeto en analisis
		Originator originator = new Originator();

		// Creamos una nueva instancia juego para indicar que hemos avanzado
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(2);
		// Pero aquí se utiliza originator 	para guardar el estado en ese punto
		originator.setEstado(juego);

		// Instanciamos y vamos guardando el avance 1 punto en el transcurso del tiempo
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(3);		
		originator.setEstado(juego);

		/**
		 * Cuando quiero confirmar un punto en el transcurso del tiempo, que ese estado  quiero recuperarlo
		 * más adelante tengo que utilizar la clase caretaker, para tener el método que viene sera esta dentro
		 * de una lista y guardar a traves de originator
		 * caretaker.addMemento(originator.guardar()); // ESTADO POSICION 0
		 */
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(4);

		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 1

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(5);
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 2

		originator.setEstado(juego);
		originator.restaurar(caretaker.getMemento(1));

		juego = originator.getEstado();
		System.out.println(juego);
	}

}
