package edu.coderetreat.yagol.model;

/**
 *
 */
public class Board {

    private Cell[][] cells;

    private static final int SIZE = 3;

    public Board(Cell[][] cells) {
        this.cells = cells;
    }


    public Cell[][] getNextGeneration(Cell[][] currentGeneration) {

        Cell[][] forecast = new Cell[SIZE][SIZE];//todo

        return currentGeneration;
    }


}
