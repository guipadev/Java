package com.example.impl;

import com.example.api.DocumentElement;
import com.example.api.DocumentVisitor;

public class ParagraphElement implements DocumentElement {

	@Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitParagraph(this);
    }

}
