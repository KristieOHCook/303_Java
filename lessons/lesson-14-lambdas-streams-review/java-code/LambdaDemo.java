import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

// Java — Lambda Expressions (like JS arrow functions)

public class LambdaDemo {
    public static void main(String[] args) {

        // ============================================
        // Basic lambda syntax: (params) -> expression
        // JS:   (name) => "Hello " + name
        // Java: (name) -> "Hello " + name
        // ============================================

        // Functional interfaces — interfaces with ONE method
        // Java has built-in ones:

        // Predicate<T> — takes T, returns boolean (like a filter test)
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));   // true
        System.out.println("Is 7 even? " + isEven.test(7));   // false

        // Function<T, R> — takes T, returns R (like a map transform)
        Function<Integer, Integer> doubleIt = (n) -> n * 2;
        System.out.println("Double 5: " + doubleIt.apply(5)); // 10

        // Consumer<T> — takes T, returns nothing (like forEach)
        Consumer<String> shout = (s) -> System.out.println(s.toUpperCase());
        shout.accept("hello");  // HELLO


        // ============================================
        // Using lambdas with forEach (simplest use)
        // ============================================
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Old way
        for (String name : names) {
            System.out.println(name);
        }

        // Lambda way (same result)
        names.forEach(name -> System.out.println(name));

        // Method reference (shorthand)
        names.forEach(System.out::println);
    }
}
