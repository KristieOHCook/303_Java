// JavaScript — Variables & Types
// Run: node variables.js

// Dynamic typing — no type declarations
let name = "Alice";
let age = 25;
let gpa = 3.8;
let isActive = true;

console.log(typeof name);     // "string"
console.log(typeof age);      // "number"  (no int vs double distinction!)
console.log(typeof gpa);      // "number"
console.log(typeof isActive); // "boolean"

// Type coercion (JS is loose)
let result = "5" + 3;   // "53" — string concatenation
let result2 = "5" - 3;  // 2 — numeric subtraction
console.log(result, result2);

// Operators — same in both languages
console.log(10 + 3);    // 13
console.log(10 - 3);    // 7
console.log(10 * 3);    // 30
console.log(10 / 3);    // 3.333...  (always decimal in JS)
console.log(10 % 3);    // 1         (remainder / modulus)

// Equality
console.log(5 == "5");   // true  — loose equality
console.log(5 === "5");  // false — strict equality
