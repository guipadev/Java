package com.example.impl;

import com.example.api.Iterator;

public class BookCollection implements com.example.api.Iterable<String> {
    private String[] books;

    public BookCollection(String[] books) {
        this.books = books;
    }

    public Iterator<String> iterator() {
        return new BookIterator(books);
    }
}

