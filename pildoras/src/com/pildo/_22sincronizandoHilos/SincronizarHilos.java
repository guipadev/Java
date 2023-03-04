package com.pildo._22sincronizandoHilos;

public class SincronizarHilos {

	public static void main(String[] args) {
		
		HilosVarios hilo1 = new HilosVarios();
		// Al pasar como parametro indicamos que no empieza hasta que termine el hilo 1
		HilosVarios hilo2 = new HilosVarios();
		
	
		//Secuencia manual de hilos
		hilo1.start();
		// Hasta que no termine/muera hilo no empezara a ejecutarse el otro
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		hilo2.start();

		// Si no se pone esta parte imprimira que se ha terminado tareas y seguira ejecutando
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		// Luego imprime por último el hilo del main
		System.out.println("Hilo main liberado, y luego se ejecutan demas hilos");
	}

}
