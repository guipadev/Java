package com.pildo._17streamsManejoArchivosAccesoFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeyendoByte {

	public static void main(String[] args) {
		
		int contador = 0;
		
		try {
			FileInputStream archivoLectura = new FileInputStream("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/hacker.jpg");
	
			boolean finalArch = false;
			
			while (!finalArch) {
				//Al leer todos los bytes de la imagen igual devolvera -1
				int byteEntrada = archivoLectura.read();
				
				if(byteEntrada == -1)
					finalArch = true;
				
				System.out.println(byteEntrada);
			
				contador++;
			}
			archivoLectura.close();
		} catch (IOException e) {
			System.out.println("Error al acceder a la imagen");
		}
		
		System.out.println("Cantidad bytes de img: " + contador);
		
	}

}
