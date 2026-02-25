// Java — Variables & Types
// Every variable MUST declare its type

public class Variables {
    public static void main(String[] args) {

        // Primitive types
        String name = "Alice";       // Capital S — String is a class
        int age = 25;                // whole numbers
        double gpa = 3.8;           // decimal numbers
        boolean isActive = true;
        char grade = 'A';           // single character (single quotes!)

        System.out.println(name);
        System.out.println(age);
        System.out.println(gpa);
        System.out.println(isActive);
        System.out.println(grade);

        // Java is strict — this would NOT compile:
        // age = "hello";  // ERROR: incompatible types

        // Type casting (explicit)
        double x = 9.7;
        int rounded = (int) x;      // 9 — truncates, doesn't round!
        System.out.println("Cast 9.7 to int: " + rounded);

        // Implicit (widening — safe, automatic)
        int a = 5;
        double b = a;               // int → double is safe
        System.out.println("Widened: " + b);  // 5.0

        // Operators — same as JS
        System.out.println(10 + 3);   // 13
        System.out.println(10 - 3);   // 7
        System.out.println(10 * 3);   // 30
        System.out.println(10 / 3);   // 3  ← INTEGER DIVISION! (not 3.333)
        System.out.println(10.0 / 3); // 3.333... (use double for decimal result)
        System.out.println(10 % 3);   // 1  (modulus — CRITICAL for SBA!)

        // String comparison — NEVER use == for Strings!
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);       // might be true (string pool)
        System.out.println(s1.equals(s2));  // ALWAYS use .equals() for Strings
    }
}
