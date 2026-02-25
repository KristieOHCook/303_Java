import java.util.Scanner;

// Java — Scanner Demo (Getting User Input)
// In JS browser: prompt("Enter name")
// In JS Node:    readline
// In Java:       Scanner

public class ScannerDemo {
    public static void main(String[] args) {

        // Create a Scanner to read from keyboard
        Scanner sc = new Scanner(System.in);

        // Read a String
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Read an int
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Read a double
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        // Print results
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // printf for formatted output (like C)
        System.out.printf("Hello %s, you are %d years old with a %.1f GPA%n",
                name, age, gpa);

        sc.close(); // Good practice: close the scanner
    }
}
