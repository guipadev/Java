package com.charlycimino.$44TRY_CATCH_FINALLYCapturarEXCEPCIONES.checkedexceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTXTs {
    public void mostrarTxt(String ruta) throws FileNotFoundException, IOException {
        File elArchivo = new File(ruta);        
        BufferedReader br = new BufferedReader(new FileReader(elArchivo));
        System.out.println( br.readLine());
    }
}
