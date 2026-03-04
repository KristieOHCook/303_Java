public class Circle1 extends Shape1 {
    protected double radius;
    private final double PI = Math.PI;

    public Circle1(double radius) { this.radius = radius; }

    @Override
    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
}
