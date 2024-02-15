package com.medium.EidanKhan.clasesellada.implementacioncomportamientoespecificodedominio;

sealed class Content permits TextContent, ImageContent {
    abstract String render();
}
