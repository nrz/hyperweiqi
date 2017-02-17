package hyperweiqi.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Board class which provides several functions related to the game board.
 */
public class Board {

    private final int size;
    private final Stone[][] board;

    // Locations map is to provide access from stones to locations.
    private final Map<Stone, StoneLocation> locations;

    // Groups map is to provide access from stones to groups.
    private final Map<StoneLocation, Group> groups;

    public Board(int size) {
        this.size = size;
        this.board = new Stone[size][size];
        this.locations = new HashMap<>();
        this.groups = new HashMap<>();

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                this.board[y][x] = new Stone(Stone.Color.NO_STONE, x, y);
            }
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean placeStone(Stone stone, StoneLocation location) {
        int x = location.getX();
        int y = location.getY();

        if (!checkCoordinates(x, y)) {
            // Can not place a Stone outside the board!
            return false;
        }

        if (stone == null) {
            // Can not place a null stone!
            return false;
        }

        this.board[y][x] = stone;
        this.locations.put(stone, location);

        if (!this.groups.containsKey(location)) {
            Group group = new Group(this);
            this.groups.put(location, group);
        }
        stone.setBoard(this);
        return true;
    }

    public boolean placeStone(Stone stone, int x, int y) {
        return this.placeStone(stone, new StoneLocation(x, y));
    }

    public Stone at(int x, int y) {
        if (!this.checkCoordinates(x, y)) {
            return null;
        }
        return this.board[y][x];
    }

    private boolean checkCoordinates(int x, int y) {
        return (x >= 0 && x < this.size && y >= 0 && y < this.size);
    }

    public Group getGroup(StoneLocation location) {
        return this.groups.get(location);
    }

    public Group getGroup(int x, int y) {
        return this.getGroup(new StoneLocation(x, y));
    }
}
