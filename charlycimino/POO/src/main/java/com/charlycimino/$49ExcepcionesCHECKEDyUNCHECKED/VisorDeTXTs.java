package com.charlycimino.$49ExcepcionesCHECKEDyUNCHECKED;

import java.io.*;

public class VisorDeTXTs {

    public void mostrarTxt(String ruta) throws FileNotFoundException, IOException {
        File elArchivo = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(elArchivo));
        System.out.println( br.readLine());
    }
}
