package com.example.main;

import com.example.api.ChatMediator;
import com.example.impl.ChatMediatorImpl;
import com.example.impl.User;

public class Main {

	public static void main(String[] args) {
		// Crear un mediador
		ChatMediator mediator = new ChatMediatorImpl();

		// Crear usuarios
		var user1 = new User("Usuario 1", mediator);

		var user2 = new User("Usuario 2", mediator);

		var user3 = new User("Usuario 3", mediator);

		/*
		 * Los usuarios envían mensajes a través del mediador
		 */
		user1.sendMessage("Hola a todos");
		user2.sendMessage("Hola, Usuario 1");
		user3.sendMessage("Hola, ¿cómo están?");
	}

}
