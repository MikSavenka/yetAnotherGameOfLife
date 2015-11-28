package edu.coderetreat.yagol.model;

/**
 * World representation - simple 2-dimensions world, not the real, dude...
 */
public class PlainWorld {

    private Cell[][] cells;
    private int xDimension;
    private int yDimension;

    protected PlainWorld(Cell[][] cells) {
        this.cells = cells;
    }

    protected PlainWorld(int xDimension, int yDimension) {
        this.cells = new Cell[xDimension][yDimension];
        this.xDimension = xDimension;
        this.yDimension = yDimension;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public int getXDimension() {
        return xDimension;
    }

    public int getYDimension() {
        return yDimension;
    }
}
