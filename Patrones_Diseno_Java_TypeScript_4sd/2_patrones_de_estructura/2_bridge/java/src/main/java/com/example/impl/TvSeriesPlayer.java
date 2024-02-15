package com.example.impl;

import com.example.api.Content;
import com.example.api.Device;
import com.example.api.EntertainmentDevice;

public class TvSeriesPlayer extends EntertainmentDevice {
	public TvSeriesPlayer(Content content, Device device) {
		super(content, device);
	}

	public void playContent() {
		device.powerOn();
		content.play();
	}

	public void stopContent() {
		content.stop();
		device.powerOff();
	}
}
