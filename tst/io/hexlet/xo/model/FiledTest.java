package io.hexlet.xo.model;

import io.hexlet.xo.model.exception.InvalidPointException;
import org.junit.Test;

import java.awt.*;

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

    @Test
    public void getFigureWhenTheFiguteNotset() throws Exception {
        final Filed filed = new Filed();
        final Point inputPoint = new Point(0, 0);

        final Figure actualFigure = filed.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    public void getFigureWhenXIsLessThenZerro() throws Exception {
        final Filed filed = new Filed();
        final Point inputPoint = new Point(-1, 0);
        try {
            filed.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    public void getFigureWhenYIsLessThenZerro() throws Exception {
        final Filed filed = new Filed();
        final Point inputPoint = new Point(0, -1);
        try {
            filed.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    public void getFigureWhenXIsMoreThenSize() throws Exception {
        final Filed filed = new Filed();
        final Point inputPoint = new Point(filed.getSize() + 1, 0);
        try {
            filed.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    public void getFigureWhenYIsMoreThenSize() throws Exception {
        final Filed filed = new Filed();
        final Point inputPoint = new Point(0, filed.getSize() + 1);
        try {
            filed.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

}
