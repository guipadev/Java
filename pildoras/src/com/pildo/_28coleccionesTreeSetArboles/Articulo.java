package com.pildo._28coleccionesTreeSetArboles;

import java.util.Comparator;

public class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

	private int numeroArticulo;
	private String descripcion;
	
	public Articulo() {}
	
	public Articulo(int num, String desc) {
		numeroArticulo = num;
		descripcion = desc;
	}
	
	@Override
	public int compareTo(Articulo o) {
		
		return numeroArticulo - o.numeroArticulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int compare(Articulo arg0, Articulo arg1) {

		String descripcionA = arg0.getDescripcion();
		
		String descripcionB = arg1.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
	}

}
