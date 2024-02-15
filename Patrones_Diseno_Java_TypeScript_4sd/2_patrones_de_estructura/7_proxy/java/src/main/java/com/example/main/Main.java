package com.example.main;

import com.example.api.File;
import com.example.impl.FileProxy;

public class Main {

	public static void main(String[] args) {
		File file1 = new FileProxy("archivo1.txt");
		File file2 = new FileProxy("archivo2.txt");

		//Descargamos el primer archivo (se descargará desde el servidor) 
		file1.download();
		file1.download();

		//Descargamos el segundo archivo (ya se descargó antes)
		file2.download();
		file2.download();

	}

}
