public abstract class Shape1 {
    protected String color;
    protected double height, width, base;

    public void setColor(String color) { this.color = color; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    public void setBase(double base) { this.base = base; }

    // Abstract method: no body {} here, just a semicolon.
    public abstract double getArea();

    @Override
    public String toString() { return "Shape1[color=" + color + "]"; }

    public void displayshapName() { System.out.println("I am a Shape."); }
}
