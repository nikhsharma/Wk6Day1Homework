public class Printer {
    private int numberOfSheetsLeft;

    public Printer(int numberOfSheetsLeft) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
    }

    public int getNumberOfSheetsLeft() {
        return this.numberOfSheetsLeft;
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
