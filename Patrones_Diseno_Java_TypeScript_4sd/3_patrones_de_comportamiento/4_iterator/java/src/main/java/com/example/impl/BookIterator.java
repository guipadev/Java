package com.example.impl;

import com.example.api.Iterator;

public class BookIterator implements Iterator<String> {
	private String[] books;
	private int position = 0;

	public BookIterator(String[] books) {
		this.books = books;
	}

	public boolean hasNext() {
		return position < books.length;
	}

	public String next() {
		if (hasNext()) {
			return books[position++];
		}
		return null;
	}
}
