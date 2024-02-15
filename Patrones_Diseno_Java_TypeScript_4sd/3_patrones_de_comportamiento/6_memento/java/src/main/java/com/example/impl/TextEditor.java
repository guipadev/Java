package com.example.impl;

public class TextEditor {

	private StringBuilder text = new StringBuilder();

	public void write(String content) {
		text.append(content);
	}

	public String getContent() {
		return text.toString();
	}

	public Memento save() {
		return new Memento(text.toString());
	}

	public void restore(Memento memento) {
		text = new StringBuilder(memento.getSavedState());
	}

	// Clase interna Memento
	public static class Memento {
		private final String state;

		private Memento(String state) {
			this.state = state;
		}

		private String getSavedState() {
			return state;
		}
	}

}
