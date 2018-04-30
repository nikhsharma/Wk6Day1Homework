import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator(2, 6);
    }

    @Test
    public void hasNum1() {
        assertEquals(2, testCalculator.getNum1());
    }

    @Test
    public void hanNum2() {
        assertEquals(6, testCalculator.getNum2());
    }
}


