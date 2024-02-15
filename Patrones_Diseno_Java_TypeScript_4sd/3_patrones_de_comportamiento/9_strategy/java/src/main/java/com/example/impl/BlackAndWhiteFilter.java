package com.example.impl;

import com.example.api.ImageFilter;

public class BlackAndWhiteFilter implements ImageFilter {

	@Override
	public void apply(String fileName) {
		System.out.println("Aplicando filtro blanco y negro a " + fileName);
	}

}
