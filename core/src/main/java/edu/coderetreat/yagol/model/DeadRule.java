package edu.coderetreat.yagol.model;

/**
 *
 */
public abstract class DeadRule implements Rule {
    @Override
    public boolean isAppliable(Cell cell) {
        return cell.getState().equals(Cell.State.DEAD);
    }


}
