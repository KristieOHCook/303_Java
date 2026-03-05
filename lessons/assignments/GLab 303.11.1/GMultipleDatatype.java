public class GMultipleDatatype<Datatypeone, DatatypeTwo> {
    Datatypeone valueOne;
    DatatypeTwo valueTwo;

    public GMultipleDatatype(Datatypeone v1, DatatypeTwo v2) {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    // Getters and Setters use the placeholders
    public Datatypeone getValueOne() { return valueOne; }
    public DatatypeTwo getValueTwo() { return valueTwo; }
}
