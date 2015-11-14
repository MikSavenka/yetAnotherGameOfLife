/**
 * Created by a s u s on 14.11.2015.
 */
public interface Rule {
    boolean isAppliable(Cell cell);
    Cell apply(Cell cell);
}
