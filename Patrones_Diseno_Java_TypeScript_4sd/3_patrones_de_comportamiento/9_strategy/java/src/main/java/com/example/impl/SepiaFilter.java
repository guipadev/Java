package com.example.impl;

import com.example.api.ImageFilter;

public class SepiaFilter implements ImageFilter {
    @Override
    public void apply(String fileName) {
        System.out.println("Aplicando filtro sepia a " + fileName);
    }
}

