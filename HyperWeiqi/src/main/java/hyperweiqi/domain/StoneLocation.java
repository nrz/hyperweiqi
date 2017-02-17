package hyperweiqi.domain;

/**
 * StoneLocation class contains x and y coordinates and provides related
 * functionality.
 */
public class StoneLocation {

    private final int x;
    private final int y;

    public StoneLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toSgfFormat() {
        // In SGF format the locations are expressed with letters.
        // The first letter is column, A is the leftmost one.
        // The second letter is row, A is the top row.
        char column = (char) ('A' + this.x);
        char row = (char) ('A' + this.y);
        return "" + row + column;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.x;
        hash = 37 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StoneLocation other = (StoneLocation) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
}
