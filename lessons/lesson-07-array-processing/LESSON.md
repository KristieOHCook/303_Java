# Lesson 7: Array Processing & Manipulation (~15 min) ⭐ SBA CRITICAL

## 🎯 Goal
Learn array utility methods. Practice the manipulation patterns needed for the SBA.

---

## 1. JS Reminder (2 min)
JS arrays have tons of built-in methods (map, filter, reduce, push, pop...).
Java arrays have almost nothing. You use `Arrays` utility class or write loops.

---

## 2. Java Array Utilities (5 min)

> Open `java-code/ArrayUtils.java`

| What you want | JS | Java |
|---|---|---|
| Print array | `console.log(arr)` | `Arrays.toString(arr)` |
| Sort | `arr.sort()` | `Arrays.sort(arr)` |
| Copy | `[...arr]` | `Arrays.copyOf(arr, arr.length)` |
| Fill | `arr.fill(0)` | `Arrays.fill(arr, 0)` |
| Check equality | JSON.stringify comparison | `Arrays.equals(arr1, arr2)` |

---

## 3. Array Manipulation Patterns (5 min)

> Open `java-code/ArrayManipulation.java`

- Searching (linear search)
- Summing, finding max/min (builds on Lesson 6)
- Modifying elements at an index (with validation — SBA pattern!)

---

## 4. Live Exercise (3 min)

> Open `java-code/Exercise.java`

Given grades array: calculate average, find all above average, replace a grade with validation.

---

## 5. GLAB/PA Handoff (1 min)
- ✅ **PA 303.7.1** — Array practice
- ✅ **PA 303.7.2** — HackerRank (Missing Number) — **great SBA prep!**
