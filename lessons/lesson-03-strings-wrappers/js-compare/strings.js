// JavaScript — Strings
// Run: node strings.js

let s = "Hello World";

console.log(s.length);           // 11 — property (no parentheses)
console.log(s.toUpperCase());    // "HELLO WORLD"
console.log(s.toLowerCase());    // "hello world"
console.log(s.substring(0, 5)); // "Hello"
console.log(s.indexOf("World"));// 6
console.log(s.includes("llo")); // true
console.log(s.split(" "));     // ["Hello", "World"]
console.log(s.trim());

// Template literals
let name = "Alice";
console.log(`Hello, ${name}!`);

// Equality
let a = "hello";
let b = "hello";
console.log(a === b);  // true

// Parsing
console.log(parseInt("42"));     // 42
console.log(parseFloat("3.14")); // 3.14
console.log(String(42));         // "42"
