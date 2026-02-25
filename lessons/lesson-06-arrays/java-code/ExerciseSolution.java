// SOLUTION: Array Stats

public class ExerciseSolution {
    public static void main(String[] args) {

        int[] scores = {85, 92, 78, 95, 88, 76, 90, 83, 97, 71};

        // Find max
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("Max: " + max);

        // Find min
        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        System.out.println("Min: " + min);

        // Calculate average
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = sum / scores.length;
        System.out.printf("Average: %.2f%n", avg);
    }
}
