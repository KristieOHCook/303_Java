// JavaScript (Node.js) — File I/O
// Run: node fileIO.js

const fs = require("fs");

// ---------- Reading a file ----------
const content = fs.readFileSync("data.txt", "utf-8");
console.log("File contents:");
console.log(content);

// Process line by line
const lines = content.split("\n");
for (const line of lines) {
    console.log("Line: " + line);
}

// ---------- Writing a file ----------
const output = "Hello from JS!\nLine 2\nLine 3";
fs.writeFileSync("output.txt", output);
console.log("File written!");

// No need to "close" files — JS handles it automatically
// In Java you must close resources (or use try-with-resources)
