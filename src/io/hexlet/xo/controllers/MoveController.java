package io.hexlet.xo.controllers;


import io.hexlet.xo.model.Fieled;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {
    public void applyFigure(Fieled fieled, Point point, Figure figure) throws InvalidPointException, AlreadyOccupiedException {
        if (fieled.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        fieled.setFigure(point, figure);
    }
}