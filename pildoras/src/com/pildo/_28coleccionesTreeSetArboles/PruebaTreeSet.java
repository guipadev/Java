package com.pildo._28coleccionesTreeSetArboles;

import java.util.Comparator;
import java.util.TreeSet;

public class PruebaTreeSet {

	public static void main(String[] args) {

		// TreeSet implementa comparable por lo cual lista sera organizada
		TreeSet<String> ordenarPersonas = new TreeSet<>();
		
		ordenarPersonas.add("Sandra");
		ordenarPersonas.add("Silvia");
		ordenarPersonas.add("Serafin");
		
		for (String people : ordenarPersonas) {
			System.out.println(people);
		}
		
		System.out.println("---------- IMPRESION LISTA OBJETO, ORDENADO Comparable ----------");
		
		Articulo primero = new Articulo(1, "Primer Articulo");
		Articulo segundo = new Articulo(2, "Segundo Articulo");
		Articulo tercero = new Articulo(3, "Tercer Articulo");
	
		TreeSet<Articulo> ordenarArticulos = new TreeSet<>();
		
		ordenarArticulos.add(tercero);
		ordenarArticulos.add(primero);
		ordenarArticulos.add(segundo);
		
		for (Articulo art : ordenarArticulos) {
			System.out.println(art.getDescripcion());
		}
		
		System.out.println("---------- IMPRESION LISTA OBJETO, ORDENADO Compartor ----------");
	
		Articulo comparadorArticulos2 = new Articulo();
		
		TreeSet<Articulo> ordenarArticulos2 = new TreeSet<Articulo>(comparadorArticulos2);
		
		ordenarArticulos2.add(primero);
		ordenarArticulos2.add(segundo);
		ordenarArticulos2.add(tercero);
		
		for (Articulo art : ordenarArticulos2) {
			System.out.println(art.getDescripcion());
		}
		
		System.out.println("---------- IMPRESION OTRA FORMA USAR Compartor ----------");
	
		Articulito primer = new Articulito(1, "Primer Articulo");
		Articulito segun = new Articulito(2, "Segundo Articulo");
		Articulito tercer = new Articulito(3, "Tercer Articulo");
		
		ComparadorArticulos comparaArt = new ComparadorArticulos();
		
		TreeSet<Articulito> ordenarArticulitos = new TreeSet<>(comparaArt);
		
		ordenarArticulitos.add(tercer);
		ordenarArticulitos.add(primer);
		ordenarArticulitos.add(segun);
		
		for (Articulito ar : ordenarArticulitos) {
			System.out.println(ar.getDescripcion());
		}
		
		System.out.println("---------- USO CLASES INTERNAS ANONIMAS ----------");
		
		TreeSet<Articulo> ordenarArt = new TreeSet<>(new Comparator<Articulo>() {
			
			public int compare(Articulo arg0, Articulo arg1) {

				String descripcionA = arg0.getDescripcion();
				
				String descripcionB = arg1.getDescripcion();
				
				return descripcionA.compareTo(descripcionB);
			}
		});
		
		ordenarArt.add(primero);
		ordenarArt.add(segundo);
		ordenarArt.add(tercero);
		
		for (Articulo art : ordenarArt) {
			System.out.println(art.getDescripcion());
		}
	}

}
