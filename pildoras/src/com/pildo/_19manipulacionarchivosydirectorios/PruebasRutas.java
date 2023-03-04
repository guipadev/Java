package com.pildo._19manipulacionarchivosydirectorios;

import java.io.File;

public class PruebasRutas {

	public static void main(String[] args) {
		
		File archivo = new File("ejemploArchivo"); //Nombre archivo o directorio
		//Imprime ruta absoluta de archivo
		System.out.println(archivo.getAbsolutePath());
		//Validar existencia archivo
		System.out.println(archivo.exists());
	}

}
