package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Game;

public class ConsoleView {
    public void show(final Game game) {
        final Field field = game.getField();
        for (int x = 0; x < field.getSize(); x++) {
            printLine(field, x);
        }
    }


    public void move(final Game game) {

    }

    private void printLine(final Field field, int x) {
    }
}
