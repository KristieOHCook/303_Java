# Lesson 8: Classes, Methods & Constructors (~20 min) ⭐ SBA CRITICAL

## 🎯 Goal
Translate JS class knowledge to Java. Master the constructor + array init pattern from the SBA.

---

## 1. JS Reminder (2 min)
You've written classes in JS. Java classes are the same concept — just more explicit about types and access.

---

## 2. JS vs Java: Classes (8 min)

> Open both files side-by-side

| JS | Java | Notes |
|---|---|---|
| `class Dog {` | `public class Dog {` | access modifier required |
| `constructor(name)` | `public Dog(String name)` | No "constructor" keyword, use class name |
| `this.name = name` | `this.name = name` | Same! |
| `bark() {` | `public void bark() {` | Return type required |
| `new Dog("Rex")` | `new Dog("Rex")` | Same! |
| No type on fields | Fields declared with types | `String name;`, `int age;` |

**New in Java:**
- Method **overloading** — same method name, different parameters (JS can't do this)
- Access modifiers: `public`, `private`, `protected` (JS only recently got `#private`)
- `static` methods belong to the class, not instances (like JS `static`)

---

## 3. ⭐ SBA Pattern: Constructor with Array Init (5 min)

> Open `java-code/TeamDemo.java`

This is the Cricket/Football constructor from the SBA:
```java
public class Team {
    int[] playerIDs;
    
    public Team() {
        this.playerIDs = new int[11];
        for (int i = 0; i < this.playerIDs.length; i++) {
            this.playerIDs[i] = 1;  // active
        }
    }
}
```

---

## 4. Live Exercise (5 min)

> Open `java-code/Exercise.java`

Create a `Student` class with fields, constructor, and a method to calculate GPA.

---

## 5. GLAB/PA Handoff (1 min)
No dedicated GLABs for this lesson — the skills carry directly into Lessons 9 and 10, which have the labs.
