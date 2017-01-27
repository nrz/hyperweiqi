package hyperweiqi.logic;

import hyperweiqi.domain.StoneLocation;
import hyperweiqi.domain.Stone;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoveTest {

    public MoveTest() {
    }

    @Test
    public void testSomeMethod() {
        int x = 1;
        int y = 2;
        StoneLocation location = new StoneLocation(x, y);

        Stone stone = new Stone(Stone.Color.BLACK, location);

        Move move = new Move(stone, location);

        assertEquals(move.getLocation(), location);
        assertEquals(move.getStone(), stone);
    }
}
