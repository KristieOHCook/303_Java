// Java — Exception Handling

public class ExceptionDemo {
    public static void main(String[] args) {

        // ========================
        // Basic try/catch/finally
        // ========================
        try {
            int result = 10 / 0;  // throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } finally {
            System.out.println("Finally always runs");
        }


        // ========================
        // Multiple catch blocks (can't do this in JS!)
        // ========================
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }


        // ========================
        // Throwing exceptions (like JS throw new Error())
        // ========================
        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }


        // ========================
        // NumberFormatException (common in SBA-style code)
        // ========================
        try {
            int num = Integer.parseInt("not a number");
        } catch (NumberFormatException e) {
            System.out.println("Parse error: " + e.getMessage());
        }
    }

    // Method that throws — like improving the SBA validation to use exceptions
    public static void validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be 0-150, got: " + age);
        }
        System.out.println("Valid age: " + age);
    }
}
