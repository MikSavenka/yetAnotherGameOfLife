/**
 * Created by a s u s on 14.11.2015.
 */
public abstract class DeadRule implements Rule {
    @Override
    public boolean isAppliable(Cell cell) {
        return cell.getState().equals(Cell.State.DEAD);
    }


}
