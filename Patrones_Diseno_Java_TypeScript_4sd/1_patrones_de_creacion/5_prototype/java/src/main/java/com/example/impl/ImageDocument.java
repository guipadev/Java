package com.example.impl;

import com.example.api.Document;

public class ImageDocument implements Document {
    private String content;

	@Override
	public Document cloneDocument() {
		ImageDocument clonedDocument = new ImageDocument();
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
