public class myRunner1 {
    public static void main(String[] args) {
        Circle1 c = new Circle1(100);
        System.out.println("Area of Circle " + c.getArea());

        // Note: You cannot do 'new Shape1()' because it is abstract!
        Shape1 shapeRectangleObj = new Rectangle1("Red");
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(4);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());

        Shape1 shapeTriangleObj = new Triangle1("Blue");
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setBase(15);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
    }
}
