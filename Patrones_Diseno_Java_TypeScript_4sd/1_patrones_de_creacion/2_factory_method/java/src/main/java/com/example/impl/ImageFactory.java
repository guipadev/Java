package com.example.impl;

import com.example.api.Media;
import com.example.api.MediaFactory;

public class ImageFactory extends MediaFactory {

    @Override
    public Media createMedia() {
        return new Image();
    }
    
}
