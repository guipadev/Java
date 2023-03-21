package com.mitocode.patronesdedisenio._10observer;

import com.mitocode.patronesdedisenio._10observer.observer.PesoARGObservador;
import com.mitocode.patronesdedisenio._10observer.observer.PesoMXObservador;
import com.mitocode.patronesdedisenio._10observer.observer.SolObservador;
import com.mitocode.patronesdedisenio._10observer.observer.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 d�lares obtendr� : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 d�lares obtendr� : ");
		subject.setEstado(100);
	}
}
