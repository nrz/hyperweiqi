package hyperweiqi.domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StoneLocationTest {

    public StoneLocationTest() {
    }

    @Test
    public void testStoneLocation() {
        int x = 1;
        int y = 2;
        StoneLocation location = new StoneLocation(x, y);
        assertEquals(location.getX(), x);
        assertEquals(location.getY(), y);
    }
}
