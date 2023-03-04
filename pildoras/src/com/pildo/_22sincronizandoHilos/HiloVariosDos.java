package com.pildo._22sincronizandoHilos;

public class HiloVariosDos extends Thread {

	private Thread hilo;
	
	public HiloVariosDos(Thread hilo) {
		this.hilo = hilo;
	}
	
	public void run() {
		
		// No comience el hilo hasta que tenga el valor en parametro
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
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