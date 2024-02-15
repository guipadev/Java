package com.example.impl;

public class Device {
	
	private String name;
	
	public Device(String name) {
		this.name = name;
	}
	
	public void turnOn() {
		System.out.println("Encendiendo " + name);
	}
	public void turnOff() {
		System.out.println("Apagando " + name);
	}
}
