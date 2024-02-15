package com.example.impl;

import com.example.api.File;

public class RealFile implements File {

	private String filename;
    private boolean downloaded = false;

    public RealFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void download() {
        if (!downloaded) {
            System.out.println("Descargando archivo" + filename + " desde el servidor remoto.");
            downloaded = true;
        } else {
            System.out.println("El archivo " + filename + " ya ha sido descargado.");
        }
    }

}
