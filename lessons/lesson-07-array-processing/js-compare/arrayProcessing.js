// JavaScript — Array Processing & Utility Methods
// Run: node arrayProcessing.js

// In JS, arrays have built-in methods. Java needs a separate Arrays utility class.

const scores = [88, 42, 95, 67, 73, 55, 91];

// ---- Sorting ----
// JS: .sort() mutates in-place (watch out: string sort by default!)
const sorted = [...scores].sort((a, b) => a - b);
console.log("Sorted:", sorted);
// Java: Arrays.sort(arr) — always numeric for int[]

// ---- toString equivalent ----
console.log("Print array:", scores);
console.log("As string:", scores.toString());
// Java: Arrays.toString(arr) — without this, Java prints memory address

// ---- Searching (find / indexOf) ----
const found = scores.find(s => s > 90);
console.log("First > 90:", found);
// Java: manual linear search or Arrays.binarySearch (must sort first)

const idx = scores.indexOf(67);
console.log("Index of 67:", idx);

// ---- Fill ----
const filled = new Array(5).fill(0);
console.log("Filled:", filled);
// Java: Arrays.fill(arr, 0)

// ---- Copying ----
const copy = [...scores];          // spread
const slice = scores.slice(0, 3);  // partial copy
console.log("Copy:", copy);
console.log("Slice:", slice);
// Java: Arrays.copyOf(arr, len) or System.arraycopy()

// ---- Summing / Max / Min ----
const sum = scores.reduce((a, b) => a + b, 0);
const max = Math.max(...scores);
const min = Math.min(...scores);
console.log("Sum:", sum, "Max:", max, "Min:", min);
// Java: manual loop (no reduce on arrays)

// ---- Reverse ----
const reversed = [...scores].reverse();
console.log("Reversed:", reversed);
// Java: manual swap loop
