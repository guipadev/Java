package com.pildo._28coleccionesTreeSetArboles;

import java.util.Comparator;

public class Articulito implements Comparable<Articulito> {

	private int numeroArticulo;
	private String descripcion;
	
	public Articulito(int num, String desc) {
		numeroArticulo = num;
		descripcion = desc;
	}
	
	@Override
	public int compareTo(Articulito o) {
		
		return numeroArticulo - o.numeroArticulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}