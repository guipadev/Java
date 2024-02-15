package com.example.impl;

import com.example.api.Content;
import com.example.api.Device;
import com.example.api.EntertainmentDevice;

public class MoviePlayer extends EntertainmentDevice {

	public MoviePlayer(Content content, Device device) {
		super(content, device);
	}

	@Override
	public void playContent() {
		device.powerOn();
		content.play();
	}

	@Override
	public void stopContent() {
		content.stop();
		device.powerOff();
	}

}
