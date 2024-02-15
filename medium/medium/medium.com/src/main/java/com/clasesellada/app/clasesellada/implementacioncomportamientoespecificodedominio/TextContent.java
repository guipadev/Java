package com.medium.EidanKhan.clasesellada.implementacioncomportamientoespecificodedominio;

final class TextContent extends Content {
    private final String text;

    public TextContent(String text) {
        this.text = text;
    }

    public String render() {
        return "<p>" + text + "</p>";
    }
}
