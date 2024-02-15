package com.example.api;

import com.example.impl.PurchaseRequest;

public interface Handler {

	void setNextHandler(Handler nextHandler);
    void processRequest(PurchaseRequest request);
}
