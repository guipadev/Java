package com.example.api;

public interface Document {

	Document cloneDocument();

	void setContent(String content);

	String getContent();
}
