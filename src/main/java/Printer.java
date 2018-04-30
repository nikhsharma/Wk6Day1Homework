public class Printer {
    private int numberOfSheetsLeft;
    private int toner;
    private int maxSheets;

    public Printer(int numberOfSheetsLeft, int toner) {
        this.maxSheets = 40;
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
        if ((this.numberOfSheetsLeft >= pagesRequired) && (this.toner >= pagesRequired)) {
            this.numberOfSheetsLeft -= pagesRequired;
            this.toner -= pagesRequired;
        }
    }

    public void refill(int piecesOfPaper) {
        if (piecesOfPaper <= (this.maxSheets - this.numberOfSheetsLeft)) {
            this.numberOfSheetsLeft += piecesOfPaper;
        }
    }
}
