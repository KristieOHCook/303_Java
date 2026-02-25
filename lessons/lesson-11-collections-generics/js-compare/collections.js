// JavaScript — Collections
// Run: node collections.js

// Arrays (dynamic, mixed types)
let list = [1, 2, 3];
list.push(4);              // add to end
list.splice(1, 1);         // remove at index 1
console.log(list);         // [1, 3, 4]
console.log(list.length);  // 3
console.log(list.includes(3)); // true

// Map (like Java HashMap)
let map = new Map();
map.set("Alice", 95);
map.set("Bob", 87);
console.log(map.get("Alice")); // 95
console.log(map.has("Bob"));   // true
map.delete("Bob");
for (let [key, value] of map) {
    console.log(`${key}: ${value}`);
}

// Set (like Java HashSet)
let set = new Set([1, 2, 3, 2, 1]);
console.log(set);          // Set { 1, 2, 3 } — duplicates removed
set.add(4);
console.log(set.has(2));   // true

// Array conversion
let arr = [1, 2, 3];
let fromArr = [...arr];    // copy
let backToArr = Array.from(set); // Set → Array

// TypeScript generics (same concept as Java)
// function identity<T>(arg: T): T { return arg; }
// let nums: Array<number> = [1, 2, 3];
