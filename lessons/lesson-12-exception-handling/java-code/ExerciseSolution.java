import java.util.Scanner;

// SOLUTION: Safe Calculator

public class ExerciseSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(sc.nextLine());

            System.out.print("Enter operator (+, -, *, /): ");
            String op = sc.nextLine().trim();

            int result;
            switch (op) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;  // may throw ArithmeticException
                default:
                    System.out.println("Invalid operator: " + op);
                    return;
            }

            System.out.printf("%d %s %d = %d%n", num1, op, num2, result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
