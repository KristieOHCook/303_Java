import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second positive integer: ");
        int n2 = input.nextInt();

        int gcd = 1; // 1 is always a common divisor
        int k = 2;   // Start checking from 2

        // Check divisors until k exceeds either n1 or n2
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; // Found a new, larger common divisor
            }
            k++;
        }
        System.out.println("The gcd for " + n1 + " and " + n2 + " is " + gcd);
    }
}
