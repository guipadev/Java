package com.pildo._28coleccionesTreeSetArboles;

import java.util.Comparator;

public class ComparadorArticulos implements Comparator<Articulito> {

	@Override
	public int compare(Articulito arg0, Articulito arg1) {

		String descripcionA = arg0.getDescripcion();
		
		String descripcionB = arg1.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
	}
}
