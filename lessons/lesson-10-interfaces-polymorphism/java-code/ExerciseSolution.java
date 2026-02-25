// SOLUTION: Printer Interface Exercise

// ---- Interface ----
interface Printer {
    void printDocument(String docName);
    int getPageCount();
}

// ---- InkjetPrinter ----
class InkjetPrinter implements Printer {

    int pagesRemaining;

    public InkjetPrinter() {
        this.pagesRemaining = 100;
        System.out.println("New inkjet printer ready (100 pages)");
    }

    @Override
    public void printDocument(String docName) {
        if (pagesRemaining <= 0) {
            System.out.println("Out of ink! Cannot print: " + docName);
            return;
        }
        pagesRemaining--;
        System.out.println("Inkjet printing: " + docName);
    }

    @Override
    public int getPageCount() {
        return pagesRemaining;
    }

    // InkjetPrinter-only method (like Football's playerTransfer)
    public void refillInk() {
        pagesRemaining = 100;
        System.out.println("Ink refilled! Pages remaining: " + pagesRemaining);
    }
}

// ---- LaserPrinter ----
class LaserPrinter implements Printer {

    int pagesRemaining;

    public LaserPrinter() {
        this.pagesRemaining = 500;
        System.out.println("New laser printer ready (500 pages)");
    }

    @Override
    public void printDocument(String docName) {
        if (pagesRemaining <= 0) {
            System.out.println("Toner empty! Cannot print: " + docName);
            return;
        }
        pagesRemaining--;
        System.out.println("Laser printing: " + docName);
    }

    @Override
    public int getPageCount() {
        return pagesRemaining;
    }

    // LaserPrinter-only method
    public void replaceToner() {
        pagesRemaining = 500;
        System.out.println("Toner replaced! Pages remaining: " + pagesRemaining);
    }
}

// ---- Main ----
public class ExerciseSolution {
    public static void main(String[] args) {

        // Create printers
        InkjetPrinter inkjet = new InkjetPrinter();
        LaserPrinter laser = new LaserPrinter();

        // Print some documents
        inkjet.printDocument("Resume.pdf");
        inkjet.printDocument("CoverLetter.pdf");
        laser.printDocument("Report.pdf");
        laser.printDocument("Spreadsheet.xlsx");

        // Check page counts
        System.out.println("Inkjet pages left: " + inkjet.getPageCount());
        System.out.println("Laser pages left: " + laser.getPageCount());

        // Class-specific methods (like Football.playerTransfer)
        inkjet.refillInk();
        laser.replaceToner();

        System.out.println("Inkjet pages after refill: " + inkjet.getPageCount());
        System.out.println("Laser pages after replace: " + laser.getPageCount());
    }
}
