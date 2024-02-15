package com.example.impl;

import com.example.api.Content;

public class TVSeries implements Content {
    private String title;

    public TVSeries(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Reproduciendo la serie de TV: " + title);
    }

    public void pause() {
        System.out.println("Pausando la serie de TV: " + title);
    }

    public void stop() {
        System.out.println("Deteniendo la serie de TV: " + title);
    }
}
