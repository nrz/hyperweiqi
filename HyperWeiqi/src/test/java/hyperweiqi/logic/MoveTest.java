package hyperweiqi.logic;

import hyperweiqi.domain.Stone;
import hyperweiqi.domain.StoneLocation;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
