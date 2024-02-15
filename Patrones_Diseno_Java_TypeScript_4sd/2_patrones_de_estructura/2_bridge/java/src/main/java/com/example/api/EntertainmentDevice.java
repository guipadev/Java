package com.example.api;

public abstract class EntertainmentDevice {

	protected Content content;
	protected Device device;

	public EntertainmentDevice(Content content, Device device) {
		this.content = content;
		this.device = device;
	}

	public abstract void playContent();

	public abstract void stopContent();

}
