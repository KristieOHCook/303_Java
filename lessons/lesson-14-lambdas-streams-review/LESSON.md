# Lesson 14: Lambdas, Streams & SBA Review (~20 min)

## 🎯 Goal
Arrow functions → lambdas. Streams = Java's `.filter().map()`. Then full SBA practice.

---

## 1. JS Reminder (2 min)
You already use arrow functions and `.filter().map().reduce()` every day. Java added the same thing in Java 8 — just different syntax.

---

## 2. JS vs Java: Lambdas & Streams (8 min)

> Open both files side-by-side

| JS | Java | Notes |
|---|---|---|
| `=>` | `->` | Arrow vs arrow |
| `arr.filter(x => ...)` | `list.stream().filter(x -> ...)` | Must call `.stream()` first |
| `arr.map(x => ...)` | `list.stream().map(x -> ...)` | Same idea |
| Returns new array | `.collect(Collectors.toList())` | Must "collect" back to list |
| `.reduce()` | `.reduce()` | Same concept |
| `.forEach()` | `.forEach()` | Same |

**Key differences:**
- Java needs `->` not `=>`
- Java needs `.stream()` to start
- Java needs `.collect()` to finish (streams are lazy)
- Java has **functional interfaces** (like `Predicate`, `Function`, `Consumer`)

---

## 3. Live Demos (5 min)

> Open `java-code/LambdaDemo.java` — basic lambda syntax
> Open `java-code/StreamDemo.java` — filter/map/collect pipeline

---

## 4. SBA Practice (5 min)

> Open `java-code/SBAPractice.java` — mini SBA simulation

This combines ALL skills from the course:
- Interface + implements ✅ (Lesson 10)
- Arrays + collections ✅ (Lessons 6, 11)
- Loops + while/modulus ✅ (Lesson 5)
- Methods + classes ✅ (Lesson 8)
- Exception handling ✅ (Lesson 12)

---

## 5. GLAB/PA Handoff + Final Prep (2 min)
- ✅ **PA 303.14.1** — HackerRank lambdas
- 🎯 **KBA** — Advanced Java knowledge check
- 🎯 **SBA 303** — FINAL ASSESSMENT — review the practice exercises
