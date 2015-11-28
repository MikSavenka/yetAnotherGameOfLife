package edu.coderetreat.yagol.rest;

import edu.coderetreat.yagol.model.PlainWorld;

public interface TickApi {

    PlainWorld getNextWorldGeneration(PlainWorld currentGeneration);

}
