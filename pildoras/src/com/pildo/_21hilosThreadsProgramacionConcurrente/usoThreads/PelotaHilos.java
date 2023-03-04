package com.pildo._21hilosThreadsProgramacionConcurrente.usoThreads;

import java.awt.Component;

public class PelotaHilos implements Runnable {

	private Pelota pelota;
	private Component componente;
	
	public PelotaHilos(Pelota unaPelota, Component unComponente) {
		super();
		this.pelota = unaPelota;
		this.componente = unComponente;
	}

	public void run() {		
		System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());
		/*
		for (int i = 1; i <= 3000; i++){
			
			pelota.mueve_pelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
			
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
				//System.exit(0); //salir del programa
			}
		}
		*/
		
		//Mientras no se interrumpa el hilo ejecutar indefinidamente
		while(!Thread.currentThread().isInterrupted()) { //otra opción !Thread.interrupted()
			pelota.mueve_pelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
			
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Estado del hilo al terminar: " + Thread.currentThread().isInterrupted());
	}

}
