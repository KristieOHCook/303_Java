# Lesson 5: Loops (~20 min) ⭐ SBA CRITICAL

## 🎯 Goal
Master the while loop + modulus pattern. This is directly tested on the SBA.

---

## 1. JS Reminder (2 min)
Loops in JS and Java are nearly identical. The only new thing is Java's **enhanced for** uses `:` instead of `of`.

---

## 2. JS vs Java: All Loop Types (5 min)

> Open both files side-by-side

| JS | Java | Notes |
|---|---|---|
| `for (let i = 0; ...)` | `for (int i = 0; ...)` | `let` → `int` |
| `while (cond) {}` | `while (cond) {}` | Identical |
| `do {} while (cond)` | `do {} while (cond)` | Identical |
| `for (let x of arr)` | `for (int x : arr)` | `of` → `:` |
| `for (let k in obj)` | N/A | Use Map iteration instead |

---

## 3. ⭐ SBA Pattern: While + Modulus (8 min)

> Open `java-code/DigitExtraction.java` — THIS IS THE SBA SKILL

The "Sum of Digits" pattern:
```java
while (num > 0) {
    int digit = num % 10;   // get last digit
    sum += digit;            // do something with it
    num /= 10;               // remove last digit
}
```

Walk through with `12345`:
- `12345 % 10` = **5**, `12345 / 10` = `1234`
- `1234 % 10` = **4**, `1234 / 10` = `123`
- `123 % 10` = **3**, `123 / 10` = `12`
- `12 % 10` = **2**, `12 / 10` = `1`
- `1 % 10` = **1**, `1 / 10` = `0` → loop ends

---

## 4. Live Exercise (5 min)

> Open `java-code/Exercise.java`

Reverse a number using the same while/modulus pattern (NOT sum — build a reversed number).

---

## 5. GLAB/PA Handoff (2 min)
- ✅ **GLAB 303.5.1** — For loop practice
- ✅ **GLAB 303.5.2** — While loop practice
- ✅ **PA 303.5.1** — Loop exercises

---

## Key Takeaways
```
The SBA while/modulus pattern — memorize this:
    while (num > 0) {
        int digit = num % 10;   // extract
        // ... do work ...
        num /= 10;              // advance
    }
```
