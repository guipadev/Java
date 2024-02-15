package com.example.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.api.ChatMediator;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, 
    User sender) 
    {
        for (User user : users) {
            /* Evitar enviar el mensaje al 
            remitente */
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

}
