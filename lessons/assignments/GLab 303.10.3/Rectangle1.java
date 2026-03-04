public class Rectangle1 extends Shape1 {
    public Rectangle1(String color) { this.color = color; }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void displayshapName() {
        System.out.println("I am a Rectangle");
    }
}
