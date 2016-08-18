package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Figure;
import org.junit.Test;

import java.awt.*;
import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * Created by MaRV on 8/18/2016.
 */
public class WinnerControllerTest {
    @Test
    public void check() throws Exception {



    @Test
    public void getWinner() throws Exception {
    final Figure field = new Field(3);
        field.setFigure(new Point(0,0),Figure.X);
        field.setFigure(new Point(0,0),Figure.X);
        field.setFigure(new Point(0,0),Figure.X);

final WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X, winnerController.getWinner(field));
    }

}