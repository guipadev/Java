package com.charlycimino.$53_try_with_resources_como_autoliberar_recursos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTXTs {

    /**
     * Java podra iberar los recursos siempre que implementen la interface AutoCLoseable
     * la cual la usa la clase BufferedReader implementada asi cerrando y liberando recursos
     */
    public void mostrarTxt(String ruta) {
        File elArchivo = new File(ruta);
        try (BufferedReader br = new BufferedReader(new FileReader(elArchivo));) {
            System.out.println( br.readLine());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
            throw new RuntimeException("Error inesperado en el catch");
        }
    }
}
