// Motorcycle implements Vehicle (like Football implements Sport)

public class Motorcycle implements Vehicle {

    String brand;
    int topSpeed;

    public Motorcycle(String brand, int topSpeed) {
        this.brand = brand;
        this.topSpeed = topSpeed;
        System.out.println("New " + brand + " motorcycle created");
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " engine roars!");
    }

    @Override
    public int getTopSpeed() {
        return topSpeed;
    }

    // Extra method — motorcycle-specific
    public void doWheelie() {
        System.out.println(brand + " does a wheelie!");
    }
}
