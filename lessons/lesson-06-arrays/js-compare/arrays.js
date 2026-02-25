// JavaScript — Arrays
// Run: node arrays.js

// Dynamic, mixed types, no size limit
let arr = [1, 2, 3, 4, 5];
console.log(arr.length);  // 5
arr.push(6);               // grows!
console.log(arr.length);  // 6

// Mixed types (Java can't do this)
let mixed = [1, "two", true, null];

// Accessing elements
console.log(arr[0]);   // 1
console.log(arr[arr.length - 1]); // 6 (last element)

// Iterating
for (let i = 0; i < arr.length; i++) {
    console.log("index:", i, "value:", arr[i]);
}

for (let val of arr) {
    console.log("for-of:", val);
}

// Array methods JS devs love (Java doesn't have these on arrays!)
let doubled = arr.map(x => x * 2);
let evens = arr.filter(x => x % 2 === 0);
let sum = arr.reduce((acc, x) => acc + x, 0);
console.log("doubled:", doubled);
console.log("evens:", evens);
console.log("sum:", sum);
