package hyperweiqi.domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StoneTest {

    @Test
    public void testGetColor() {
        int x = 1;
        int y = 2;
        Stone blackStone = new Stone(Stone.Color.BLACK, x, y);
        assertEquals(blackStone.getColor(), Stone.Color.BLACK);

        Stone whiteStone = new Stone(Stone.Color.WHITE, x, y);
        assertEquals(whiteStone.getColor(), Stone.Color.WHITE);
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

        Stone whiteStone = new Stone(Stone.Color.WHITE, x, y);
        assertEquals(whiteStone.isCaptured(), false);
    }

    @Test
    public void testCapture() {
        int x = 1;
        int y = 2;
        Stone blackStone = new Stone(Stone.Color.BLACK, x, y);
        assertEquals(blackStone.isCaptured(), false);
        blackStone.capture();
        assertEquals(blackStone.isCaptured(), true);

        Stone whiteStone = new Stone(Stone.Color.WHITE, x, y);
        assertEquals(whiteStone.isCaptured(), false);
        whiteStone.capture();
        assertEquals(whiteStone.isCaptured(), true);
    }
}
