package edu.coderetreat.yagol.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TickTest {

    private Tick tick;

    @Before
    public void init() {
        tick = new Tick();
    }

    @Test
    public void testThat5SquareDeadWorldStayDead() {
        int xSize = 5;
        int ySize = 5;
        PlainWorld current = PlainWorldFactory.createDeadWorld(xSize, ySize);
        PlainWorld nextGen = tick.getNextGeneration(current);
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                Assert.assertEquals(nextGen.getCells()[i][j].getState(), Cell.State.DEAD);
            }
        }
    }

    @Test
    public void testThat100SquareDeadWorldStayDead() {
        int xSize = 100;
        int ySize = 100;
        PlainWorld current = PlainWorldFactory.createDeadWorld(xSize, ySize);
        PlainWorld nextGen = tick.getNextGeneration(current);
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                Assert.assertEquals(nextGen.getCells()[i][j].getState(), Cell.State.DEAD);
            }
        }
    }

    @Test
    public void testThat10LineDeadWorldStayDead() {
        int xSize = 10;
        int ySize = 1;
        PlainWorld current = PlainWorldFactory.createDeadWorld(xSize, ySize);
        PlainWorld nextGen = tick.getNextGeneration(current);
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                Assert.assertEquals(nextGen.getCells()[i][j].getState(), Cell.State.DEAD);
            }
        }
    }

    @Test
    public void testThat10ColumnDeadWorldStayDead() {
        int xSize = 1;
        int ySize = 10;
        PlainWorld current = PlainWorldFactory.createDeadWorld(xSize, ySize);
        PlainWorld nextGen = tick.getNextGeneration(current);
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                Assert.assertEquals(nextGen.getCells()[i][j].getState(), Cell.State.DEAD);
            }
        }
    }

}
