// JavaScript — Encapsulation & Inheritance
// Run: node oop.js

// Encapsulation with #private (modern JS)
class Person {
    #name;
    #age;

    constructor(name, age) {
        this.#name = name;
        this.#age = age;
    }

    getName() { return this.#name; }
    getAge() { return this.#age; }
    setAge(age) {
        if (age < 0) {
            console.log("Invalid age!");
            return;
        }
        this.#age = age;
    }

    toString() {
        return `${this.#name}, age ${this.#age}`;
    }
}

// Inheritance
class Student extends Person {
    #gpa;

    constructor(name, age, gpa) {
        super(name, age);   // call parent constructor
        this.#gpa = gpa;
    }

    getGPA() { return this.#gpa; }

    // Override parent's toString
    toString() {
        return `${super.toString()}, GPA: ${this.#gpa}`;
    }
}

const p = new Person("Alice", 30);
console.log(p.toString());

const s = new Student("Bob", 20, 3.8);
console.log(s.toString());
s.setAge(-5); // Invalid!
