package edu.coderetreat.yagol.model;

/**
 *
 */
public interface Rule {
    boolean isAppliable(Cell cell);
    Cell apply(Cell cell);
}
