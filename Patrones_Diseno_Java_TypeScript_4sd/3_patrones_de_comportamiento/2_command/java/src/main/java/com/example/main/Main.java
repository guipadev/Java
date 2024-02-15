package com.example.main;

import com.example.api.Command;
import com.example.impl.AdjustVolumeCommand;
import com.example.impl.Device;
import com.example.impl.RemoteControl;
import com.example.impl.Television;
import com.example.impl.TurnOffCommand;
import com.example.impl.TurnOnCommand;

public class Main {

	public static void main(String[] args) {
		// Crear dispositivos
		var tv = new Television("Televisión");
		var light = new Device("Luz");

		// Crear comandos
		Command turnOnTV = new TurnOnCommand(tv);
		Command turnOffTV = new TurnOffCommand(tv);
		Command adjustVolume = new AdjustVolumeCommand(tv, 20);
		Command turnOnLight = new TurnOnCommand(light);
		
		RemoteControl remote = new RemoteControl();
		remote.setCommand(turnOnTV);
		
		// Presionar el botón del control remoto
        remote.pressButton();

        // Usar otro comando
        remote.setCommand(adjustVolume);
        remote.pressButton();
        
     // Cambiar el comando del control remoto
        remote.setCommand(turnOffTV);
        remote.pressButton();

        remote.setCommand(turnOnLight);
        remote.pressButton();
	}

}
