package com.example.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.api.Component;

public class Document implements Component {
	private List<Component> components = new ArrayList<>();

	public void addComponent(Component component) {
		components.add(component);
	}

	public void render() {
		System.out.println("Documento:");
		for (Component component : components) {
			component.render();
		}
	}
}
