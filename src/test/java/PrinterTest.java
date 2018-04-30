import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer testPrinter;

    @Before
    public void before() {
        testPrinter = new Printer(10);
    }

    @Test
    public void getNumberOfSheetsLeft() {
        assertEquals(10, testPrinter.getNumberOfSheetsLeft());
    }

}
