package com.medium.EidanKhan.clasesellada.implementacioncomportamientoespecificodedominio;

final class ImageContent extends Content {
    private final String imageUrl;

    public ImageContent(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String render() {
        return "<img src=\"" + imageUrl + "\" alt=\"Image\">";
    }
}
