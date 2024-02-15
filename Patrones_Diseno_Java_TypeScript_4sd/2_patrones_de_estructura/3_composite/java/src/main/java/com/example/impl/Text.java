package com.example.impl;

import com.example.api.Component;

public class Text implements Component {

	private String content;

	public Text(String content) {
		this.content = content;
	}

	public void render() {
		System.out.println("Texto: " + content);
	}

}
