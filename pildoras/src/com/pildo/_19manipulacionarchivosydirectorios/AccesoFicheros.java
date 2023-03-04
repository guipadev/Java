package com.pildo._19manipulacionarchivosydirectorios;

import java.io.File;

public class AccesoFicheros {

	public static void main(String[] args) {
		
		//Compatibilidad de la ruta con cualquier OS
		File ruta = new File(File.separator +"home" + File.separator + "yamid" + File.separator + "Documents" + File.separator +  "eclipse-workspace/curso_java_pildorasinformaticas/src");
	
		System.out.println(ruta.getAbsolutePath());
		
		//Array para obtener todo lo que hay en la ruta
		String[] nombreArchivos = ruta.list();
		
		
		for (int i = 0; i < nombreArchivos.length; i++) {
			System.out.println(nombreArchivos[i]);
			//validar ruta y contenido
			File f = new File(ruta.getAbsolutePath(),nombreArchivos[i]);
			//Si se encuentra una carpeta, recorrer y mostrar
			if (f.isDirectory()) {
				String[] archivosSubcarpeta = f.list();
				
				for(String e : archivosSubcarpeta) {
					System.out.println(e);
				}
			}
		}
	}

}
