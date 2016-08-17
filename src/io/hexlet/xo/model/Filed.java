package io.hexlet.xo.model;


import io.hexlet.xo.model.exception.AlreadyOccupiedException;
import io.hexlet.xo.model.exception.InvalidePointException;

import java.awt.*;

public class Filed {
    public static final int FIELD_SIZE = 3;
    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = FIELD_SIZE;
    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize() {
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidePointException {
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidePointException, AlreadyOccupiedException {
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }
        if (field[point.x][point.y] != null) {

            throw new AlreadyOccupiedException();
        }
        field[point.x][point.y] = figure;

    }

    private boolean checkPoint(final Point point) {
        return checkCootdinate(point.x) && checkCootdinate(point.y);
    }

    private boolean checkCootdinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < MAX_COORDINATE;
    }
}
