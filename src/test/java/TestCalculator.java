import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(8, testCalculator.add(2, 6));
    }

    @Test
    public void canSubtract() {
        assertEquals(3, testCalculator.subtract(7, 4));
    }

    @Test
    public void canMultiply() {
        assertEquals(9, testCalculator.multiply(3, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(5, testCalculator.divide(10, 2));
    }
}


