package io.hexlet.xo.model;

import org.junit.Test;

import java.awt.*;
import java.lang.reflect.Field;

import static org.junit.Assert.*;


public class FiledTest {
    @Test
    public void testGetSize() throws Exception {
        final Filed filed = new Filed();
        assertEquals(3, filed.getSize());
    }

    @Test
    public void setFigure() throws Exception {
        final Filed filed = new Filed();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        filed.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = filed.getFigure(inputPoint);
        assertEquals(inputFigure, actualFigure);
    }

}