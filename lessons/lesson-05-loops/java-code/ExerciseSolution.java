// SOLUTION: Reverse a Number

public class ExerciseSolution {
    public static void main(String[] args) {

        int num = 12345;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed: " + reversed); // 54321

        // TRACE:
        // num=12345 → digit=5, reversed=0*10+5=5,      num→1234
        // num=1234  → digit=4, reversed=5*10+4=54,      num→123
        // num=123   → digit=3, reversed=54*10+3=543,    num→12
        // num=12    → digit=2, reversed=543*10+2=5432,  num→1
        // num=1     → digit=1, reversed=5432*10+1=54321, num→0 STOP
    }
}
