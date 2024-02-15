package com.example.impl;

public class Television extends Device {
	public Television(String name) {
		super(name);
	}

	public void adjustVolume(int volume) {
        System.out.println("Ajustando el volumen de la televisión a " + volume);
    }
}
