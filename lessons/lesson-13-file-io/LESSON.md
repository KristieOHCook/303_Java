# Lesson 13: File I/O (~15 min)

## 🎯 Goal
Read/write files in Java. Compare to Node.js `fs` module.

---

## 1. JS Reminder (2 min)
In Node you use `fs.readFileSync()` / `fs.writeFileSync()`. Java's version is more verbose but the same idea.

---

## 2. JS vs Java: File I/O (5 min)

> Open both files side-by-side

| JS (Node) | Java | Notes |
|---|---|---|
| `fs.readFileSync(path)` | `BufferedReader` + `FileReader` | Java separates "what" from "how" |
| `fs.writeFileSync(path, data)` | `BufferedWriter` + `FileWriter` | Same layered approach |
| Returns a string | Reads line-by-line | `.readLine()` returns one line |
| N/A | `try-with-resources` | Auto-closes file — no `.close()` needed |
| `file.split('\n')` | `while ((line = br.readLine()) != null)` | Common read loop pattern |

**Key new concept: try-with-resources**
```java
// Auto-closes the reader when done (uses Lesson 12 knowledge!)
try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    // use br
}
```

---

## 3. Live Demos (5 min)

> Open `java-code/FileReadDemo.java` — read a text file line-by-line
> Open `java-code/FileWriteDemo.java` — write output to file

Make sure `data.txt` exists in the java-code folder for the read demo.

---

## 4. Live Exercise (3 min)

> Open `java-code/Exercise.java` — read CSV, compute averages

---

## 5. GLAB/PA Handoff (2 min)
- ✅ **GLAB 303.13.1** — Reading files
- ✅ **GLAB 303.13.2** — Writing files
