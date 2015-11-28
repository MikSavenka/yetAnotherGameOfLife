package edu.coderetreat.yagol.model.rule;

import edu.coderetreat.yagol.model.Cell;
import edu.coderetreat.yagol.model.rule.AliveRule;

/**
 *
 */
public class UnderpopulationRule extends AliveRule {
    @Override
    public Cell apply(Cell cell) {

        return new Cell(0, 0, Cell.State.DEAD);//todo
    }
}
