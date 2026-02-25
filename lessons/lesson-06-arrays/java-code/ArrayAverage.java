// ⭐ SBA PATTERN: Calculate Average from Array
// This is directly from the SBA's calculateAvgAge method.

public class ArrayAverage {
    public static void main(String[] args) {

        int[] ages = {25, 27, 22, 30, 28, 26, 24, 31, 29, 23, 21}; // 11 players

        // Calculate average using enhanced for loop
        double sumOfAges = 0;
        for (int age : ages) {           // enhanced for — clean and readable
            sumOfAges += age;
        }
        double avgOfAges = sumOfAges / ages.length;

        // printf for formatted output (%.2f = 2 decimal places)
        System.out.printf("The average age of the team is %.2f%n", avgOfAges);

        // Note: sumOfAges must be double!
        // If it were int: 286 / 11 = 26 (integer division truncates!)
        // With double:    286.0 / 11 = 26.0
    }
}
