package edu.coderetreat.yagol.model;

import edu.coderetreat.yagol.utils.WorldBuilder;

public class PlainWorldFactory {

    public static PlainWorld createDeadWorld(int xSize, int ySize) {
        return PlainWorldFactory.createFixedStateWorld(xSize, ySize, Cell.State.DEAD);
    }

    public static PlainWorld createAliveWorld(int xSize, int ySize) {
        return PlainWorldFactory.createFixedStateWorld(xSize, ySize, Cell.State.ALIVE);
    }

    public static PlainWorld createSickWorld(int xSize, int ySize) {
        return PlainWorldFactory.createFixedStateWorld(xSize, ySize, Cell.State.SICK);
    }

    public static PlainWorld createWorldFromParticipants(Cell[][] participants) {
        return new PlainWorld(participants);
    }

    public static PlainWorld createRandomWorld(int xSize, int ySize) {
        return null; //todo
    }

    private static PlainWorld createFixedStateWorld(int xSize, int ySize, Cell.State state) {
        WorldBuilder worldBuilder = new WorldBuilder(new PlainWorld(xSize, ySize));
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                worldBuilder = worldBuilder.append(new Cell(i, j, state));
            }
        }
        return worldBuilder.getWorld();
    }
}
