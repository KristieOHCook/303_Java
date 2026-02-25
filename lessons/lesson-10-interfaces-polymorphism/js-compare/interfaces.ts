// TypeScript — Interfaces (your students already know this!)
// This is NOT runnable JS — it's TypeScript to show the familiar syntax

// Interface = a contract
interface Vehicle {
    startEngine(): void;
    getTopSpeed(): number;
}

// Implementing the interface
class Car implements Vehicle {
    brand: string;
    topSpeed: number;

    constructor(brand: string, topSpeed: number) {
        this.brand = brand;
        this.topSpeed = topSpeed;
    }

    startEngine(): void {
        console.log(`${this.brand} engine started! Vroom!`);
    }

    getTopSpeed(): number {
        return this.topSpeed;
    }

    // Extra method — not in the interface
    openTrunk(): void {
        console.log("Trunk opened");
    }
}

class Motorcycle implements Vehicle {
    brand: string;
    topSpeed: number;

    constructor(brand: string, topSpeed: number) {
        this.brand = brand;
        this.topSpeed = topSpeed;
    }

    startEngine(): void {
        console.log(`${this.brand} engine roars!`);
    }

    getTopSpeed(): number {
        return this.topSpeed;
    }

    // Extra method
    doWheelie(): void {
        console.log("Wheelie!");
    }
}

// Usage
const car = new Car("Toyota", 130);
car.startEngine();
car.openTrunk();  // car-specific

const moto = new Motorcycle("Ducati", 185);
moto.startEngine();
moto.doWheelie(); // motorcycle-specific
