package com.pildo._22sincronizandoHilos;

public class HilosVarios extends Thread {

	public void run() {
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Ejecutando Hilo " + getName());
			
			// Velocidad ejecución del hilo 1
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
