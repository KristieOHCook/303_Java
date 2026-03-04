public class Triangle1 extends Shape1 {
    public Triangle1(String color) { this.color = color; }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle");
    }
}
