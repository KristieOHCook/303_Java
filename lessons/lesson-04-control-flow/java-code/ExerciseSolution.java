import java.util.Scanner;

// SOLUTION: Number Validator

public class ExerciseSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-100): ");
        int num = sc.nextInt();

        // Validate
        if (num < 1 || num > 100) {
            System.out.println("Invalid number!");
            sc.close();
            return;
        }

        // Categorize
        String category;
        if (num <= 25) {
            category = "Low";
        } else if (num <= 50) {
            category = "Medium";
        } else if (num <= 75) {
            category = "High";
        } else {
            category = "Very High";
        }

        System.out.printf("%d is %s%n", num, category);

        sc.close();
    }
}
