package com.example.impl;

import com.example.api.ImageFilter;

public class ImageProcessor {
	
	private ImageFilter filter;

    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    public void processImage(String fileName) {
        filter.apply(fileName);
    }

}
