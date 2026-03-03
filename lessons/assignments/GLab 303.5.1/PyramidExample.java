public class PyramidExample {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // New line after each row
        }
    }
}