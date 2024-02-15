package com.example.impl;

public class EventLogger {

	private static EventLogger instance;

	private String logFileName;

	private EventLogger() {
		logFileName = "event_log.txt";
	}

	public static EventLogger getInstance() {
		if (instance == null) {
			instance = new EventLogger();
		}
		return instance;
	}

	public void logEvent(String eventMessage) {
		// Simulamos que escribimos el evento en un archivo de log
		System.out.println("Logging event: " + eventMessage + " to " + logFileName);
	}

	public void setLogFileName(String fileName) {
		logFileName = fileName;
	}

}
