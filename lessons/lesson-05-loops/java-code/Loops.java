// Java — Loops

public class Loops {
    public static void main(String[] args) {

        // for loop — same as JS, just int instead of let
        for (int i = 0; i < 5; i++) {
            System.out.println("for: " + i);
        }

        // while loop — identical to JS
        int count = 5;
        while (count > 0) {
            System.out.println("while: " + count);
            count--;
        }

        // do-while — identical to JS
        int x = 0;
        do {
            System.out.println("do-while: " + x);
            x++;
        } while (x < 3);

        // Enhanced for (like JS for...of, but uses COLON not "of")
        String[] fruits = {"apple", "banana", "cherry"};
        for (String fruit : fruits) {   //  ← colon, not "of"
            System.out.println("enhanced for: " + fruit);
        }

        // break and continue — same as JS
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue;
            if (i == 7) break;
            System.out.println(i);
        }
    }
}
