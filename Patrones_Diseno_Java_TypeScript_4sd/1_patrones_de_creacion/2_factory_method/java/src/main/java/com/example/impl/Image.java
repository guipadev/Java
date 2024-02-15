package com.example.impl;

import com.example.api.Media;

public class Image implements Media {
    
    @Override
    public String getDescription() {
        return "Esto es una imagen.";
    }
}
