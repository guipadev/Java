package com.example.impl;

import com.example.api.Device;

public class Projector implements Device {

	public void powerOn() {
		System.out.println("Encendiendo el proyector");
	}

	public void powerOff() {
		System.out.println("Apagando el proyector");
	}

	public void setChannel(int channel) {
		System.out.println("No se puede cambiar de canal en el proyector");
	}

}
