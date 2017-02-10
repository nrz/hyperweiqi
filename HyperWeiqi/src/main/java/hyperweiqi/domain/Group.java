package hyperweiqi.domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author antti
 */
public class Group {

    // Group is a group of stones connected with horizontally and/or vertically.

    private final Map<StoneLocation, Stone> stones;

    public Group() {
        this.stones = new HashMap<>();
    }

    public boolean alive() {
        // TODO: implement this using breadth-first search!
        return false;
    }
}
