# Lesson 4: Control Flow (~15 min)

## 🎯 Goal
This is almost identical to JS. Focus on the input validation pattern — it's used in the SBA.

---

## 1. JS Reminder (1 min)
You already know if/else and switch. Java is **literally the same syntax**.

---

## 2. JS vs Java: Side-by-Side (5 min)

> Open both files side-by-side

The only real differences:
- Java uses `System.out.println()` instead of `console.log()`
- No `===` — Java uses `==` for primitives, `.equals()` for objects
- Switch in Java works on `String` since Java 7

---

## 3. SBA Pattern: Input Validation (5 min)

> Open `java-code/Validation.java`

This exact pattern shows up in the SBA Sport task:
```java
if (id < 1 || id > playerIDs.length) {
    System.out.println("Invalid player id: " + id);
    return;  // early return!
}
```

**Teach the "guard clause" pattern** — validate first, return early, then do the work.

---

## 4. Live Exercise (4 min)

> Open `java-code/Exercise.java`

Number validator: read an int, check if it's in range 1-100, categorize it.

---

## 5. GLAB/PA Handoff (1 min)
- ✅ **PA 303.4.1** — This is JS if/else in Java clothes. Go do it.
