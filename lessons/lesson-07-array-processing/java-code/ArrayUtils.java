import java.util.Arrays;

// Java — Array Utility Methods

public class ArrayUtils {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 9, 2, 7};

        // Print array (can't just println!)
        System.out.println(Arrays.toString(arr));  // [5, 3, 8, 1, 9, 2, 7]

        // Sort (modifies the original array!)
        int[] sorted = Arrays.copyOf(arr, arr.length);  // copy first
        Arrays.sort(sorted);
        System.out.println("Sorted: " + Arrays.toString(sorted));   // [1, 2, 3, 5, 7, 8, 9]
        System.out.println("Original: " + Arrays.toString(arr));     // unchanged

        // Fill an array
        int[] zeros = new int[5];
        Arrays.fill(zeros, 42);
        System.out.println("Filled: " + Arrays.toString(zeros));    // [42, 42, 42, 42, 42]

        // Copy an array (like JS spread [...arr])
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copy: " + Arrays.toString(copy));

        // Copy a portion
        int[] partial = Arrays.copyOfRange(arr, 1, 4);  // index 1 to 3
        System.out.println("Partial: " + Arrays.toString(partial)); // [3, 8, 1]

        // Check equality
        System.out.println(Arrays.equals(arr, copy));   // true
    }
}
