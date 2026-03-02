public class OperatorsNumbersPracticeAssignment {
    public static void main(String[] args) {

        // TASK 1

        // Task 1: Declare x = 2, print binary, left shift by 1, and repeat for 9, 17, 88
        int x = 2;
        System.out.println("2 in binary: " + Integer.toBinaryString(x));
        // Prediction: Decimal will be 4, Binary string will be 100
        x = x << 1;
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Repeat for 9
        x = 9;
        System.out.println("\n9 in binary: " + Integer.toBinaryString(x));
        // Prediction: Decimal will be 18, Binary string will be 10010
        x = x << 1;
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Repeat for 17
        x = 17;
        System.out.println("\n17 in binary: " + Integer.toBinaryString(x));
        // Prediction: Decimal will be 34, Binary string will be 100010
        x = x << 1;
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Repeat for 88
        x = 88;
        System.out.println("\n88 in binary: " + Integer.toBinaryString(x));
        // Prediction: Decimal will be 176, Binary string will be 10110000
        x = x << 1;
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

        //TASK 2

        // Task 2: Declare x = 150, print binary, right shift by 2, repeat for 225, 1555, 32456
        x = 150;
        System.out.println("\n150 in binary: " + Integer.toBinaryString(x));
        // Prediction: Decimal will be 37 (150/4 = 37.5, rounded down), Binary will be 100101
        x = x >> 2;
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Repeat for 225
        x = 225;
        // Prediction: Decimal will be 56, Binary will be 111000
        x = x >> 2;
        System.out.println("225 shifted: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Repeat for 1555
        x = 1555;
        // Prediction: Decimal will be 388, Binary will be 110000100
        x = x >> 2;
        System.out.println("1555 shifted: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Repeat for 32456
        x = 32456;
        // Prediction: Decimal will be 8114, Binary will be 1111110110010
        x = x >> 2;
        System.out.println("32456 shifted: " + x + ", Binary: " + Integer.toBinaryString(x));

        //TASK 3

        // Task 3: Declares three int variables: x = 7, y = 17
        // --- BITWISE SECTION ---
        int a = 7;  // Binary: 00111
        int b = 17; // Binary: 10001

        // Prediction for AND: Only the last bit matches. Pred: 1 (Binary: 1)
        int resultAnd = a & b;
        System.out.println("\nBitwise AND (7 & 17): " + resultAnd);

        // Prediction for OR: Combines all bits. Pred: 23 (Binary: 10111)
        int resultOr = a | b;
        System.out.println("Bitwise OR (7 | 17): " + resultOr);

        // TASK 4

        // Task 4: Use the bitwise and operator to calculate the “or” value between x and y.
        // Postfix demonstration
        int val = 20;
        System.out.println("\nOriginal value: " + val);
        val++;
        System.out.println("After val++: " + val);

        // Three ways to increment
        a = 5;
        System.out.println("\nInitial a: " + a);
        a = a + 1;
        System.out.println("a = a + 1: " + a);
        a += 1;
        System.out.println("a += 1: " + a);
        a++;
        System.out.println("a++: " + a);

        // Prefix vs Postfix logic
        int xSum = 5;
        int ySum = 8;
        // ++xSum happens FIRST, then adds to ySum (6 + 8 = 14)
        int sum = ++xSum + ySum;
        System.out.println("\nSum with ++x: " + sum);

        xSum = 5; // reset x
        // xSum is used as 5 for the addition, then increments to 6 AFTER (5 + 8 = 13)
        sum = xSum++ + ySum;
        System.out.println("Sum with x++: " + sum);


        // TASK 5

        // Task 5: Declare an integer variable, assigns a number, and uses a postfix increment operator to increase the value.
        int myNumber = 10;
        System.out.println("\n--- Task 5: Postfix ---");
        System.out.println("Value before increment: " + myNumber);

        myNumber++; // This increases the value by 1

        System.out.println("Value after increment: " + myNumber);

        // TASK 6

        // Task 6: Declare an integer variable, demonstrate at least three ways to increment a variable by 1 and does this multiple times.
        int counter = 5;
        System.out.println("\n--- Task 6: Three Ways ---");
        System.out.println("Initial value: " + counter);

        // Way 1: Standard Addition
        counter = counter + 1;
        System.out.println("After counter = counter + 1: " + counter);

        // Way 2: Addition Assignment Operator
        counter += 1;
        System.out.println("After counter += 1: " + counter);

        // Way 3: Prefix Increment
        ++counter;
        System.out.println("After ++counter: " + counter);

        // TASK 7

        // Task 7: Declare two integer variables: x, and y, and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y
        //PREFIX VS POSTFIX SUM ---
        System.out.println("\n--- Task 7: Sum Comparison ---");
        int firstX = 5;
        int firstY = 8;

        // Prefix (++x): x becomes 6 FIRST, then 6 + 8 = 14
        int sumPrefix = ++firstX + firstY;
        System.out.println("Sum using ++x (Prefix): " + sumPrefix);

        // Reset x to 5 for a fair test
        int secondX = 5;
        int secondY = 8;

        // Postfix (x++): Uses 5 for the math FIRST (5 + 8 = 13), then x becomes 6
        int sumPostfix = secondX++ + secondY;
        System.out.println("Sum using x++ (Postfix): " + sumPostfix);


    }
}