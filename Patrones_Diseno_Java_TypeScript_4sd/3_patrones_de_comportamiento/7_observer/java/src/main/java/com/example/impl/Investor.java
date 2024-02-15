package com.example.impl;

import com.example.api.Observer;

public class Investor implements Observer {
	
	private String name;

    public Investor(String name) {
        this.name = name;
    }

	@Override
	public void update(String message) {
		System.out.println(name + " recibió una actualización: " + message);

	}

}
