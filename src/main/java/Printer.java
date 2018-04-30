public class Printer {
    private int numberOfSheetsLeft;
    private int toner;

    public Printer(int numberOfSheetsLeft, int toner) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.toner = toner;
    }

    public int getNumberOfSheetsLeft() {
        return this.numberOfSheetsLeft;
    }

    public int getToner() {
        return this.toner;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        int pagesRequired = numberOfPages * numberOfCopies;
        if (this.numberOfSheetsLeft >= pagesRequired) {
            this.numberOfSheetsLeft -= pagesRequired;
        }
    }

    public void refill(int piecesOfPaper) {
        this.numberOfSheetsLeft += piecesOfPaper;
    }
}
