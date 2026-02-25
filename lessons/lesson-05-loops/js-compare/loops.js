// JavaScript — Loops
// Run: node loops.js

// for loop
for (let i = 0; i < 5; i++) {
    console.log("for:", i);
}

// while loop
let count = 5;
while (count > 0) {
    console.log("while:", count);
    count--;
}

// do-while
let x = 0;
do {
    console.log("do-while:", x);
    x++;
} while (x < 3);

// for...of (iterate over array values)
let fruits = ["apple", "banana", "cherry"];
for (let fruit of fruits) {
    console.log("for-of:", fruit);
}

// break and continue — same in Java
for (let i = 0; i < 10; i++) {
    if (i === 3) continue; // skip 3
    if (i === 7) break;    // stop at 7
    console.log(i);
}

// Sum of digits (the SBA pattern in JS)
let num = 12345;
let sum = 0;
while (num > 0) {
    let digit = num % 10;
    sum += digit;
    num = Math.floor(num / 10); // JS needs Math.floor!
}
console.log("Sum of digits:", sum); // 15
