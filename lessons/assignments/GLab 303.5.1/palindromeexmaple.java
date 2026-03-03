import java.util.Scanner; // Add this line!

public class palindromeexmaple {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number:");
        original = in.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }
    }
}
