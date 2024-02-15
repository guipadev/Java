package com.example.impl;

import com.example.api.Device;

public class Television implements Device {

	public void powerOn() {
        System.out.println("Encendiendo el televisor");
    }

	public void powerOff() {
        System.out.println("Apagando el televisor");
    }

	public void setChannel(int channel) {
		System.out.println("Cambiando al canal " + channel);
	}

}
