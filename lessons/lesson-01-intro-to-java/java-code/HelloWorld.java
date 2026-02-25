// Java — Hello World
// Everything must be inside a class.
// The filename MUST match the class name: HelloWorld.java

public class HelloWorld {

    // This is the entry point — Java always starts here
    // public = accessible everywhere
    // static = belongs to the class, not an instance
    // void   = returns nothing
    // main   = special method name Java looks for
    // String[] args = command line arguments (like process.argv in Node)
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("My name is Alice");
        System.out.println("I am " + 25 + " years old");

        // No template literals in Java!
        // Use + for concatenation, or printf:
        System.out.printf("Using printf: %d%n", 2 + 2);
    }
}
