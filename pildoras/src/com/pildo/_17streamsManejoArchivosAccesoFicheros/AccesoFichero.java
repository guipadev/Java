package com.pildo._17streamsManejoArchivosAccesoFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

	public static void main(String[] args) {
		
		LeerFichero accediendo = new LeerFichero();
		
		accediendo.lee();
	}
}

class LeerFichero {
	
	public void lee() {
		 try {
			FileReader entrada = new FileReader("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/ejemplo.txt");
		
			//Lectura archivo
			//int scArch = entrada.read();
			int scArch = 0; //empiece a escribir desde primer letra
			
			while (scArch != -1) {
				scArch = entrada.read();
				
				char letra = (char) scArch;
				
				System.out.print(letra);
			}
			entrada.close();			
		 } catch (IOException e) {
			//e.printStackTrace();
			System.out.println("No se encontro el archivo");
		}
	}
}