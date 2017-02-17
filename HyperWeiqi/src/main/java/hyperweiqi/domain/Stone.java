package hyperweiqi.domain;

import java.util.Objects;

/**
 * Stone class provides functionality related to a single stone.
 */
public class Stone {

    private final Color color;
    private final StoneLocation location;
    private Board board;

    public enum Color {

        BLACK, WHITE, NO_STONE
    }

    public Stone(Color color, StoneLocation location) {
        this.color = color;
        this.location = location;
    }

    public Stone(Color color, int x, int y) {
        this(color, new StoneLocation(x, y));
    }

    public Color getColor() {
        return this.color;
    }

    public StoneLocation getLocation() {
        return this.location;
    }

    public int getX() {
        return this.location.getX();
    }

    public int getY() {
        return this.location.getY();
    }

    public Group getMyGroup() {
        if (this.board == null) {
            return null;
        }
        return this.board.getGroup(this.location);
    }

    public Integer getLiberties() {
        if (this.getMyGroup() == null) {
            return null;
        }
        return this.getMyGroup().getLiberties();
    }

    public Boolean isCaptured() {
        Integer liberties = this.getLiberties();
        if (liberties == null) {
            return null;
        }
        return (liberties > 0);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.color);
        hash = 79 * hash + Objects.hashCode(this.location);
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
        final Stone other = (Stone) obj;
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
}
