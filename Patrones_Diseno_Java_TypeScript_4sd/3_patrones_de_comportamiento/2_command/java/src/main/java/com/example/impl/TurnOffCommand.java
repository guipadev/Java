package com.example.impl;

import com.example.api.Command;

public class TurnOffCommand implements Command {

	private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }

}
