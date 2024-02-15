package com.example.impl;

import com.example.api.Command;

public class TurnOnCommand implements Command {
	
	private Device device;
	
	public TurnOnCommand(Device device) {
        this.device = device;
    }

	@Override
	public void execute() {
		 device.turnOn();
	}

}
