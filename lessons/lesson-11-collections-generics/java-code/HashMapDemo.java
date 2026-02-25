import java.util.HashMap;

// Java — HashMap (like JS Map or plain objects)

public class HashMapDemo {
    public static void main(String[] args) {

        // Create a HashMap — key type, value type in angle brackets
        HashMap<String, Integer> scores = new HashMap<>();

        // Put (like JS map.set())
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);

        // Get (like JS map.get())
        System.out.println("Alice: " + scores.get("Alice"));  // 95

        // Check key exists (like JS map.has())
        System.out.println("Has Bob? " + scores.containsKey("Bob"));      // true
        System.out.println("Has Diana? " + scores.containsKey("Diana"));  // false

        // Size
        System.out.println("Size: " + scores.size());  // 3

        // Remove
        scores.remove("Bob");

        // Iterate
        System.out.println("\nAll scores:");
        for (String name : scores.keySet()) {
            System.out.println("  " + name + ": " + scores.get(name));
        }

        // getOrDefault (like JS map.get() || defaultValue)
        int dianaScore = scores.getOrDefault("Diana", 0);
        System.out.println("Diana: " + dianaScore);  // 0

        // Print whole map
        System.out.println("Map: " + scores);
    }
}
