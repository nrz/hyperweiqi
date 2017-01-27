package hyperweiqi.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class StoneTest {

    @Test
    public void testGetColor() {
        int x = 1;
        int y = 2;
        Stone blackStone = new Stone(Stone.Color.BLACK, x, y);
        assertEquals(blackStone.getColor(), Stone.Color.BLACK);
    }

    @Test
    public void testGetX() {
        int x = 1;
        int y = 2;
        Stone blackStone = new Stone(Stone.Color.BLACK, x, y);
        assertEquals(blackStone.getX(), x);
    }

    @Test
    public void testGetY() {
        int x = 1;
        int y = 2;
        Stone blackStone = new Stone(Stone.Color.BLACK, x, y);
        assertEquals(blackStone.getY(), y);
    }

    @Test
    public void testIsCaptured() {
        int x = 1;
        int y = 2;
        Stone blackStone = new Stone(Stone.Color.BLACK, x, y);
        assertEquals(blackStone.isCaptured(), false);
    }

    @Test
    public void testCapture() {
        int x = 1;
        int y = 2;
        Stone blackStone = new Stone(Stone.Color.BLACK, x, y);
        assertEquals(blackStone.isCaptured(), false);
        blackStone.capture();
        assertEquals(blackStone.isCaptured(), true);
    }

}
