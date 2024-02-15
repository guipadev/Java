package com.example.impl;

import com.example.api.Media;

public class Video implements Media {
    
    @Override
    public String getDescription() {
        return "Esto es un video.";
    }
}

