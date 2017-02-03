package hyperweiqi.domain;

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
}
