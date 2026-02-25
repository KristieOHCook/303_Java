import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// SOLUTION: Student Grade Processor

public class ExerciseSolution {
    public static void main(String[] args) {

        int[] rawScores = {92, 55, 78, 63, 88, 71, 49, 95, 82, 67};

        // Step 1: Convert int[] to ArrayList<Integer>
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int score : rawScores) {
            scoreList.add(score);
        }
        System.out.println("Original: " + scoreList);

        // Steps 2-4: Stream pipeline — filter, map, collect
        List<Integer> curvedPassing = scoreList.stream()
                .filter(s -> s >= 70)            // keep passing scores
                .map(s -> s + 5)                 // apply 5-point curve
                .collect(Collectors.toList());   // collect back to list

        System.out.println("Curved passing: " + curvedPassing);
        // [97, 83, 93, 76, 100, 87]

        // Step 5: sum using reduce
        int total = curvedPassing.stream()
                .reduce(0, (acc, s) -> acc + s);
        System.out.println("Sum of curved passing: " + total);
    }
}
