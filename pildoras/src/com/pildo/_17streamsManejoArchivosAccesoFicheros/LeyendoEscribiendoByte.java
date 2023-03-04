package com.pildo._17streamsManejoArchivosAccesoFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeyendoEscribiendoByte {

	public static void main(String[] args) {
		
		int contador = 0;
		
		int datosEntrada[] = new int[270121]; //valor obtenido de la lectura de byte de la img
		
		try {
			FileInputStream archivoLectura = new FileInputStream("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/hacker.jpg");
	
			boolean finalArch = false;
			
			while (!finalArch) {
				//Al leer todos los bytes de la imagen igual devolvera -1
				int byteEntrada = archivoLectura.read();
				
				if(byteEntrada != -1)
					datosEntrada[contador] = byteEntrada;
				
				else
					finalArch = true;
				
				System.out.println(datosEntrada[contador]);
				
				contador++;
			}
			archivoLectura.close();
		} catch (IOException e) {
			System.out.println("Error al acceder a la imagen");
		}
		System.out.println(contador);
		
		//Crear imagen, duplicarla
		crearFichero(datosEntrada);
	}
	
	static void crearFichero(int datosNuevoFichero[]) {
		try {
			FileOutputStream ficheroNuevo = new FileOutputStream("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/hacker_copia.jpg");
			
			for(int i = 0; i < datosNuevoFichero.length; i++) {
				ficheroNuevo.write(datosNuevoFichero[i]);
			}
			ficheroNuevo.close();
			
		} catch (IOException e) {
			System.out.println("Error al crear el archivo");
		}
	}
	
}
