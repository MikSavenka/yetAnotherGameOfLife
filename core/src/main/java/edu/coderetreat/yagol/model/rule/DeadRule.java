package edu.coderetreat.yagol.model.rule;

import edu.coderetreat.yagol.model.Cell;

/**
 * Rule for dead cells
 */
public abstract class DeadRule implements Rule {
    @Override
    public boolean isAppliable(Cell cell) {
        return cell.getState().equals(Cell.State.DEAD);
    }


}
