package io.hexlet.xo.model;

import org.junit.Test;
import org.omg.CORBA.PolicyListHelper;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testGetName() throws Exception {

        final String InputValue = "Dima";
        final String expectedValue = InputValue;
        final Player player = new Player(InputValue, null);
        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFigure() throws Exception {

        final Figure InputValue = Figure.X;
        final Figure expectedValue = InputValue;
        final Player player = new Player(null, InputValue);
        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }

}