package com.example.api;

import com.example.impl.User;

public interface ChatMediator {

	void sendMessage(String message, User user);
    void addUser(User user);
}
