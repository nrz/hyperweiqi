package hyperweiqi.domain;

import org.junit.Test;
import static org.junit.Assert.*;

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
