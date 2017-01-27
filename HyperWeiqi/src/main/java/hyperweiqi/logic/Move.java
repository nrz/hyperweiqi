package hyperweiqi.logic;

import hyperweiqi.domain.StoneLocation;
import hyperweiqi.domain.Stone;

public class Move {

    private final Stone stone;
    private final StoneLocation location;

    public Move(Stone stone, StoneLocation location) {
        this.stone = stone;
        this.location = location;
    }

    public Stone getStone() {
        return stone;
    }

    public StoneLocation getLocation() {
        return location;
    }
}
