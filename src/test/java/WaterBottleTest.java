import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle testWaterBottle;

    @Before
    public void before() {
        testWaterBottle = new WaterBottle();
    }

    @Test
    public void bottleIsFull() {
        assertEquals(100, testWaterBottle.getVolume());
    }

}
