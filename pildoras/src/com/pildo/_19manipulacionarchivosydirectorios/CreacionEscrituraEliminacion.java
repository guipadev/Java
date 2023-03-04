package com.pildo._19manipulacionarchivosydirectorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreacionEscrituraEliminacion {

	public static void main(String[] args) {
		
		File ruta = new File("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/nuevo_directorio/");
		//crear directorio
		ruta.mkdir();
		
		File ruta2 = new File("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/newarchivo.txt");

		String archivoDestino = ruta2.getAbsolutePath();
		
		//crear archivo
		try {
			ruta2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Escribiendo accede = new Escribiendo();
		
		accede.escribir(archivoDestino);
		
		//Eliminar archivo o directorio de acuerdo ruta
		File ruta3 = new File("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/vacio.txt");
		ruta3.delete();
	}
}

class Escribiendo {
	
	public void escribir(String rutaArchivo) {
		
		String frase = "Esto es un ejemplo, espero que salga";
	
		try {
			FileWriter escritura = new FileWriter(rutaArchivo);
			
			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}