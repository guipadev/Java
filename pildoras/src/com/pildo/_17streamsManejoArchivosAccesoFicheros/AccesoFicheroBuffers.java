package com.pildo._17streamsManejoArchivosAccesoFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheroBuffers {

	public static void main(String[] args) {
		
		LeerArchivo accediendo = new LeerArchivo();
		
		accediendo.lee();
	}
}

class LeerArchivo {
	
	public void lee() {
		 try {
			FileReader entrada = new FileReader("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/textogrande.txt");
		
			//Almacenar memoria intermedia el archivo
			BufferedReader mibuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			while (linea != null) {
			
				linea = mibuffer.readLine();
				
				if (linea != null) //No imprimir última linea como null
				
				System.out.println(linea);
			}
			entrada.close();			
		 } catch (IOException e) {
			//e.printStackTrace();
			System.out.println("No se encontro el archivo");
		}
	}
}