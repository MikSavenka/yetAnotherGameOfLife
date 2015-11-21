package edu.coderetreat.yagol.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BoardTest {

    private Cell[][] cells;

    @Before
    public void init(){
        cells  = new Cell[][] {
                { new Cell(), new Cell(),new Cell(),new Cell(),new Cell()},
                { new Cell(), new Cell(),new Cell(),new Cell(),new Cell()},
                { new Cell(), new Cell(),new Cell(),new Cell(),new Cell()},
                { new Cell(), new Cell(),new Cell(),new Cell(),new Cell()},
                { new Cell(), new Cell(),new Cell(),new Cell(),new Cell()}
        };
    }

    @Test
    public void testThatDeadBoardStayDead(){
        Board board = new Board(cells);
        Cell[][] nextGen = board.getNextGeneration(cells);
        for (int i=0; i<5; i++){
            for(int j=0;j<5;j++){
                Assert.assertEquals(nextGen[i][j].getState(), Cell.State.DEAD);
            }
        }
    }


}
