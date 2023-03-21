package com.mitocode.patronesdedisenio._11strategy;


import com.mitocode.patronesdedisenio._11strategy.strategy.AntivirusAvanzado;
import com.mitocode.patronesdedisenio._11strategy.strategy.Contexto;

/**
 * Definir familias de algoritmos, encapsularlos y hacerlos intercambiables
 * este patron permite que los algoritmos sean independientes de los clientes
 * que están usándolo
 *
 * En este ejmplo tendremos la interfaz estrategia el cual tien un método analizar
 * vamos a simular el analisis de un antivirus simple y un avanzado
 *
 */
public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}
