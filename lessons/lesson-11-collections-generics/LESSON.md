# Lesson 11: Generics & Collections (~20 min) ⭐ SBA CRITICAL

## 🎯 Goal
Master ArrayList and Array↔List conversion. Know HashMap basics. Understand generics from TypeScript.

---

## 1. TypeScript Reminder (2 min)
You know generics from TypeScript: `Array<number>`, `Map<string, number>`.
Java generics work the same way: `ArrayList<Integer>`, `HashMap<String, Integer>`.

---

## 2. ArrayList — Java's Dynamic Array (8 min)

> Open both files side-by-side

| JS Array | Java ArrayList | Notes |
|---|---|---|
| `let arr = []` | `ArrayList<Integer> list = new ArrayList<>()` | Must declare type |
| `arr.push(5)` | `list.add(5)` | |
| `arr[0]` | `list.get(0)` | Can't use [] on ArrayList |
| `arr[0] = 10` | `list.set(0, 10)` | |
| `arr.splice(i, 1)` | `list.remove(i)` | |
| `arr.length` | `list.size()` | Method, not property |
| `arr.includes(5)` | `list.contains(5)` | |

**Why ArrayList over arrays?** Dynamic size! Can grow and shrink.

---

## 3. ⭐ SBA Pattern: Array ↔ List Conversion (5 min)

> Open `java-code/ArrayListConversion.java`

```java
// Array → List
String[] arr = {"a", "b", "c"};
List<String> list = new ArrayList<>(Arrays.asList(arr));

// List → Array
String[] back = list.toArray(new String[0]);
```

---

## 4. HashMap (3 min)

> Open `java-code/HashMapDemo.java`

Like JS `Map` or plain objects:
```java
HashMap<String, Integer> scores = new HashMap<>();
scores.put("Alice", 95);
scores.get("Alice");  // 95
```

---

## 5. GLAB/PA Handoff (2 min)
- ✅ **GLAB 303.11.2-3** (ArrayList) — **Do these first! Most SBA-relevant.**
- ✅ **GLAB 303.11.6** (HashMap/TreeMap) — Good to know.
- ✅ **PA 303.11.1** — Collections practice
- GLABs 303.11.1, 4, 5, 7 — Complete as time allows.
