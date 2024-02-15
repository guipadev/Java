package com.example.main;

import com.example.impl.EventLogger;

public class Main {

	public static void main(String[] args) {
		/*
		 * Obtenemos la instancia singleton de EventLogger
		 */
		var logger = EventLogger.getInstance();

		// Escribimos en el log
		logger.logEvent("Event 1: Application started");
		logger.logEvent("Event 2: User logged in");

		// Asignamos el nombre del archivo de log
		logger.setLogFileName("custom_log.txt");

		// Escribimos otro evento
		logger.logEvent("Event 3: Data processed");
	}

}
