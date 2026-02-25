// Java — Strings

public class Strings {
    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println(s.length());          // 11 — METHOD (parentheses!)
        System.out.println(s.toUpperCase());     // "HELLO WORLD"
        System.out.println(s.toLowerCase());     // "hello world"
        System.out.println(s.substring(0, 5));   // "Hello"
        System.out.println(s.indexOf("World"));  // 6
        System.out.println(s.contains("llo"));   // true (not "includes"!)
        System.out.println(s.trim());

        // Split returns String array (not a dynamic JS array)
        String[] words = s.split(" ");
        System.out.println(words[0]); // "Hello"
        System.out.println(words[1]); // "World"

        // No template literals — use concatenation
        String name = "Alice";
        System.out.println("Hello, " + name + "!");

        // Or printf
        System.out.printf("Hello, %s!%n", name);

        // String equality — USE .equals() !!
        String a = "hello";
        String b = "hello";
        System.out.println(a == b);       // might be true (string pool quirk)
        System.out.println(a.equals(b));  // ALWAYS true — use this!

        // charAt — get a single character
        char first = s.charAt(0);  // 'H'
        System.out.println("First char: " + first);

        // Wrapper classes — parsing
        int num = Integer.parseInt("42");       // like parseInt()
        double dec = Double.parseDouble("3.14"); // like parseFloat()
        String str = String.valueOf(42);         // like String(42)
        System.out.println(num + " " + dec + " " + str);

        // Character utility methods (no JS equivalent)
        System.out.println(Character.isLetter('A'));   // true
        System.out.println(Character.isDigit('5'));    // true
        System.out.println(Character.toUpperCase('a')); // 'A'
    }
}
