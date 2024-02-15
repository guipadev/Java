package com.example.api;

import com.example.impl.HeaderElement;
import com.example.impl.ParagraphElement;

public interface DocumentVisitor {

	void visitParagraph(ParagraphElement paragraph);

	void visitHeader(HeaderElement header);

}
