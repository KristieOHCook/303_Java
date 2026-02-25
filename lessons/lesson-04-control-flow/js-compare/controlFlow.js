// JavaScript — Control Flow
// Run: node controlFlow.js

let score = 85;

// if / else if / else — SAME in Java
if (score >= 90) {
    console.log("Grade: A");
} else if (score >= 80) {
    console.log("Grade: B");
} else if (score >= 70) {
    console.log("Grade: C");
} else {
    console.log("Grade: F");
}

// Ternary — SAME in Java
let result = score >= 60 ? "Pass" : "Fail";
console.log(result);

// Switch — SAME concept
let day = "Monday";
switch (day) {
    case "Monday":
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
    case "Friday":
        console.log("Weekday");
        break;
    case "Saturday":
    case "Sunday":
        console.log("Weekend");
        break;
    default:
        console.log("Invalid day");
}

// Validation pattern
function processId(id, maxPlayers) {
    if (id < 1 || id > maxPlayers) {
        console.log("Invalid id: " + id);
        return; // early return
    }
    console.log("Processing player " + id);
}

processId(5, 11);  // valid
processId(15, 11); // invalid
