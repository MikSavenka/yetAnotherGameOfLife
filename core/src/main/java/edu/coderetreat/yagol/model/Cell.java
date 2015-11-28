package edu.coderetreat.yagol.model;

/**
 * Life minor competitor
 */
public class Cell {

    private int x;
    private int y;
    private State state;

    public Cell(int x, int y, State state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.state = State.DEAD;
    }

    public enum State {
        DEAD, ALIVE, SICK
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public State getState() {
        return state;
    }
}
