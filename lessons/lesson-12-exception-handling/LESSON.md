# Lesson 12: Exception Handling (~15 min)

## 🎯 Goal
Translate JS try/catch to Java. Understand checked vs unchecked exceptions (new concept).

---

## 1. JS Reminder (2 min)
You know try/catch. Java's version is the same structure but with **typed** catch blocks.

---

## 2. JS vs Java: Try/Catch (5 min)

> Open both files side-by-side

| JS | Java | Notes |
|---|---|---|
| `catch (error)` | `catch (Exception e)` | Must specify exception type |
| One catch block | Multiple catch blocks | Catch different types separately |
| `throw new Error("msg")` | `throw new Exception("msg")` | Same concept |
| N/A | `throws` keyword | Must declare in method signature |
| `finally {}` | `finally {}` | Same |

**New concept:** Checked vs Unchecked exceptions
- **Unchecked** (`RuntimeException`): like JS — occur at runtime, don't need to declare
- **Checked** (`Exception`): Java-only — compiler FORCES you to handle or declare them

---

## 3. Try-Catch Patterns (5 min)

> Open `java-code/ExceptionDemo.java`

---

## 4. Live Exercise (3 min)

> Open `java-code/Exercise.java` — input validation with exceptions

---

## 5. GLAB/PA Handoff (2 min)
- ✅ **PA 303.12.1** — Exception handling practice
- ✅ **PA 303.12.2** — HackerRank exception challenge — SBA prep
