# Lesson 9: Encapsulation & Inheritance (~20 min)

## 🎯 Goal
Learn private fields + getters/setters. Understand `extends` and `super` (same as JS).

---

## 1. JS Reminder (2 min)
- JS got `#private` fields recently. Java has had `private` forever — it's compiler-enforced.
- `extends` and `super` work the same as JS.

---

## 2. Encapsulation: Private + Getters/Setters (8 min)

> Open both files side-by-side

**Why?** Protect data from being set to invalid values.
Instead of `player.age = -5` (anyone can set anything), force them through `setAge()` where you validate.

| JS | Java |
|---|---|
| `#name` (new) | `private String name;` |
| `getName()` | `public String getName()` |
| Optional | IntelliJ generates them: Alt+Insert → Getter/Setter |

---

## 3. Inheritance: extends & super (8 min)

> Open `java-code/Inheritance.java`

```java
public class Student extends Person {
    private double gpa;
    
    public Student(String name, int age, double gpa) {
        super(name, age);    // call parent constructor — same as JS!
        this.gpa = gpa;
    }
}
```

**`@Override` annotation** — Java requires this when overriding a parent method. JS doesn't.

---

## 4. Live Exercise (3 min)

> Open `java-code/Exercise.java` — build an Employee/Manager hierarchy

---

## 5. GLAB/PA Handoff (2 min)
- ✅ **GLAB 303.9.1** — Encapsulation exercise
- ✅ **GLAB 303.9.2** — Basic inheritance
- ✅ **PA 303.9.1** — Inheritance & overloading practice
