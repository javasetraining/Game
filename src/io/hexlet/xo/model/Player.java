package io.hexlet.xo.model;


public class Player {

    private final Figure name;
    private final Figure figure;

    public Player(final Figure name,final Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public Figure getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
