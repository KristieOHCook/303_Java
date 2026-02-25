// JavaScript — Lambdas & Array Methods
// Run: node lambdas.js

// Arrow functions
const greet = (name) => "Hello " + name;
console.log(greet("World"));

// Array methods — you do this every day!
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// filter: keep only evens
const evens = numbers.filter((n) => n % 2 === 0);
console.log("Evens:", evens);

// map: double each
const doubled = numbers.map((n) => n * 2);
console.log("Doubled:", doubled);

// chaining: filter then map
const doubledEvens = numbers
    .filter((n) => n % 2 === 0)
    .map((n) => n * 2);
console.log("Doubled evens:", doubledEvens);

// reduce: sum all
const sum = numbers.reduce((acc, n) => acc + n, 0);
console.log("Sum:", sum);

// forEach
numbers.forEach((n) => process.stdout.write(n + " "));
console.log();

// In Java: same ideas, different syntax
//   => becomes ->
//   Must call .stream() first
//   Must call .collect() to get a list back
