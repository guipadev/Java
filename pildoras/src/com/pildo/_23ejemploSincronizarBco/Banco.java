package com.pildo._23ejemploSincronizarBco;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {

	private final double[] cuentas;
	// Bloquear code // comentado por uso synchronized
	// private Lock cierreBanco = new ReentrantLock();
	// private Condition saldoSuficiente;
	
	public Banco() {
		// Creación de cuentas
		cuentas = new double[100];
		
		// Inicializar las cuenta con 2K euros
		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;	
		}
		// Cierre banco de acuerdo a condicion
		// saldoSuficiente = cierreBanco.newCondition(); // comentado por uso synchronized
	}
	
	// Al utilizar synchronized van a sobrar los cierres implicitos y las condiciones 
	public synchronized void transferencias(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		
		// Bloquear hilo mientras realiza una operacion
		// cierreBanco.lock(); // comentado por uso synchronized
		
		//try {
		
			// No supere el saldo de la cuenta
			while (cuentas[cuentaOrigen] < cantidad) {
				
				wait();
				
				// System.out.println("---> CANTIDAD INSUFICIENTE: " + cuentaOrigen + "...SALDO: $" + cuentas[cuentaOrigen] + "..." + cantidad);
				// return; sin este siempre se va ejecutar si o si la operación del hilo
			
				// Mientras la condicion se cumple estara a la espera
				// saldoSuficiente.await(); // Adiciona excepción, // comentado por uso synchronized
			} 
			// else { System.out.println("---CANTIDAD OK--->" + cuentaOrigen); }
			
			// Conocer hilo que va a realizar transferencia
			System.out.println(Thread.currentThread());
			
			cuentas[cuentaOrigen] -= cantidad; // Dinero que sale de cta origen
			
			System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
			
			// Aumento cuenta destino
			cuentas[cuentaDestino] += cantidad;
			
			System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());
			
			// Despierta los hilos que estan a la espera, para que continuen transferencias
			notifyAll();
			// saldoSuficiente.signalAll(); // comentado por uso synchronized
		/*} 
		// comentado por uso synchronized
		finally {
			// Desbloquear tan pronto hilo termine operacion
			// cierreBanco.unlock();
		}*/	
	}
	
	public double getSaldoTotal() {
		double sumaCuentas = 0;
		
		for (double almacena : cuentas) {
			sumaCuentas += almacena;
		}
		
		return sumaCuentas;
	}
}
