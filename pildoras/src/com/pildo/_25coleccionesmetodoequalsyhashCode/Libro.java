package com.pildo._25coleccionesmetodoequalsyhashCode;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String autor;
	private int ISBN;
	
	public Libro(String titulo, String autor, int iSBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
	}
	
	/*// forma manual
	public boolean equals(Object obj) {
		
		if (obj instanceof Libro) {
		
			Libro otro = (Libro)obj;
			
			if (this.ISBN == otro.ISBN) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	*/
	

	public String getDatos() {
		return "El título es: " + titulo + ", el autor es: " + autor + ", y el ISBN es: " + ISBN;
	}
	
	// Generado automaticamente el campo que hace la diferencia

	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}
	

}
