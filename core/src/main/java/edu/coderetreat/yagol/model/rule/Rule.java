package edu.coderetreat.yagol.model.rule;

import edu.coderetreat.yagol.model.Cell;

/**
 * Game rules
 */
public interface Rule {
    boolean isAppliable(Cell cell);
    Cell apply(Cell cell);
}
