// Array Manipulation Patterns (SBA-relevant)

public class ArrayManipulation {
    public static void main(String[] args) {

        int[] scores = {85, 92, 78, 95, 88, 76, 90};

        // Linear search — find an element
        int target = 78;
        int foundAt = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundAt = i;
                break;
            }
        }
        System.out.println("Found " + target + " at index: " + foundAt);

        // Modify element at index WITH VALIDATION (SBA pattern!)
        int index = 3;
        int newScore = 99;
        if (index >= 0 && index < scores.length) {
            scores[index] = newScore;
            System.out.println("Updated index " + index + " to " + newScore);
        } else {
            System.out.println("Invalid index: " + index);
        }

        // Count elements matching a condition
        int aboveAvg = 0;
        double sum = 0;
        for (int s : scores) sum += s;
        double avg = sum / scores.length;
        for (int s : scores) {
            if (s > avg) aboveAvg++;
        }
        System.out.printf("Average: %.1f, Scores above average: %d%n", avg, aboveAvg);
    }
}
