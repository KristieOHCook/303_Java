import java.util.Arrays;

// Java — Arrays (fixed size, single type!)

public class ArrayBasics {
    public static void main(String[] args) {

        // Two ways to create arrays
        int[] arr = {1, 2, 3, 4, 5};               // literal (size = 5, fixed!)
        int[] arr2 = new int[5];                     // empty array of size 5 (all zeros)

        System.out.println(arr.length);              // 5 — property (no parentheses!)
        // arr.push(6);  ← THIS DOESN'T EXIST. Arrays can't grow!

        // Accessing elements — same as JS
        System.out.println(arr[0]);                  // 1
        System.out.println(arr[arr.length - 1]);     // 5

        // Iterating with standard for
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index: " + i + " value: " + arr[i]);
        }

        // Enhanced for loop (like JS for...of, but with colon)
        for (int val : arr) {
            System.out.println("enhanced for: " + val);
        }

        // Print whole array — can't just println an array!
        System.out.println(arr);                     // prints garbage like [I@15db7
        System.out.println(Arrays.toString(arr));    // [1, 2, 3, 4, 5] ← use this!

        // Java arrays are FIXED SIZE:
        // - Can't push/pop/shift
        // - Can't change length
        // - For dynamic arrays, use ArrayList (Lesson 11)
    }
}
