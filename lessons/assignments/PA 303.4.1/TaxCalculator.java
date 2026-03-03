import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0: Single, 1: Married Jointly, 2: Married Separately, 3: Head of Household");
        int status = sc.nextInt();
        double income = sc.nextDouble();
        double tax = 0;

        if (status == 0) { // Single Column
            if (income <= 8350) tax = income * 0.10;
            else if (income <= 33950) tax = (8350 * 0.10) + ((income - 8350) * 0.15);
            else if (income <= 82250) tax = (8350 * 0.10) + (25600 * 0.15) + ((income - 33950) * 0.25);
            // Add remaining brackets from the table...

        } else if (status == 1) { // Married Filing Jointly Column
            if (income <= 16700) tax = income * 0.10;
            else if (income <= 67900) tax = (16700 * 0.10) + ((income - 16700) * 0.15);
            else if (income <= 137050) tax = (16700 * 0.10) + (51200 * 0.15) + ((income - 67900) * 0.25);
            // Add remaining brackets from the table...
        }

        System.out.printf("Estimated Tax: $%.2f%n", tax);
        sc.close();
    }
}