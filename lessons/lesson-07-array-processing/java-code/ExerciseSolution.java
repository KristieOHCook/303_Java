// SOLUTION: Grade Manager

public class ExerciseSolution {
    public static void main(String[] args) {

        double[] grades = {88.5, 72.0, 95.5, 64.0, 81.0, 90.0, 77.5, 85.0};

        // 1. Calculate average
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        double avg = sum / grades.length;
        System.out.printf("Class average: %.2f%n", avg);

        // 2. Print grades above average
        System.out.println("Grades above average:");
        for (double g : grades) {
            if (g > avg) {
                System.out.printf("  %.1f%n", g);
            }
        }

        // 3. Replace grades
        replaceGrade(grades, 2, 100.0);   // valid
        replaceGrade(grades, 20, 100.0);  // invalid
    }

    public static void replaceGrade(double[] grades, int index, double newGrade) {
        // Guard clause — validate first
        if (index < 0 || index >= grades.length) {
            System.out.println("Invalid index: " + index);
            return;
        }
        double old = grades[index];
        grades[index] = newGrade;
        System.out.printf("Replaced grade at index %d: %.1f → %.1f%n", index, old, newGrade);
    }
}
