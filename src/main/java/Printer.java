public class Printer {
    private int numberOfSheetsLeft;

    public Printer(int numberOfSheetsLeft) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
    }

    public int getNumberOfSheetsLeft() {
        return this.numberOfSheetsLeft;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        this.numberOfSheetsLeft -= numberOfPages * numberOfCopies;
    }
}
