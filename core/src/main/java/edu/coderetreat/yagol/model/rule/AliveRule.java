package edu.coderetreat.yagol.model.rule;

import edu.coderetreat.yagol.model.Cell;

/**
 * Rule for alive cells
 */
public abstract class AliveRule implements Rule {
    @Override
    public boolean isAppliable(Cell cell) {
        return cell.getState().equals(Cell.State.ALIVE);
    }


}
