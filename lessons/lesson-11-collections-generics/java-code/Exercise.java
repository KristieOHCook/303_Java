import java.util.ArrayList;
import java.util.Arrays;

// EXERCISE: Score Processor (SBA-style Array ↔ List manipulation)
//
// Given an int[] of test scores:
// 1. Convert to ArrayList<Integer>
// 2. Remove all scores below 60 (failing)
// 3. Add a 5-point curve to each remaining score (cap at 100)
// 4. Convert back to int[]
// 5. Print the result

public class Exercise {
    public static void main(String[] args) {

        int[] scores = {85, 42, 95, 58, 73, 91, 37, 88, 65, 100};
        System.out.println("Original: " + Arrays.toString(scores));

        // TODO Step 1: Convert to ArrayList<Integer>


        // TODO Step 2: Remove scores below 60
        // HINT: loop backward when removing!


        // TODO Step 3: Add 5-point curve (cap at 100)
        // HINT: use Math.min(score + 5, 100)


        // TODO Step 4: Convert back to int[]


        // TODO Step 5: Print result
        // System.out.println("Final: " + Arrays.toString(result));
    }
}
