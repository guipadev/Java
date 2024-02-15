package com.example.api;

public interface DocumentElement {

	void accept(DocumentVisitor visitor);
}
