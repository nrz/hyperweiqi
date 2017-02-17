package hyperweiqi.domain;

import static hyperweiqi.domain.Stone.Color.NO_STONE;
import java.util.HashSet;
import java.util.Set;

/**
 * Group class provides functions for checking the state of a group of stones.
 */
public class Group {

    private final Board board;

    // Group is a group of stones connected with horizontally and/or vertically.
    private final Set<StoneLocation> stoneLocations;

    public Group(Board board) {
        this.board = board;
        this.stoneLocations = new HashSet<>();
    }

    public boolean hasTwoEyes() {
        // TODO: implement this function using breadth-first search!
        return false;
    }

    public boolean stillAlive() {
        return this.getLiberties() >= 1;
    }

    public int getLiberties() {
        // TODO: implement this using breadth-first search!
        int liberties = 0;

        int boardSize = this.board.getSize();
        boolean[][] visited = new boolean[boardSize][boardSize];

        for (int y = 0; y < boardSize; y++) {
            for (int x = 0; x < boardSize; x++) {
                visited[y][x] = false; // false = not visited, true = visited.
            }
        }

        for (StoneLocation location : this.stoneLocations) {
            int x = location.getX();
            int y = location.getY();
            // North
            if (y > 0 && !visited[y - 1][x]) {
                Stone northStone = this.board.at(x, y - 1);
                if (northStone.getColor() == NO_STONE) {
                    liberties++;
                }
                visited[y - 1][x] = true; // false = not visited, true = visited.
            }
            // South
            if (y < boardSize - 1 && !visited[y + 1][x]) {
                Stone southStone = this.board.at(x, y + 1);
                if (southStone.getColor() == NO_STONE) {
                    liberties++;
                }
                visited[y + 1][x] = true; // false = not visited, true = visited.
            }
            // West
            if (x > 0 && !visited[y][x - 1]) {
                Stone westStone = this.board.at(x - 1, y);
                if (westStone.getColor() == NO_STONE) {
                    liberties++;
                }
                visited[y][x - 1] = true; // false = not visited, true = visited.
            }
            // East
            if (x < boardSize - 1 && !visited[y][x + 1]) {
                Stone eastStone = this.board.at(x + 1, y);
                if (eastStone.getColor() == NO_STONE) {
                    liberties++;
                }
                visited[y][x + 1] = true; // false = not visited, true = visited.
            }
        }
        return liberties;
    }
}
