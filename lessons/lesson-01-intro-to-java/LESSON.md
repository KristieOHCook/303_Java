# Lesson 1: Welcome to Java (~15 min)

## 🎯 Goal
Get Java running in IntelliJ. Understand how Java differs from JavaScript at a structural level.

---

## 1. Why Java? (2 min)
- **Compiled** → runs on the JVM (Java Virtual Machine) — "write once, run anywhere"
- **Strongly & statically typed** — types checked at compile time, not runtime
- **Enterprise dominant** — banks, Android, large backend systems
- You already know the *logic*. Today we learn the *syntax*.

---

## 2. JS vs Java: Hello World (5 min)

> Open both files side-by-side: `js-compare/hello.js` and `java-code/HelloWorld.java`

| JavaScript | Java |
|---|---|
| No class needed | Everything lives in a class |
| `console.log()` | `System.out.println()` |
| Run with `node file.js` | Compile + run: `javac` then `java` (IntelliJ does both) |
| File can be named anything | File **must** match the class name |
| Semicolons optional | Semicolons **required** |

---

## 3. Live Demo: IntelliJ Setup (8 min)
1. Open IntelliJ → **New Project** → Java → JDK 17+
2. Create a class `HelloWorld`
3. Type `psvm` + Tab → generates `public static void main`
4. Type `sout` + Tab → generates `System.out.println()`
5. Click ▶ Run

**IntelliJ shortcuts to show:**
- `psvm` → main method
- `sout` → println
- `Ctrl+Shift+F10` → Run current file

---

## 4. GLAB/PA Handoff (2 min)
- ~~GLAB 303.1.2A~~ — **SKIP** (not applicable to our setup)
- ✅ **GLAB 303.1.2B** — IntelliJ setup guide. Follow this to confirm your setup.
- ✅ **GLAB 303.1.1** — JDK installation. You just did this.

---

## Key Takeaways
```
JavaScript:  console.log("Hello World");
Java:        System.out.println("Hello World");   // inside a class + main method
```
