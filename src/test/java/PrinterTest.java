import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer testPrinter;

    @Before
    public void before() {
        testPrinter = new Printer(10, 20);
    }

    @Test
    public void getNumberOfSheetsLeft() {
        assertEquals(10, testPrinter.getNumberOfSheetsLeft());
    }

    @Test
    public void canPrintWithEnoughPaper() {
        testPrinter.print(4, 2);
        assertEquals(2, testPrinter.getNumberOfSheetsLeft());
    }

    @Test
    public void cantPrintWithoutEnoughPaper() {
        testPrinter.print(5, 20);
        assertEquals(10, testPrinter.getNumberOfSheetsLeft());
    }

    @Test
    public void canRefillPaper() {
        testPrinter.print(4,2);
        testPrinter.refill(8);
        assertEquals(10, testPrinter.getNumberOfSheetsLeft());
    }

    @Test
    public void getToner() {
        assertEquals(20, testPrinter.getToner());
    }

}
