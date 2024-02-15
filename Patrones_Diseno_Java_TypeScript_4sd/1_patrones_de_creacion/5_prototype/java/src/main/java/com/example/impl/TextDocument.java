package com.example.impl;

import com.example.api.Document;

public class TextDocument implements Document {

	private String content;

	@Override
	public Document cloneDocument() {
		TextDocument clonedDocument = new TextDocument();
		clonedDocument.setContent(this.content);
		return clonedDocument;

	}

	@Override
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return content;
	}

}
