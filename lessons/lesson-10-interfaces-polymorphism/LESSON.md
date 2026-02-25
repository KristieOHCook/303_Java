# Lesson 10: Interfaces, Polymorphism & Abstraction (~20 min) ⭐⭐ SBA CORE

## 🎯 Goal
This is THE SBA lesson. Master interfaces and implementing classes. This mirrors the Sport task exactly.

---

## 1. TypeScript Reminder (2 min)
You already know interfaces from TypeScript!
```typescript
interface Animal {
    name: string;
    makeSound(): void;
}
```
Java interfaces are the same concept — a contract that classes must fulfill.

---

## 2. Interfaces (8 min)

> Open both files side-by-side: `js-compare/interfaces.ts` and `java-code/Vehicle.java`

| TypeScript | Java | Notes |
|---|---|---|
| `interface Sport { }` | `public interface Sport { }` | Same concept |
| `class Cricket implements Sport` | `class Cricket implements Sport` | Same keyword! |
| Methods have types | Methods have types | Both enforce the contract |
| Optional properties `?` | No optional — must implement all | Java is stricter |

**Key rules:**
- A class can implement **multiple** interfaces
- Interface methods have no body (just the signature)
- `@Override` annotation when implementing

---

## 3. ⭐⭐ SBA Pattern: The Full Vehicle Exercise (8 min)

> Open the `java-code/` folder — walk through all files in order:
> 1. `Vehicle.java` (interface)
> 2. `Car.java` (implements Vehicle + extra method)
> 3. `Motorcycle.java` (implements Vehicle)
> 4. `Main.java` (demo)

This mirrors the Sport/Cricket/Football structure from the SBA.

---

## 4. Live Exercise (3 min)

> Open `java-code/Exercise.java` — Printer interface exercise
> Students build: `Printer` (interface) → `InkjetPrinter` + `LaserPrinter` (implements)
> Same pattern as SBA: interface methods + class-specific extra methods

---

## 5. Abstract Classes vs Interfaces (2 min)
- **Interface** = pure contract, no implementation (use `implements`)
- **Abstract class** = partial implementation, can have fields/methods with bodies (use `extends`)
- Use interface when you need a contract. Use abstract when you need shared code.

---

## 6. GLAB/PA Handoff (2 min)
- ✅ **GLAB 303.10.1** — Object type casting
- ✅ **GLAB 303.10.2** — Polymorphism & overriding
- ✅ **GLAB 303.10.3** — Abstraction
- ✅ **GLAB 303.10.4** — Interfaces — **do this one first, it's the most SBA-relevant!**
- ✅ **PA 303.10.1-3** — All three. These are your SBA prep.
- 📝 **KBA 303 + SBA Pre-Assessment** — checkpoint after this lesson!
