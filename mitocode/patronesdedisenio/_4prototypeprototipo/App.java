package com.mitocode.patronesdedisenio._4prototypeprototipo;


import com.mitocode.patronesdedisenio._4prototypeprototipo.model.CuentaAHImpl;

/**
 * Objetivo pátron prototype es crear una nueva instancia con los valores clonados o copiados de otra instancia
 * Osea si nosotros tenemos un objeto con algunos valores ya establecidos  y queremos tener uno nuevo pero con los
 * mismos valores, sin pasar por la asignación manual uno por uno, podemos aprovechar el uso de este patrón
 *
 * VENTAJA
 * Imaginemos que tenemos un objeto muy grande con mucha información dentro y queremos tener una copia de esto
 * entonces para estar evitando crear una nueva instancia y asignar los valores, entonces se podria aplicar este
 * patron para apoyarnos en la copia de este objeto
 */
public class App {

	public static void main(String[] args) {

		CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
		cuentaAhorro.setMonto(200);

		//Cta ahora clonada, básada en la anterior, obteniendo una misma instancai del mismo tipo y mismos valores
		CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();
		//Por lo cual hacemos un casteo para que pueda reconocer la instancia
		CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

		System.out.println(cuentaAhorro);
		System.out.println(cuentaAhorro2);
		System.out.println(cuentaClonada);
		
		/*
		// Se va arrojar el mismo contenido en valor
		if (cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}
		//Aquí nos damos cuenta que al igual, las referencias en valor son diferentes por lo cual es false
		System.out.println(cuentaClonada == cuentaAhorro);
		*/

	}

}
