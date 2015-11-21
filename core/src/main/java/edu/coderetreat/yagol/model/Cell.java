package edu.coderetreat.yagol.model;

/**
 *
 */
public class Cell {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Cell(State s) {
        this.state = s;
    }


    public Cell() {
        this.state = State.DEAD;
    }

     enum State {
        DEAD, ALIVE, SICK
    }

    private State state;

    public State getState() {
        return state;
    }
}
