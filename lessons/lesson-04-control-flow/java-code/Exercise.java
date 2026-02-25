import java.util.Scanner;

// EXERCISE: Number Validator
// Read an integer. Validate it's between 1-100.
// Categorize: 1-25 = "Low", 26-50 = "Medium", 51-75 = "High", 76-100 = "Very High"

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-100): ");
        int num = sc.nextInt();

        // TODO: Validate the number is between 1 and 100
        // If invalid, print "Invalid number!" and DON'T continue


        // TODO: Categorize the number
        // 1-25 = "Low"
        // 26-50 = "Medium"
        // 51-75 = "High"
        // 76-100 = "Very High"


        sc.close();
    }
}
