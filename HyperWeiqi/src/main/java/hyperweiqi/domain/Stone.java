package hyperweiqi.domain;

public class Stone {

    private final Color color;
    private final StoneLocation location;
    private boolean captured;

    public enum Color {

        BLACK, WHITE
    }

    public Stone(Color color, StoneLocation location) {
        this.color = color;
        this.location = location;
        this.captured = false;
    }

    public Stone(Color color, int x, int y) {
        this(color, new StoneLocation(x, y));
    }

    public Color getColor() {
        return this.color;
    }

    public int getX() {
        return this.location.getX();
    }

    public int getY() {
        return this.location.getY();
    }

    public int getLiberties() {
        // TODO: implement this using Group class!
        return -1;
    }

    public boolean isCaptured() {
        return this.captured;
    }

    public void capture() {
        this.captured = true;
    }
}
