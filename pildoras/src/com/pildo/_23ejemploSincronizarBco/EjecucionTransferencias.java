package com.pildo._23ejemploSincronizarBco;

public class EjecucionTransferencias implements Runnable {

	private Banco banco;
	private int cuentaOrigen;
	private double cantidadMaxima;

	public EjecucionTransferencias(Banco bco, int ctaOrigen, double max) {
		banco = bco;
		cuentaOrigen = ctaOrigen;
		cantidadMaxima = max;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// Cuenta al azar
				int cuentaDestino = (int) (100 * Math.random());
				// Cantidad transferirir
				double cantidadDeposito = cantidadMaxima * Math.random();

				banco.transferencias(cuentaOrigen, cuentaDestino, cantidadDeposito);

				// Lentitud hilos

				Thread.sleep((int) (Math.random() * 10));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
