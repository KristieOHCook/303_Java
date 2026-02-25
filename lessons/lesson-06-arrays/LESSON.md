# Lesson 6: Arrays (~20 min) ⭐ SBA CRITICAL

## 🎯 Goal
Understand Java's fixed-size arrays vs JS's dynamic arrays. Master array init + iteration patterns from the SBA.

---

## 1. JS Reminder (2 min)
JS arrays are dynamic, can hold mixed types, and grow/shrink freely.
Java arrays are **none of those things**. They are fixed-size, single-type containers.

---

## 2. JS vs Java: Arrays (5 min)

> Open both files side-by-side

| JS | Java | Notes |
|---|---|---|
| `let arr = [1, 2, 3]` | `int[] arr = {1, 2, 3}` | Curly braces, type declared |
| `arr.length` | `arr.length` | Both properties (no parentheses!) |
| `arr.push(4)` | N/A | Arrays can't grow! Use ArrayList |
| `arr[0]` | `arr[0]` | Same indexing |
| `for (let x of arr)` | `for (int x : arr)` | Colon not "of" |

---

## 3. ⭐ SBA Pattern: Array Initialization (5 min)

> Open `java-code/ArrayInit.java`

This pattern is from the SBA Sport task — initializing all players as active:
```java
int[] playerIDs = new int[11];
for (int i = 0; i < playerIDs.length; i++) {
    playerIDs[i] = 1;  // mark as active
}
```

---

## 4. ⭐ SBA Pattern: Average Calculation (5 min)

> Open `java-code/ArrayAverage.java`

Directly from the SBA `calculateAvgAge`:
```java
double sum = 0;
for (int age : ages) {
    sum += age;
}
double avg = sum / ages.length;
```

---

## 5. Live Exercise (3 min)

> Open `java-code/Exercise.java`

Create array of 10 scores → find max, min, average.

---

## 6. GLAB/PA Handoff (1 min)
- ✅ **GLAB 303.6.1** — Array basics. You just learned all of this.
