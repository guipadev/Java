package com.example.impl;

import com.example.api.Command;

public class RemoteControl {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}

}
