import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Java — Streams (like JS .filter().map() chains)

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ============================================
        // filter — keep elements matching a condition
        // JS:   numbers.filter(n => n % 2 === 0)
        // Java: numbers.stream().filter(n -> n % 2 == 0).collect(...)
        // ============================================
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Evens: " + evens);  // [2, 4, 6, 8, 10]


        // ============================================
        // map — transform each element
        // JS:   numbers.map(n => n * 2)
        // Java: numbers.stream().map(n -> n * 2).collect(...)
        // ============================================
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Doubled: " + doubled);


        // ============================================
        // Chaining — filter THEN map (just like JS!)
        // ============================================
        List<Integer> doubledEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Doubled evens: " + doubledEvens);  // [4, 8, 12, 16, 20]


        // ============================================
        // reduce — combine all elements into one value
        // JS:   numbers.reduce((acc, n) => acc + n, 0)
        // Java: numbers.stream().reduce(0, (acc, n) -> acc + n)
        // ============================================
        int sum = numbers.stream()
                .reduce(0, (acc, n) -> acc + n);
        System.out.println("Sum: " + sum);  // 55


        // ============================================
        // String stream example
        // ============================================
        List<String> names = Arrays.asList("alice", "bob", "charlie", "diana");

        List<String> longNamesUpper = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)         // method reference
                .collect(Collectors.toList());
        System.out.println("Long names: " + longNamesUpper);  // [ALICE, CHARLIE, DIANA]
    }
}
