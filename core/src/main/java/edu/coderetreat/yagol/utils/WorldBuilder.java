package edu.coderetreat.yagol.utils;

import edu.coderetreat.yagol.model.Cell;
import edu.coderetreat.yagol.model.PlainWorld;

/**
 * Helps build the world
 */
public class WorldBuilder {

    PlainWorld innerWorld;

    public WorldBuilder(PlainWorld initialWorld) {
        this.innerWorld = initialWorld;
    }

    public WorldBuilder append(Cell cell) {
        Cell[][] cells = innerWorld.getCells();
        try {
            cells[cell.getX()][cell.getY()] = cell;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return this;
    }

    public PlainWorld getWorld() {
        return innerWorld;
    }
}
