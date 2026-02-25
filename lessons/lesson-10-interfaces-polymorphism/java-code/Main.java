// Main — demonstrates everything (mirrors the SBA's Main.java)

public class Main {
    public static void main(String[] args) {

        // Create vehicles (like creating Cricket and Football teams)
        Car car = new Car("Toyota", 130, 5);
        Motorcycle moto = new Motorcycle("Ducati", 185);

        System.out.println();

        // Call interface methods
        car.startEngine();
        System.out.println("Top speed: " + car.getTopSpeed() + " mph");

        moto.startEngine();
        System.out.println("Top speed: " + moto.getTopSpeed() + " mph");

        System.out.println();

        // Call class-specific methods
        car.openTrunk();           // Car only
        moto.doWheelie();          // Motorcycle only

        System.out.println();

        // Demonstrate the validation pattern (like retirePlayer)
        car.fillSeat(1);           // valid
        car.fillSeat(1);           // already occupied
        car.fillSeat(10);          // invalid seat number

        System.out.println();

        // Polymorphism — treat both as Vehicle
        Vehicle v1 = car;           // Car IS-A Vehicle
        Vehicle v2 = moto;          // Motorcycle IS-A Vehicle
        v1.startEngine();           // calls Car's version
        v2.startEngine();           // calls Motorcycle's version

        // v1.openTrunk();  ← ERROR! Vehicle doesn't know about openTrunk
        // Must cast: ((Car) v1).openTrunk();

        // instanceof
        System.out.println(car instanceof Vehicle);       // true
        System.out.println(moto instanceof Vehicle);      // true
        System.out.println(car instanceof Car);            // true
        System.out.println(car instanceof Motorcycle);     // false
    }
}
