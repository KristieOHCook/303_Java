import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ⭐ SBA PATTERN: Array ↔ ArrayList Conversion
// This is a key skill for the Array-to-List SBA task.

public class ArrayListConversion {
    public static void main(String[] args) {

        // ============================================
        // ARRAY → ArrayList
        // ============================================

        // Method 1: From a String array
        String[] nameArr = {"Alice", "Bob", "Charlie"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(nameArr));
        System.out.println("Array → List: " + nameList);

        // Method 2: From an int array (trickier — must use Integer!)
        int[] numArr = {1, 2, 3, 4, 5};
        ArrayList<Integer> numList = new ArrayList<>();
        for (int n : numArr) {
            numList.add(n);   // autoboxing: int → Integer
        }
        System.out.println("int[] → List: " + numList);


        // ============================================
        // ArrayList → ARRAY
        // ============================================

        // String list → String array
        String[] backToArr = nameList.toArray(new String[0]);
        System.out.println("List → Array: " + Arrays.toString(backToArr));

        // Integer list → int[] (manual conversion needed)
        int[] backToIntArr = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            backToIntArr[i] = numList.get(i);  // unboxing: Integer → int
        }
        System.out.println("List → int[]: " + Arrays.toString(backToIntArr));


        // ============================================
        // MANIPULATE then convert back (SBA pattern!)
        // ============================================

        int[] scores = {85, 42, 95, 58, 73, 91, 37, 88};
        System.out.println("\nOriginal scores: " + Arrays.toString(scores));

        // Convert to list
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int s : scores) scoreList.add(s);

        // Remove scores below 60 (can't easily do this with arrays!)
        // IMPORTANT: iterate backward when removing to avoid index shifting issues
        for (int i = scoreList.size() - 1; i >= 0; i--) {
            if (scoreList.get(i) < 60) {
                scoreList.remove(i);
            }
        }
        System.out.println("Passing scores: " + scoreList);

        // Convert back to array
        int[] passing = new int[scoreList.size()];
        for (int i = 0; i < scoreList.size(); i++) {
            passing[i] = scoreList.get(i);
        }
        System.out.println("As array: " + Arrays.toString(passing));
    }
}
