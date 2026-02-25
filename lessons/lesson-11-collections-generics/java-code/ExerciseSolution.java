import java.util.ArrayList;
import java.util.Arrays;

// SOLUTION: Score Processor

public class ExerciseSolution {
    public static void main(String[] args) {

        int[] scores = {85, 42, 95, 58, 73, 91, 37, 88, 65, 100};
        System.out.println("Original: " + Arrays.toString(scores));

        // Step 1: Convert to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int s : scores) {
            list.add(s);
        }
        System.out.println("As list: " + list);

        // Step 2: Remove scores below 60 (loop backward!)
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 60) {
                list.remove(i);
            }
        }
        System.out.println("After removing < 60: " + list);

        // Step 3: Add 5-point curve (cap at 100)
        for (int i = 0; i < list.size(); i++) {
            int curved = Math.min(list.get(i) + 5, 100);
            list.set(i, curved);
        }
        System.out.println("After curve: " + list);

        // Step 4: Convert back to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        // Step 5: Print
        System.out.println("Final array: " + Arrays.toString(result));
    }
}
