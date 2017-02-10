package hyperweiqi.logic;

import hyperweiqi.domain.Stone;
import hyperweiqi.domain.StoneLocation;

/**
 *
 * @author antti
 */
public class Move {

    private final Stone stone;
    private final StoneLocation location;

    public Move(Stone stone, StoneLocation location) {
        this.stone = stone;
        this.location = location;
    }

    public Stone getStone() {
        return this.stone;
    }

    public StoneLocation getLocation() {
        return this.location;
    }
}
