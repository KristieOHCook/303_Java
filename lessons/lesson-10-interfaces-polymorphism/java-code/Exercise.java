// EXERCISE: Printer Interface
//
// Create a small project that mirrors the SBA interface pattern:
//   1. You already have Vehicle (interface) → Car, Motorcycle (implements)
//   2. Now create YOUR OWN interface + two implementing classes
//
// TODO:
//   1. Create interface "Printer" with these methods:
//      - void printDocument(String docName)
//      - int getPageCount()
//
//   2. Create class "InkjetPrinter" that implements Printer:
//      - Field: int pagesRemaining (starts at 100 in constructor)
//      - printDocument: print "Inkjet printing: <docName>", decrement pagesRemaining by 1
//      - getPageCount: return pagesRemaining
//      - Add an InkjetPrinter-only method: void refillInk() — resets pagesRemaining to 100
//
//   3. Create class "LaserPrinter" that implements Printer:
//      - Field: int pagesRemaining (starts at 500 in constructor)
//      - printDocument: print "Laser printing: <docName>", decrement pagesRemaining by 1
//      - getPageCount: return pagesRemaining
//      - Add a LaserPrinter-only method: void replaceToner() — resets pagesRemaining to 500
//
//   4. In main():
//      - Create one InkjetPrinter and one LaserPrinter
//      - Print a few documents on each
//      - Show page counts
//      - Call the class-specific methods (refillInk, replaceToner)

public class Exercise {
    public static void main(String[] args) {
        // TODO: Implement the above
    }
}
