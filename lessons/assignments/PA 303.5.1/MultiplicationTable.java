public class MultiplicationTable {
    public static void main(String[] args) {
        // Outer loop for rows 1 to 12
        for (int i = 1; i <= 12; i++) {
            // Inner loop for columns 1 to 12
            for (int j = 1; j <= 12; j++) {
                // Use printf to align numbers in neat columns
                System.out.printf("%4d", i * j);
            }
            // New line after each row is complete
            System.out.println();
        }
    }
}
