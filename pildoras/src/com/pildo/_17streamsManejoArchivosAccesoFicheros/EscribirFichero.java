package com.pildo._17streamsManejoArchivosAccesoFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

public static void main(String[] args) {
		
		Escribiendo accede = new Escribiendo();
		
		accede.escribir();
	}
}

class Escribiendo {
	
	public void escribir() {
		String frase = "Prueba de escritura";
		
		try {
			FileWriter escritura = new FileWriter("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/texto_nuevo.txt"); //poner , true adicionara nuevo texto al archivo existente y no sobrescribe
		
			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}