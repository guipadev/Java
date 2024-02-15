package com.example.impl;

import com.example.api.ChatMediator;

public class User {

	private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) 
    {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    public void sendMessage(String message) {
        System.out.println(name + " envía: " + 
        message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " recibe: " + 
        message);
    }

}
