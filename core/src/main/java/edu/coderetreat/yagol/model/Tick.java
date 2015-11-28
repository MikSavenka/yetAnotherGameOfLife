package edu.coderetreat.yagol.model;

/**
 * Life time dimension
  //todo make it singleton probably
 */
public class Tick {

    private LifeEngine lifeEngine = new LifeEngine();

    public PlainWorld getNextGeneration(PlainWorld current) {

        int xDimension = current.getXDimension();
        int yDimension = current.getYDimension();

        Cell[][] forecast = new Cell[xDimension][yDimension];

        for (int i = 0; i < xDimension; i++) {
            for (int j = 0; j < yDimension; j++) {

                forecast[i][j] = lifeEngine.applyRules(current.getCells()[i][j]);

            }
        }

        return new PlainWorld(forecast);
    }


}
