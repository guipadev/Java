package com.pildo._22sincronizandoHilos;

public class SincronizarHilosDos {

	public static void main(String[] args) {
		
		HilosVarios hilo1 = new HilosVarios();
		// Al pasar como parametro indicamos que no empieza hasta que termine el hilo 1
		HiloVariosDos hilo2 = new HiloVariosDos(hilo1);
		
		hilo2.start();
		hilo1.start();
		
		// Luego imprime por último el hilo del main
		System.out.println("Hilo main liberado, y luego se ejecutan demas hilos");
	}

}
