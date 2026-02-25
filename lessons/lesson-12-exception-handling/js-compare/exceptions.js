// JavaScript — Exception Handling
// Run: node exceptions.js

// Basic try/catch (same structure as Java)
try {
    let result = riskyOperation();
} catch (error) {
    console.log("Error: " + error.message);
} finally {
    console.log("This always runs");
}

function riskyOperation() {
    throw new Error("Something went wrong!");
}

// Type checking (JS doesn't have typed catches)
try {
    JSON.parse("invalid json");
} catch (error) {
    if (error instanceof SyntaxError) {
        console.log("Syntax error: " + error.message);
    } else {
        console.log("Other error: " + error.message);
    }
}

// No "checked exceptions" in JS
// In Java, some exceptions MUST be caught or declared
