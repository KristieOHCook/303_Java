// Car implements Vehicle (like Cricket implements Sport)

public class Car implements Vehicle {

    String brand;
    int topSpeed;
    int[] seatOccupancy;  // mirrors the playerIDs pattern from SBA

    // Constructor — initializes seats (like the team constructor in the SBA)
    public Car(String brand, int topSpeed, int seats) {
        this.brand = brand;
        this.topSpeed = topSpeed;
        this.seatOccupancy = new int[seats];
        for (int i = 0; i < seatOccupancy.length; i++) {
            seatOccupancy[i] = 0;  // 0 = empty, 1 = occupied
        }
        System.out.println("New " + brand + " created with " + seats + " seats");
    }

    // Must implement — from interface
    @Override
    public void startEngine() {
        System.out.println(brand + " engine started! Vroom!");
    }

    // Must implement — from interface
    @Override
    public int getTopSpeed() {
        return topSpeed;
    }

    // EXTRA method — not in the interface (like playerTransfer in Football)
    public void openTrunk() {
        System.out.println(brand + " trunk opened");
    }

    // Method with validation — mirrors retirePlayer from SBA
    public void fillSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seatOccupancy.length) {
            System.out.println("Invalid seat number: " + seatNumber);
            return;
        }
        if (seatOccupancy[seatNumber - 1] == 1) {
            System.out.println("Seat " + seatNumber + " is already occupied");
            return;
        }
        seatOccupancy[seatNumber - 1] = 1;
        System.out.println("Seat " + seatNumber + " is now occupied");
    }
}
