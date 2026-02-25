import java.util.Scanner;

// EXERCISE: Safe Calculator with Exception Handling
// Read two numbers and an operator from the user.
// Handle: invalid numbers (NumberFormatException), division by zero (ArithmeticException)

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TODO: Wrap everything in try/catch

        System.out.print("Enter first number: ");
        // TODO: Read as String, parse to int (can throw NumberFormatException)

        System.out.print("Enter second number: ");
        // TODO: Same

        System.out.print("Enter operator (+, -, *, /): ");
        // TODO: Read operator

        // TODO: Perform calculation
        // Handle: division by zero
        // Handle: invalid operator

        // TODO: Catch NumberFormatException and ArithmeticException separately

        sc.close();
    }
}
