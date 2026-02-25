import java.util.Scanner;

// SOLUTION: Reverse a string and count vowels

public class ExerciseSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed: " + reversed);

        // Count vowels
        String lower = input.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if ("aeiou".indexOf(ch) >= 0) {
                vowelCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);

        sc.close();
    }
}
