package com.example.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.api.Observer;

public class Stock {

	private String symbol;
	private double price;
	private List<Observer> observers = new ArrayList<>();

	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void setPrice(double price) {
		this.price = price;
		notifyObservers();
	}

	private void notifyObservers() {
        String message = "Precio de " + symbol + " ha cambiado a " + price;
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
