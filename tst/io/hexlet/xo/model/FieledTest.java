package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;


public class FieledTest {
    @Test
    public void testGetSize() throws Exception {
        final Fieled fieled = new Fieled();
        assertEquals(3, fieled.getSize());
    }

    @Test
    public void setFigure() throws Exception {
        final Fieled fieled = new Fieled();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        fieled.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = fieled.getFigure(inputPoint);
        assertEquals(inputFigure, actualFigure);
    }

    @Test
    public void getFigureWhenTheFiguteNotset() throws Exception {
        final Fieled fieled = new Fieled();
        final Point inputPoint = new Point(0, 0);

        final Figure actualFigure = fieled.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    public void getFigureWhenXIsLessThenZerro() throws Exception {
        final Fieled fieled = new Fieled();
        final Point inputPoint = new Point(-1, 0);
        try {
            fieled.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    public void getFigureWhenYIsLessThenZerro() throws Exception {
        final Fieled fieled = new Fieled();
        final Point inputPoint = new Point(0, -1);
        try {
            fieled.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    public void getFigureWhenXIsMoreThenSize() throws Exception {
        final Fieled fieled = new Fieled();
        final Point inputPoint = new Point(fieled.getSize() + 1, 0);
        try {
            fieled.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    public void getFigureWhenYIsMoreThenSize() throws Exception {
        final Fieled fieled = new Fieled();
        final Point inputPoint = new Point(0, fieled.getSize() + 1);
        try {
            fieled.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

/*    @Test
    public void testSetFigureWhenOlreadyOccupied() throws Exception {
        final Fieled fieled = new Fieled();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;
        fieled.setFigure(inputPoint, inputFigure);

        try {
            fieled.setFigure(inputPoint, inputFigure);

            fail();
        } catch (final AlreadyOccupiedException e) {
        }
    }*/


}
