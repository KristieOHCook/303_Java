// JavaScript — Classes
// Run: node classes.js

class Dog {
    // Constructor
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    // Method (no return type needed)
    bark() {
        console.log(`${this.name} says Woof!`);
    }

    // Method with return
    getInfo() {
        return `${this.name} is ${this.age} years old`;
    }

    // Static method
    static describe() {
        console.log("Dogs are loyal animals");
    }
}

// Create instance
const d = new Dog("Rex", 3);
d.bark();
console.log(d.getInfo());
Dog.describe();

// JS has no method overloading — you'd use default params:
class Calculator {
    add(a, b = 0) {
        return a + b;
    }
}
